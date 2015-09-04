package com.sourceit.java.basic.meshcheriakov.lesson19.lab;

import com.sourceit.java.basic.meshcheriakov.lesson19.lab.functions.WebTextStatistics;
import com.sourceit.java.basic.meshcheriakov.lesson19.lab.userinterface.UI;

/**
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         - Create a blank class(com.sourceit.java.basic.%username%.lesson19.lab.WGet);
 *         - Create a console application with instructions;
 *         - Example of how to get an html page (WGet.java);
 *         - Launch a program using a web address as a parameter;
 *         - Otherwise ask to enter some
 *         a) Allow the user to ignore http://
 *         - Offer a few options of what to do with the web page
 *         a) Web server available?
 *         b) save page
 *         c) display a title of a page <title>Java Basic Course</title>
 *         d) find some word e) list all url's
 */
public class WGet {

    public static void main(String[] args) {

	String command = null;
	if (args.length == 0) {
	    getInstructions();
	    return;
	} else {
	    command = args[0];
	}

	if (command.equals("-tm")) {
	    new UI(new WebTextStatistics()).start();
	    return;
	} else if (command.equals("-ver")) {
	    System.out.println("WGet version 1.0");
	    return;
	} else {
	    System.out.println("Error: wrong option");
	    return;
	}
    }

    public static void getInstructions() {
	StringBuilder sb = new StringBuilder();
	sb.append("Usage: java -jar WGet.jar [-option]\n");
	sb.append("where options include:\n");
	sb.append("\t -tm\t start the mode with interactive\n\t\t menu for text statistics of web-page\n");
	sb.append("\t -mm\t start the mode with interactive\n\t\t menu for working with music pages\n");
	sb.append("\t -ver\t show current version of WGet\n");

	System.out.println(sb);
    }
}
