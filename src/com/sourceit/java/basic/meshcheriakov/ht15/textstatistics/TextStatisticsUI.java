package com.sourceit.java.basic.meshcheriakov.ht15.textstatistics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.sourceit.java.basic.meshcheriakov.ht11.MyTextStatistics;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         Use class from task #11 and append a text statistic to specified text file.
 *         Specify a text file as a command line argument;
 */
public class TextStatisticsUI {

    private Path path;
    private MyTextStatistics mts;

    @SuppressWarnings("resource")
    private void getFileName() throws Exception {
	try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
	    boolean checker = true;
	    while (checker) {
		System.out.println("Type file name or press Enter for exit");
		String result = reader.readLine();
		path = Paths.get(result);
		if (result.isEmpty()) {
		    throw new Exception("End of program");
		} else if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
		    System.out.println("File wasn't found");
		} else if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
		    checker = false;
		} else {
		    System.out.println("File wasn't found");
		}
	    }
	} catch (IOException ex) {
	    ex.getMessage();
	}
    }

    private String readFile() throws Exception {
	String result = null;
	try (BufferedReader reader = Files.newBufferedReader(path)) {
	    StringBuilder sb = new StringBuilder();
	    while (reader.ready()) {
		sb.append(reader.readLine() + "\n");
	    }
	    result = sb.toString();
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
	if (result.equals("")) {
	    throw new Exception("Text wasn't found");
	}
	return result;
    }

    private String createTextStatistics() {
	StringBuilder sb = new StringBuilder();
	sb.append("Statistics:\n");
	sb.append("-Count of most popular character: ");
	sb.append(mts.getMostPopularCharCount());
	sb.append("\n");
	sb.append("-Count of least popular character: ");
	sb.append(mts.getLeastPopularCharCount());
	sb.append("\n");
	String mostPopular = String.valueOf(mts.getCharByCount(mts.getMostPopularCharCount()));
	if (mostPopular.equals(" ")) {
	    mostPopular = "space";
	}
	sb.append("-Most popular character is ");
	sb.append(mostPopular);
	sb.append("\n");
	String leastPopular = String.valueOf(mts.getCharByCount(mts.getLeastPopularCharCount()));
	if (leastPopular.equals(" ")) {
	    leastPopular = "space";
	}
	sb.append("-Least popular character is ");
	sb.append(leastPopular);
	sb.append("\n");
	String text = mts.getText().replace("\n", "");
	sb.append("-Number of all characters: ");
	sb.append(text.length());
	sb.append("\n");
	sb.append("-Number of words: ");
	sb.append(mts.words().size());
	sb.append("\n");
	sb.append("-Number of unique characters: ");
	sb.append(mts.getChars().size());
	sb.append("\n");
	sb.append("//--------------------------\n");
	sb.append(mts.getText());
	return sb.toString();
    }

    private void writeStatisticsToFile() {
	String finalResult = createTextStatistics();
	try (BufferedWriter writer = Files.newBufferedWriter(path,
		StandardOpenOption.TRUNCATE_EXISTING)) {
	    writer.append(finalResult);
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
    }

    public void start() {
	String text = null;
	try {
	    getFileName();
	    text = readFile();
	} catch (Exception ex) {
	    System.out.println(ex.getMessage());
	    return;
	}
	mts = new MyTextStatistics(text);
	writeStatisticsToFile();
    }

    public static void main(String[] args) {
	new TextStatisticsUI().start();
    }
}
