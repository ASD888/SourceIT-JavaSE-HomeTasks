package com.sourceit.java.basic.meshcheriakov.class10.console;

/**
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         - Create a program that reads an unspecified number of intefer arguments from
 *         the command line and adds them together.
 *         For example, suppose that you enter the following:
 *         "java Adder 1 3 2 10"
 * 
 *         The program should display 16 and then exit. The program should display an error message
 *         if the user enters only one argument.
 */
public class Console {

    public static void main(String[] args) {
	int m = 0;
	if (args.length == 1) {
	    System.out.println("error");
	} else {
	    for (int i = 0; i < args.length; i++) {
		m = m + Integer.valueOf(args[i]);
	    }
	    System.out.println(m);
	}

    }

}
