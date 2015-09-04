package com.sourceit.java.basic.meshcheriakov.ht7;

import com.sourceit.exercise.IntArrays;

/**
 * 
 * @author Artur Meshcheriakov
 */

public class MyArrays implements IntArrays {

    int[] array = new int[0];
    private boolean newArray = true;

    @Override
    public void add(int arg0) {
	if (newArray) {
	    array = new int[1];
	    array[0] = arg0;
	    newArray = false;
	} else {
	    int[] arrayTemp = new int[array.length];
	    for (int i = 0; i < array.length; i++) {
		arrayTemp[i] = array[i];
	    }
	    array = new int[arrayTemp.length + 1];
	    for (int i = 0; i < arrayTemp.length; i++) {
		array[i] = arrayTemp[i];
	    }
	    array[array.length - 1] = arg0;
	}

    }

    @Override
    public int get(int arg0) {

	return array[arg0];
    }

    @Override
    public int size() {

	return array.length;
    }

}
