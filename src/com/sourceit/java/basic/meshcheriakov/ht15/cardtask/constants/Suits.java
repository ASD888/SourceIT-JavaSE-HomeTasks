package com.sourceit.java.basic.meshcheriakov.ht15.cardtask.constants;

/**
 * 
 * @author Artur Meshcheriakov
 */
public enum Suits {

    DIAMONDS(1), CLUBS(2), HEARTS(3), SPADES(4);

    private int id;

    private Suits(int id) {
	this.id = id;
    }

    public int getId() {
	return id;
    }

}
