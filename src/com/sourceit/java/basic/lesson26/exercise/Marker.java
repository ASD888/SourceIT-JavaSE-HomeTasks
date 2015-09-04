package com.sourceit.java.basic.lesson26.exercise;

class Marker {

    public Marker() {
	// no initialisation to do
    }

    public void printGrade(int mark) {
	if (mark >= 85) {
	    System.out.println("High Distinction");
	} else if (mark >= 75) {
	    System.out.println("Distinction");
	} else if (mark >= 65) {
	    System.out.println("Credit");
	} else if (mark >= 50) {
	    System.out.println("Pass");
	} else if (mark >= 45) {
	    System.out.println("Concessional Pass");
	} else if (mark < 45) {
	    System.out.println("Fail");
	}
    }
}