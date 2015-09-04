package com.sourceit.java.basic.meshcheriakov.ht15.cardtask.constants;

/**
 * 
 * @author Artur Meshcheriakov
 */
public enum Ranks {
    ACE(1), DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(11), QUEEN(12), KING(13);

    private int id;

    private Ranks(int id) {
	this.id = id;
    }

    public int getId() {
	return id;
    }

}
