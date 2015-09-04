package com.sourceit.java.basic.meshcheriakov.lesson19.lab.userinterface;

import java.util.Scanner;

import com.sourceit.java.basic.meshcheriakov.lesson19.lab.functions.behavior.IFunctions;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class UI {

    private IFunctions iFunctions;

    public UI(IFunctions iFunctions) {
	this.iFunctions = iFunctions;
    }

    public void start() {
	int userChoise = -1;
	try (Scanner input = new Scanner(System.in)) {
	    while (true) {
		System.out.println("Enter an URL (Example: www.google.com) or type exit for quit");
		String webAddress = input.next();

		if (webAddress.toLowerCase().equals("exit")) {
		    return;
		}
		if (iFunctions.getWebPageContent(webAddress)) {
		    System.out.println("Connection was determined");
		    break;
		}
	    }
	    System.out.println("Select a number of step, that you want to do next");
	    iFunctions.printCommands(iFunctions.getFunctions());
	    while (true) {
		try {
		    userChoise = Integer.parseInt(input.next());
		    if (userChoise < 1 && userChoise > iFunctions.getFunctions().length) {
			throw new Exception();
		    }
		    break;
		} catch (Exception ex) {
		    System.out.println("Error: wrong command");
		}
	    }
	    iFunctions.executeCommand(userChoise);
	} catch (Exception ex) {
	    ex.getStackTrace();
	}
    }
}
