package com.sourceit.java.basic.meshcheriakov.lesson19.lab.functions.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.sourceit.java.basic.meshcheriakov.lesson19.lab.functions.behavior.IFunctions;

/**
 * 
 * @author Artur Meshcheriakov
 */
public abstract class WebContentStatistics implements IFunctions {

    protected URL url;
    protected String webContent;

    @Override
    public boolean getWebPageContent(String webAddress) {
	boolean result = true;
	StringBuilder sb = new StringBuilder();
	try {

	    url = new URL("http://" + webAddress);
	    try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),
		    StandardCharsets.UTF_8))) {
		while (reader.ready()) {
		    sb.append(reader.readLine()).append("\n");
		}
		webContent = sb.toString();
	    } catch (Exception ex) {
		result = false;
		System.out
			.println("Server does not respond. Please check the address and try again!");
	    }
	} catch (MalformedURLException ex) {
	    ex.getStackTrace();
	    System.out.println("Something bad happened!");
	}
	return result;
    }

    @Override
    public void printCommands(String[] functionsArray) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < functionsArray.length; i++) {
	    sb.append(i + 1).append(") ").append(functionsArray[i]).append("\n");
	}
	System.out.println(sb);

    }
}
