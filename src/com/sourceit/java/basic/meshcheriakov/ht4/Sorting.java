package com.sourceit.java.basic.meshcheriakov.ht4;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         Realize the bubble sort algorithm;
 *         Test data: the array of integer, contains 10 elements;
 */
public class Sorting {

    public static void main(String[] args) {
	int[] intAr = { 76, -33, -2, 999, 165, 163, 55, 69, 0, 94 };
	sortArray(intAr);
	for (int x : intAr) {
	    System.out.print(x + " ");
	}
    }

    public static void sortArray(int[] intArray) {
	int tmp;
	int numberofexchange = 0;
	if (intArray.length == 0) {
	    System.out.println("The array is empty!");
	} else {
	    for (int i = 0; i < intArray.length; i++) {
		for (int j = intArray.length - 1; j >= i; j--) {
		    if (intArray[i] > intArray[j]) {
			numberofexchange++;
			tmp = intArray[i];
			intArray[i] = intArray[j];
			intArray[j] = tmp;
		    }
		}
	    }
	    System.out.println("Number of exchanges: " + numberofexchange);
	}
    }
}
