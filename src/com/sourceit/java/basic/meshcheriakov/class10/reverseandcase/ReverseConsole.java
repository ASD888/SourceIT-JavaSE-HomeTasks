package com.sourceit.java.basic.meshcheriakov.class10.reverseandcase;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         - Create a program that revert the text;
 *         - Fix the letters case;
 */
public class ReverseConsole {

    public static void main(String[] args) {

	char[] charArray = args[0].toLowerCase().toCharArray();

	StringBuilder result = new StringBuilder();

	for (int i = charArray.length - 1; i >= 0; i--) {
	    if (i == charArray.length - 1) {
		charArray[charArray.length - 1] = Character
			.toUpperCase(charArray[charArray.length - 1]);
	    }
	    result.append(charArray[i]);
	}
	System.out.println(result);
    }

}
