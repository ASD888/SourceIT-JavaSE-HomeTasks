package com.sourceit.java.basic.meshcheriakov.ht8.workers;

import java.text.NumberFormat;
import java.util.Locale;

import com.sourceit.java.basic.meshcheriakov.ht8.workers.model.Worker;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class SoftwareDeveloper extends Worker {

    private long salaryPerHour;
    private static final String PROFFESION = "Software developer";
    private static final int HOURS_IN_MONTH = 104;

    public SoftwareDeveloper(String fullName, long salaryPerHour) {
	super(fullName);
	this.salaryPerHour = (salaryPerHour > 0) ? salaryPerHour : 0;
    }

    @Override
    protected long getMonthSalary() {
	return salaryPerHour * HOURS_IN_MONTH;
    }

    @Override
    public String toString() {
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
	float money = getMonthSalary() / 100;
	return super.toString() + " " + PROFFESION + " (per hour) Month salary is: "
		+ numberFormat.format(money);
    }

}
