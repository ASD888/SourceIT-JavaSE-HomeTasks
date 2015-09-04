package com.sourceit.java.basic.meshcheriakov.class10.anagram;

import java.util.regex.Pattern;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         - Write a program that figures out whether one string is an anagram of another
 *         string. The program should ignore white space and punctuation.
 *         - An anagram is a word or a phrase made by transposing the letters of
 *         another word or phrase;
 *         For example:
 *         "parliament" is an anagram of "partial men"
 *         "software" is an anagram of "swear oft"
 */
public class Anagram {

    public static void main(String[] args) {
	System.out.println(isAnagram("Pa#$     r@#lI@#$@aM%#e%#$nt", "p@#a@$#rti__a:n m@#en"));
	System.out.println(isAnagram("SoftwARE#  $%", "S$W@E#@AR o%@f$@t"));
	System.out.println(isAnagram("Tree", "Tree"));
	System.out.println(isAnagram("a", "acr"));
	System.out.println(isAnagram("ROAD", ""));

    }

    public static boolean isAnagram(String someString, String anotherString) {
	boolean check = false;
	someString = someString.replaceAll("\\W|_|\\s", "");
	anotherString = anotherString.replaceAll("\\W|_|\\s", "");

	if (!Pattern.compile("^\\D+$").matcher(someString).matches() || someString.equals("")
		|| someString.length() == 1) {
	    System.out.print("\"Error: first string is not valid!\" ");
	} else if (!Pattern.compile("^\\D+$").matcher(anotherString).matches()
		|| anotherString.equals("") || anotherString.length() == 1) {
	    System.out.print("\"Error: second string is not valid!\" ");
	} else if (someString.compareToIgnoreCase(anotherString) == 0) {
	    System.out.print("\"Strings are similar!\" ");
	} else if (someString.length() != anotherString.length()) {
	    check = false;
	} else {
	    for (int i = 0; i < someString.length(); i++) {
		check = someString.contains(String.valueOf(anotherString.charAt(i)));
	    }
	}
	return check;
    }
}
