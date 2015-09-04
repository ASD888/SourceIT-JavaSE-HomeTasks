package com.sourceit.java.basic.meshcheriakov.ht6.food;

import java.util.Random;

import com.sourceit.java.basic.meshcheriakov.ht6.food.model.Food;

/**
 * 
 * @author Artur Meshcheriakov
 */

public class IceCream extends Food {

    private String type;
    private String kind;

    public IceCream() {
	String[] iceCreamType = { "full-cream ice ", "chocolate ice ", "fruit ice ", "vanilla ice " };
	type = iceCreamType[new Random().nextInt(4)];
	;
	String[] iceCreamKind = { "on a stick.", "in a cup.", "in a cone." };
	kind = iceCreamKind[new Random().nextInt(3)];
    }

    @Override
    public String toString() {
	return type + kind;
    }
}
