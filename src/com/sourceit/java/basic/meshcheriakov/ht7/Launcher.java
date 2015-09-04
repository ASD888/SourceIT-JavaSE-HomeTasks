package com.sourceit.java.basic.meshcheriakov.ht7;

import com.sourceit.exercise.IntArrays;

/**
 * 
 * @author Artur Meshcheriakov
 *
 *         TASK:
 *         Implement the IntArrays interface situated in exercice.jar;
 * 
 *         Input:
 *         IntArrays myArr = new MyArrays;
 *         myArr.add(1);
 *         myArr.add(150);
 * 
 *         System.out.println(myArr.size());
 *         System.out.println(myArr.get(1));
 * 
 *         Output:
 *         > 2
 *         > 150
 */
public class Launcher {

    public static void main(String[] args) {
	IntArrays myArr = new MyArrays();

	myArr.add(1);
	myArr.add(150);
	myArr.add(77);
	myArr.add(78);

	System.out.println(myArr.size());
	System.out.println(myArr.get(1));
    }
}
