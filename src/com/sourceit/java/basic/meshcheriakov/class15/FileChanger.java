package com.sourceit.java.basic.meshcheriakov.class15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         - Read the list of countries from Country.txt;
 *         - Sort the countries alphabetically;
 *         - Add a capital letter to every group of countries and save to new file
 */
public class FileChanger {

    public static void main(String[] args) {
	FileChanger fileChanger = new FileChanger();
	List<String> arr = fileChanger.readFromFile("Country.txt");
	arr = fileChanger.sortAndAddLetters(arr);
	fileChanger.writeToFile("CountrySort", arr);
    }

    public List<String> sortAndAddLetters(List<String> list) {
	HashSet<String> temp = new HashSet<>();
	for (String x : list) {
	    if (x.length() > 0) {
		char a = x.charAt(0);
		temp.add(String.valueOf(a));
	    }
	}
	list.addAll(temp);
	Collections.sort(list);
	return list;
    }

    public List<String> readFromFile(String fileName) {
	ArrayList<String> countryList = new ArrayList<>();
	Path path = Paths.get("242446_02.txt");
	try (BufferedReader reader = Files.newBufferedReader(path)) {
	    while (reader.ready()) {
		countryList.add(reader.readLine().trim());
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
	return countryList;
    }

    public void writeToFile(String fileName, List<String> list) {
	Path path = Paths.get(fileName);
	if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
	    try {
		Files.delete(path);
	    } catch (IOException ex) {
		ex.printStackTrace();
	    }
	}
	try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE)) {
	    for (String x : list) {
		if (x.length() > 1) {
		    writer.append("\t" + x + "\n");
		} else {
		    writer.append(x + "\n");
		}
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
    }
}
