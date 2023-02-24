package main.java;

import org.junit.Test;

import main.java.WordFrequency;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordFrequencyTest {
    @Test
    public void wordFrequencyHappyPath() {
        WordFrequency wordFrequency = new WordFrequency("the cat is in the bag");
        List<String> result = wordFrequency.getWordFrequencyCount();
        assertEquals("2 the", result.get(0));
        assertEquals("1 is", result.get(1));
        assertEquals("1 in", result.get(2));
        assertEquals("1 cat", result.get(3));
        assertEquals("1 bag", result.get(4));
    }

    @Test
    public void wordFrequencyOneWord() {
        WordFrequency wordFrequency = new WordFrequency("the");
        List<String> result = wordFrequency.getWordFrequencyCount();
        assertEquals("1 the", result.get(0));
    }

    @Test
    public void wordFrequencyEmptyString() {
        WordFrequency wordFrequency = new WordFrequency("  ");
        List<String> result = wordFrequency.getWordFrequencyCount();
        assertEquals(0, result.size());
    }

    @Test
    public void wordFrequencyNull() {
        WordFrequency wordFrequency = new WordFrequency(null);
        List<String> result = wordFrequency.getWordFrequencyCount();
        assertEquals(0, result.size());
    }

    @Test
    public void wordFrequencyHappyPathRandomOrder() {
        WordFrequency wordFrequency = new WordFrequency("the the bag is in cat");
        List<String> result = wordFrequency.getWordFrequencyCount();
        assertEquals("2 the", result.get(0));
        assertEquals("1 is", result.get(1));
        assertEquals("1 in", result.get(2));
        assertEquals("1 cat", result.get(3));
        assertEquals("1 bag", result.get(4));
    }


}
