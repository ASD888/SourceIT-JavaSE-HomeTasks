package com.sourceit.java.basic.meshcheriakov.ht10.person;

import java.text.NumberFormat;
import java.util.Locale;

import com.sourceit.java.basic.meshcheriakov.ht10.person.behavior.ICreditworthiness;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class Person implements ICreditworthiness {

    private String firstName;
    private String lastName;
    private long cash = 0;

    public Person(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
	return firstName;
    }

    @Override
    public String getLastName() {
	return lastName;
    }

    public long getCash() {
	return cash;
    }

    public long withdrawCash(long value) {
	long result = 0;
	if (cash - value >= 0) {
	    cash -= value;
	    result = value;
	} else {
	    result = -1;
	}
	return result;
    }

    public void addCash(long cash) {
	this.cash += cash;
    }

    public void printCash() {
	NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
	float c = cash / 100;
	System.out.println(firstName + " " + lastName + " has " + nf.format(c));
    }
}
