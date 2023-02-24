package main.java;

import java.util.*;

public class WordFrequency {
    private String inputString;

    public WordFrequency(String inputString) {
        this.inputString = inputString;
    }

    public List<String> getWordFrequencyCount() {
        Map<String, Integer> resultMap = new TreeMap<>(Collections.reverseOrder());
        List<String> resultList = new ArrayList<>();
        if (inputString == null || inputString.isEmpty()) {
            return resultList;
        }
        String words[] = inputString.split(" ");
        for (String word : words) {
            if (!resultMap.containsKey(word)) {
                resultMap.put(word, 1);
            } else {
                resultMap.put(word, resultMap.get(word) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry :
                resultMap.entrySet()) {
            resultList.add(entry.getValue() +
                    " " + entry.getKey());
        }
        return resultList;
    }

}
