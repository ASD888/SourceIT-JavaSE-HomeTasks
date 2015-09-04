package com.sourceit.java.basic.meshcheriakov.ht15.cardtask;

import com.sourceit.java.basic.meshcheriakov.ht15.cardtask.constants.Ranks;
import com.sourceit.java.basic.meshcheriakov.ht15.cardtask.constants.Suits;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         Rewrite the class card so that it represents the rank and suit of a card with
 *         enum types;
 */
public class Card {

    private Ranks rank;
    private Suits suit;

    public Card(Ranks rank, Suits suit) {
	this.rank = rank;
	this.suit = suit;
    }

    public String getSuit() {
	return suit.toString();
    }

    public String getRank() {
	return rank.toString();
    }

    public static String rankToString(int rank) {
	Ranks[] temp = Ranks.values();
	String result = null;
	if (rank > 0 || rank <= temp.length) {
	    for (int i = 0; i < temp.length; i++) {
		if (temp[i].getId() == rank) {
		    result = temp[i].toString();
		}
	    }
	}
	return result;
    }

    public static String suitToString(int suit) {
	Suits[] temp = Suits.values();
	String result = null;
	if (suit > 0 || suit <= temp.length) {
	    for (int i = 0; i < temp.length; i++) {
		if (temp[i].getId() == suit) {
		    result = temp[i].toString();
		}
	    }
	}
	return result;
    }
}
