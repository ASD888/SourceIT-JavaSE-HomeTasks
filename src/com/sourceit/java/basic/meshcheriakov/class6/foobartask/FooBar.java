package com.sourceit.java.basic.meshcheriakov.class6.foobartask;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         - Create a function fooBar, that accepts integer n and prints all even numbers
 *         from 0 to n in a new line
 *         Additional conditions:
 *         - if number divides 3 without residue of division print "Foo";
 *         - if number divides 5 without residue of division print "Bar";
 *         - if number divides 3 and 5 without residue of division print "FooBar";
 * 
 *         Output example:
 *         1
 *         2
 *         Foo
 *         4
 *         Bar
 *         Foo
 *         7
 *         8
 *         Foo
 *         Bar
 *         11
 *         Foo
 *         13
 *         14
 *         FooBar
 */
public class FooBar {

    public static void main(String[] args) {
	fooBar(30);
    }

    public static void fooBar(int n) {
	if (n < 0) {
	    System.out.println("Digit must be bigger than 0");
	}
	for (int i = 1; i <= n; i++) {
	    if (i % 3 == 0 && i % 5 == 0) {
		System.out.println("FooBar");
	    } else if (i % 3 == 0) {
		System.out.println("Foo");
	    } else if (i % 5 == 0) {
		System.out.println("Bar");
	    } else {
		System.out.println(i);
	    }
	}
    }
}
