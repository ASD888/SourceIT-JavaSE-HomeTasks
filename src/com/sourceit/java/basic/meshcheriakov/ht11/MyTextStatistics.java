package com.sourceit.java.basic.meshcheriakov.ht11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.sourceit.java.basic.Lesson11.TextStatistics;

/**
 * @author Artur Meshcheriakov
 *
 *         TASK:
 *         Implement an interface TextStatistics
 *         {@code com.sourceit.java.basic.Lesson11.TextStatistics}
 */
public class MyTextStatistics extends TextStatistics {

    private Map<Character, Integer> charMap = new TreeMap<Character, Integer>();
    private List<String> wordsList = new ArrayList<String>();
    private int mostPopularChar = 0;
    private int leastPopularChar = Integer.MAX_VALUE;

    public MyTextStatistics(String text) {
	super(text);
	createCharMap();
	createWordsList();
	countMostPopularCharCount();
	countLeastPopularCharCount();
    }

    private void createCharMap() {
	String workText = getText().toLowerCase().replaceAll("\\n|\\t", "");
	char[] workCharArray = workText.toCharArray();
	for (Character x : workCharArray) {
	    charMap.put(x, getCharCount(x));
	}
    }

    private void createWordsList() {
	String workText = getText().toLowerCase().replaceAll("\\n|\\t", " ");
	String[] stringArray = workText.trim().split("\\s+");
	wordsList = Arrays.asList(stringArray);
    }

    private void countMostPopularCharCount() {
	for (Integer value : charMap.values()) {
	    if (value > mostPopularChar) {
		mostPopularChar = value;
	    }
	}
    }

    private void countLeastPopularCharCount() {
	if (charMap.isEmpty()) {
	    leastPopularChar = 0;
	} else {
	    for (Integer value : charMap.values()) {
		if (value < leastPopularChar) {
		    leastPopularChar = value;
		}
	    }
	}
    }

    @Override
    public int getCharFrequency(char c) {
	String workText = getText().toLowerCase().replaceAll("\\n|\\t", "");
	int result = 0;
	if (workText.length() > 0) {
	    result = (getCharCount(c) * 100 / workText.length());
	}
	return result;
    }

    @Override
    public int getCharCount(char c) {
	String workText = getText().toLowerCase().replaceAll("\\n|\\t", "");
	c = Character.toLowerCase(c);
	int result = 0;
	for (int i = 0; i < workText.length(); i++) {
	    if (workText.charAt(i) == c) {
		result++;
	    }
	}
	return result;
    }

    @Override
    public Map<Character, Integer> getChars() {
	return charMap;
    }

    @Override
    public List<String> words() {
	return wordsList;
    }

    @Override
    public int getMostPopularCharCount() {
	return mostPopularChar;
    }

    @Override
    public int getLeastPopularCharCount() {
	return leastPopularChar;
    }

    @Override
    public char[] getCharByCount(int count) {
	ArrayList<Character> tempList = new ArrayList<Character>();
	for (Map.Entry<Character, Integer> pair : charMap.entrySet()) {
	    if (pair.getValue().equals(count)) {
		tempList.add(pair.getKey());
	    }
	}
	char[] result = new char[tempList.size()];
	for (int i = 0; i < tempList.size(); i++) {
	    result[i] = tempList.get(i);
	}
	return result;
    }

}
