package com.sourceit.java.basic.meshcheriakov.ht6.human;

import java.util.Random;

import com.sourceit.java.basic.meshcheriakov.ht6.human.model.HomoSapience;

/**
 * 
 * @author Artur Meshcheriakov
 */

public class Child extends HomoSapience {

    private String skill;

    public Child() {
	super();
	String[] skillArray = { "is biting off ", "is licking ", "is gnowing ", "is eating up ",
		"is relishing " };
	skill = skillArray[new Random().nextInt(5)];
    }

    @Override
    public String toString() {
	return name + skill;
    }
}
