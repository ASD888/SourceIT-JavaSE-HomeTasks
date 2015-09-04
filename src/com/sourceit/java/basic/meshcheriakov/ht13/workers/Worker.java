package com.sourceit.java.basic.meshcheriakov.ht13.workers;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class Worker {

    private String firstName;
    private String lastName;

    public Worker(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    @Override
    public String toString() {
	return firstName + " " + lastName;
    }

}
