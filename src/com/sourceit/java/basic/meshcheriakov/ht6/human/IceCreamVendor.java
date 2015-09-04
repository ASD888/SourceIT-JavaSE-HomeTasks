package com.sourceit.java.basic.meshcheriakov.ht6.human;

import com.sourceit.java.basic.meshcheriakov.ht6.food.IceCream;
import com.sourceit.java.basic.meshcheriakov.ht6.human.model.HomoSapience;

/**
 * 
 * @author Artur Meshcheriakov
 */

public class IceCreamVendor extends HomoSapience {

    public IceCream giveIceCream() {
	return new IceCream();
    }
}
