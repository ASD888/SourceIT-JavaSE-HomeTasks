package com.sourceit.java.basic.meshcheriakov.ht8.workers;

import java.text.NumberFormat;
import java.util.Locale;

import com.sourceit.java.basic.meshcheriakov.ht8.workers.model.Worker;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class Engineer extends Worker {

    private long monthSalary;
    private static final String PROFFESION = "Engineer";

    public Engineer(String fullName, long monthSalary) {
	super(fullName);
	this.monthSalary = (monthSalary > 0) ? monthSalary : 0;
    }

    @Override
    protected long getMonthSalary() {
	return monthSalary;
    }

    @Override
    public String toString() {
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
	float money = getMonthSalary() / 100;
	return super.toString() + " " + PROFFESION + " (fixed) Month salary is: "
		+ numberFormat.format(money);
    }
}
