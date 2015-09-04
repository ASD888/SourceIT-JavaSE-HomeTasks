package com.sourceit.java.basic.meshcheriakov.ht8.workers.model;

/**
 * 
 * @author Artur Meshcheriakov
 */
public abstract class Worker implements Comparable<Worker> {

    private int id = 0;
    private String fullName;

    protected Worker(String fullName) {
	this.fullName = (fullName == null || fullName == "") ? "Unknown" : fullName;
	id = this.hashCode();

    }

    public String getName() {
	return fullName;
    }

    public String getID() {
	return "id#" + id;
    }

    protected abstract long getMonthSalary();

    @Override
    public String toString() {
	return "id#" + id + " " + fullName;
    }

    @Override
    public int compareTo(Worker employee) {
	double difference = this.getMonthSalary() - employee.getMonthSalary();
	if (difference > 0.0) {
	    return -1;
	} else if (difference < 0.0) {
	    return 1;
	} else {
	    int a = this.getName().compareTo(employee.getName());
	    return (a == 0) ? 1 : a;
	}
    }
}
