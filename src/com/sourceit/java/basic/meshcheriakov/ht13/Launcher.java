package com.sourceit.java.basic.meshcheriakov.ht13;

import com.sourceit.java.basic.meshcheriakov.ht13.workers.Worker;
import com.sourceit.java.basic.meshcheriakov.ht13.wti.WTI;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         For each of the following four tasks, specify which of the Java Collections member is
 *         best suited, and explain how to use it to implement the task.
 *         - Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month,
 *         an employee will be chosen at random from these records to receive a free toy.
 *         - WTI has decided that each new product will be named after an employee but only first
 *         names will be used, and each name will be used only once. Prepare a list of unique first
 *         names.
 *         - WTI decides that it only wants to use the most popular names for its toys. Count the
 *         number of employees who have each first name.
 *         - WTI acquires season tickets for the local lacrosse team, to be shared by employees.
 *         Create a waiting list for this popular sport.
 */
public class Launcher {

    public static void main(String[] args) {
	// create company
	WTI companyWTI = new WTI();

	// add 10 employees to ArrayList of WTI workers
	companyWTI.addNewEmployee(new Worker("Adam", "Ripley"));
	companyWTI.addNewEmployee(new Worker("Rick", "Pupkin"));
	companyWTI.addNewEmployee(new Worker("Ron", "Walley"));
	companyWTI.addNewEmployee(new Worker("Adam", "Sinkler"));
	companyWTI.addNewEmployee(new Worker("John", "Carter"));
	companyWTI.addNewEmployee(new Worker("John", "Milstney"));
	companyWTI.addNewEmployee(new Worker("Ivan", "Krinka"));
	companyWTI.addNewEmployee(new Worker("Peter", "Parker"));
	companyWTI.addNewEmployee(new Worker("Suzi", "Millos"));
	companyWTI.addNewEmployee(new Worker("John", "Lock"));

	// Chose and print employee for free toy
	System.out.println(companyWTI.choseEmployeeForPrize());

	// Print the HashSet of unique first names and chose one of them for
	// toy
	System.out.println(companyWTI.getWorkersNameSet());
	companyWTI.giveNameForToy("Adam");
	System.out.println(companyWTI.getWorkersNameSet());

	// Print HashMap of popular unique first names and they popularity
	System.out.println(companyWTI.getNamePopularity());

	// Print the ArrayDeque for tickets and give one ticket
	System.out.println(companyWTI.getTicketsQueue());
	companyWTI.giveTicket();
	System.out.println(companyWTI.getTicketsQueue());

    }
}
