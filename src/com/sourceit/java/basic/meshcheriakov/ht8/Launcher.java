package com.sourceit.java.basic.meshcheriakov.ht8;

import java.util.ArrayList;
import java.util.Collections;

import com.sourceit.java.basic.meshcheriakov.ht8.workers.Engineer;
import com.sourceit.java.basic.meshcheriakov.ht8.workers.SoftwareDeveloper;
import com.sourceit.java.basic.meshcheriakov.ht8.workers.model.Worker;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         - Create 3 classes (basic and 2 sub-classes), describing some workers
 *         with salary per hour and fix salary;
 *         - Create the abstract method for counting an average month salary;
 *         Formulas:
 *         For per hour workers: average per month = 20.8 * 8 * per hour;
 *         For workers with fix salary: average per month = fix month salary;
 *         - Create a list with different kind of workers;
 *         - Sort this list by decreasing an average month salary (If salary are similar, sort by
 *         alphabet);
 *         - Type identifier of worker, his name and average month salary for all
 *         elements of the list;
 *         - Type first five names from the list;
 *         - Type last three identifiers;
 */
public class Launcher {

    public static void main(String[] args) {

	ArrayList<Worker> employeeList = new ArrayList<Worker>();

	employeeList.add(new Engineer("Jack Karter", 20000));
	employeeList.add(new Engineer("Jhone Mirphy", 350050));
	employeeList.add(new SoftwareDeveloper("Emmy Greed", 2000));
	employeeList.add(new SoftwareDeveloper("Fred Dred", 3540));
	employeeList.add(new SoftwareDeveloper("Ray Pay", 4030));
	employeeList.add(new Engineer("Adam Grizopup", 200000));
	employeeList.add(new Engineer("Vasia Apelsinkin", 500000));
	employeeList.add(new SoftwareDeveloper("Peter Parker", 1500));
	employeeList.add(new Engineer("Egor Slivolubov", 200000));
	employeeList.add(new Engineer("Margarita Tkacheva", 100000));
	employeeList.add(new SoftwareDeveloper("Fasdui Fedotov", 5000));

	Collections.sort(employeeList);

	for (Worker e : employeeList) {
	    System.out.println(e);
	}

	System.out.println();

	for (int i = 0; i < 5; i++) {
	    System.out.println(employeeList.get(i).getName());
	}

	System.out.println();

	for (int i = employeeList.size() - 3; i < employeeList.size(); i++) {
	    System.out.println(employeeList.get(i).getID());
	}

    }

}
