package com.sourceit.java.basic.meshcheriakov.ht6.establishment;

import com.sourceit.java.basic.meshcheriakov.ht6.establishment.model.Establishment;
import com.sourceit.java.basic.meshcheriakov.ht6.human.Child;

/**
 * 
 * @author Artur Meshcheriakov
 */

public class School extends Establishment {

    public School(String name, String address) {
	super(name, address);
    }

    public Child getChild() {
	return new Child();
    }
}
