package com.sourceit.java.basic.meshcheriakov.ht6;

import com.sourceit.java.basic.meshcheriakov.ht6.establishment.School;
import com.sourceit.java.basic.meshcheriakov.ht6.human.IceCreamVendor;

/**
 * 
 * @author Artur Meshcheriakov
 *
 *         TASK:
 *         Create a system, that simulates entertainment of children with ice-cream
 *         Output:
 *         "Vania is gnawing the chocolate ice-cream on a stick"
 *         "Olia is relishing the full-cream ice in a cone"
 *         ....
 */
public class Launcher {

    public static void main(String[] args) {
	School school = new School("School 21", "Ivanova str");
	IceCreamVendor vendor = new IceCreamVendor();
	for (int i = 0; i < 5; i++) {
	    school.getChild().eat(vendor.giveIceCream());
	}

    }

}
