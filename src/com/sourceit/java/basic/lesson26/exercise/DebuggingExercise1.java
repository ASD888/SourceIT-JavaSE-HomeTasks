package com.sourceit.java.basic.lesson26.exercise;

class DebuggingExercise1 {

    public static void main(String[] args) {

	int[] numbers = new int[4];

	for (int i = 0; i < 4; i++) {
	    System.out.println("Try to insert " + i + " into the array at position " + i);
	    numbers[i] = i;
	    System.out.println("Successful");
	}

	System.out.print("This is what is in the array: ");
	for (Integer x : numbers) {
	    System.out.print(x + " ");
	}
    }
}