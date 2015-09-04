package com.sourceit.java.basic.meshcheriakov.ht6.human.model;

import java.util.Random;

import com.sourceit.java.basic.meshcheriakov.ht6.food.model.Food;
import com.sourceit.java.basic.meshcheriakov.ht6.human.interfaces.AbleToEat;

/**
 * 
 * @author Artur Meshcheriakov
 */

public abstract class HomoSapience implements AbleToEat {

    protected String name;
    protected String sex;

    protected HomoSapience() {
	String[] boysName = { "Ivan ", "Prohor ", "Matt ", "Adam ", "Sofocl ", "Fill ", "Petr ",
		"Vasia ", "Nicola ", "David " };
	String[] girlsName = { "Dasha ", "Kate ", "Maria ", "Irina ", "Olia ", "Sofia ", "Helen ",
		"Jessi ", "Suzi ", "Lilu " };
	if (new Random().nextBoolean()) {
	    name = boysName[new Random().nextInt(10)];
	    sex = "male";
	} else {
	    name = girlsName[new Random().nextInt(10)];
	    sex = "female";
	}
    }

    @Override
    public void eat(Food someFood) {
	System.out.println(this.toString() + someFood);
    }
}
