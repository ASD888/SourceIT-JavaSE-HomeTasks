package com.sourceit.java.basic.meshcheriakov.ht6.establishment.model;

/**
 * 
 * @author Artur Meshcheriakov
 */

public abstract class Establishment {

    protected String name;
    protected String address;

    protected Establishment(String name, String address) {
	this.name = name;
	this.address = address;
    }
}
