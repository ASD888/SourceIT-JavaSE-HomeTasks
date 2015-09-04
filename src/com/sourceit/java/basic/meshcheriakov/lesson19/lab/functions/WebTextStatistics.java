package com.sourceit.java.basic.meshcheriakov.lesson19.lab.functions;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sourceit.java.basic.meshcheriakov.lesson19.lab.functions.model.WebContentStatistics;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class WebTextStatistics extends WebContentStatistics {

    private String[] functions = { "Save web page", "Display title", "Check a word on existing",
	    "List all url's on the page" };

    private String getTitle() {
	StringBuilder sb = new StringBuilder();
	sb.append("Title: ").append(
		webContent.substring(webContent.indexOf("<title>") + 7,
			webContent.indexOf("</title>")));
	return sb.toString();

    }

    private boolean checkWordOnExisting(String word) {
	return webContent.contains(word);
    }

    private List<String> getAllUrls() {
	Pattern p = Pattern.compile("https?://([//da-z//.-]+)\\.([a-z\\.]{2,6})([/\\w\\.-]*)*/?");
	Matcher m = p.matcher(webContent);
	ArrayList<String> urlsList = new ArrayList<>();
	while (m.find()) {
	    urlsList.add(webContent.substring(m.start(), m.end()));
	}
	return urlsList;
    }

    private void savePage() {
	String fileName = "webpage";
	Path path;
	int n = 1;
	while (true) {
	    path = Paths.get(fileName + n + ".html");
	    if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
		break;
	    }
	    n++;
	}
	try (BufferedWriter writer = Files.newBufferedWriter(path)) {
	    writer.append(webContent);
	    StringBuilder sb = new StringBuilder();
	    sb.append("Webpage has saved\n");
	    sb.append("File name: ");
	    sb.append(path);
	    sb.append("\n");
	    sb.append("File location: ");
	    sb.append(path.toAbsolutePath());
	    System.out.println(sb);
	} catch (IOException e) {
	    System.out.println("Webpage writing was not succeed");
	}
    }

    @Override
    public String[] getFunctions() {
	return functions;
    }

    @Override
    public void executeCommand(int choise) {
	switch (choise) {

	case 1:
	    savePage();
	    break;

	case 2:
	    System.out.println(getTitle());
	    break;

	case 3:
	    String word = null;
	    System.out.println("Enter a word to check");
	    try (Scanner input = new Scanner(System.in)) {
		word = input.next();
	    } catch (Exception ex) {
		ex.printStackTrace();
	    }
	    if (checkWordOnExisting(word)) {
		System.out.println("Word was found");
	    } else {
		System.out.println("Word wasn't found");
	    }
	    break;

	case 4:
	    List<String> urlsList = getAllUrls();
	    for (String x : urlsList) {
		System.out.println(x);
	    }
	    break;
	}
    }

}
