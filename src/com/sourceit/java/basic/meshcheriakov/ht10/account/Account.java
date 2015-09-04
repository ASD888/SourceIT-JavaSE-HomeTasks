package com.sourceit.java.basic.meshcheriakov.ht10.account;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class Account {

    private long balance = 0;
    private long credit = 0;
    private String accountName;

    public Account(String accountName) {
	this.accountName = accountName;
    }

    public String getAccountName() {
	return accountName;
    }

    public long getBalance() {
	return balance;
    }

    public void setBalance(long account) {
	this.balance = account;
    }

    public long getCredit() {
	return credit;
    }

    public void setCredit(long credit) {
	this.credit = credit;
    }

    @Override
    public String toString() {
	NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
	float acc = balance / 100;
	float cr = credit / 100;
	String information = "|Account type: " + accountName + "|Balance: " + nf.format(acc)
		+ "|Credit: " + nf.format(cr) + "|";
	return information;
    }

}
