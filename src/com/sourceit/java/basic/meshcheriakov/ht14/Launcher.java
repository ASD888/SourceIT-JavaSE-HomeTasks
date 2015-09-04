package com.sourceit.java.basic.meshcheriakov.ht14;

/**
 * 
 * @author Artur Meshcheriakov
 *
 *         TASK:
 *         - Create a program that accepts three parameters. One string and two integers
 *         - Program should display a part of source string on a screen. Two integers are the
 *         first and last characters of substring.
 * 
 *         Acceptable output:
 *         - resultant string;
 *         - operating instructions;
 */
public class Launcher {

    private static String text;
    private static int firstParameter;
    private static int secondParameter;

    public static void main(String[] args) {
	try {
	    checkConsoleParameters(args);
	    System.out.println(text.substring(firstParameter, secondParameter));
	} catch (Exception ex) {
	    System.out.println(ex.getMessage());
	} finally {
	    System.out.println("End of program");
	}
    }

    private static void checkConsoleParameters(String[] args) throws Exception {

	if (args.length < 2 || args.length > 3) {
	    throw new Exception("Error: Must be 2 or 3 parameters");
	}

	text = args[0];

	try {
	    firstParameter = Integer.parseInt(args[1]);
	} catch (NumberFormatException ex) {
	    throw new Exception("Error: Second parameter must be integer");
	}

	try {
	    if (args.length == 3) {
		secondParameter = Integer.parseInt(args[2]);
	    } else if (args.length == 2) {
		secondParameter = text.length();
	    }
	} catch (NumberFormatException ex) {
	    throw new Exception("Error: Third parameter must be integer");
	}

	if (firstParameter < 0) {
	    throw new Exception("Error: second parameter must be bigger than 0");
	}

	if (secondParameter < 0) {
	    throw new Exception("Error: third parameter must be bigger than 0");
	}

	if (text.length() < firstParameter) {
	    throw new Exception("Error: second parameter bigger than length of string");
	}

	if (text.length() < secondParameter) {
	    throw new Exception("Error: third parameter bigger than length of string");
	}

	if (firstParameter > secondParameter) {
	    throw new Exception("Error: third parameter must be bigger than second");
	}

    }
}
