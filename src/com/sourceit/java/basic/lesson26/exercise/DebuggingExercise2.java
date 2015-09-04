package com.sourceit.java.basic.lesson26.exercise;

class DebuggingExercise2 {

    public static void main(String[] args) {

	Account a = new Account("Jhon");
	a.deposit(100);
	System.out.println(a.getOwner() + " has $" + a.getBalance());

    }
}