package com.sourceit.java.basic.meshcheriakov.ht10.bank;

import java.util.HashMap;
import java.util.Map;

import com.sourceit.java.basic.meshcheriakov.ht10.account.Account;
import com.sourceit.java.basic.meshcheriakov.ht10.person.Person;
import com.sourceit.java.basic.meshcheriakov.ht10.person.behavior.ICreditworthiness;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class Bank {

    private String bankName;

    private long active = 1000000000;

    private HashMap<ICreditworthiness, Account> clientsMap = new HashMap<>();

    public Bank(String bankName) {
	this.bankName = bankName;
    }

    public long getActive() {
	return active;
    }

    /**
     * @param person1
     */
    public void createAccount(Person person1) {
	if (clientsMap.containsKey(person1)) {
	    System.out.println("Creation error: " + person1.getFirstName() + " "
		    + person1.getLastName() + " account's exist!");
	} else {
	    clientsMap.put(person1, new Account("Default"));
	}
    }

    /**
     * @param person1
     * @param i
     */
    public long giveCredit(Person person, long value) {
	long result = 0;
	if (clientsMap.containsKey(person)) {
	    if (value < 100_000_00) {
		active -= value;
		Account account = clientsMap.get(person);
		account.setCredit(account.getCredit() + value);
		result = value;
	    }
	} else {
	    System.out.println("Credit error: The limit of credit is 100 000$");
	}
	return result;

    }

    /**
     * @param person
     * @param i
     */
    public void putOnAccount(Person person, long value) {

	if (clientsMap.containsKey(person)) {
	    if (value > 0) {
		Account account = clientsMap.get(person);
		account.setBalance(account.getBalance() + value);
	    } else if (value < 0) {
		System.out.println("Augmenter error: " + person.getFirstName() + " "
			+ person.getLastName() + " doesn't have enought money");
	    } else {
		System.out.println("Augmenter error: Wrong operation. Value must be bigger than 0");
	    }
	} else {
	    System.out.println("Augmenter error: " + person.getFirstName() + " "
		    + person.getLastName() + " account doesn't exist!");
	}
    }

    /**
     * @param person1
     * @param person2
     * @param l
     */
    public void transferFromAccountToAnother(Person person1, Person person2, long value) {
	if (clientsMap.containsKey(person1)) {
	    if (clientsMap.containsKey(person2)) {
		Account account1 = clientsMap.get(person1);
		if (account1.getBalance() - value >= 0) {
		    account1.setBalance(account1.getBalance() - value);
		    Account account2 = clientsMap.get(person2);
		    account2.setBalance(account2.getBalance() + value);
		} else {
		    System.out.println("Transfer Error: Not enought money on "
			    + person1.getFirstName() + " " + person1.getLastName() + " account's");
		}
	    } else {
		System.out.println("Transfer Error: " + person2.getFirstName() + " "
			+ person2.getLastName() + " account doesn't exist!");
	    }
	} else {
	    System.out.println("Transfer Error: " + person1.getFirstName() + " "
		    + person1.getLastName() + " account doesn't exist!");
	}
    }

    /**
     * @param person1
     * @param l
     */
    public long withdrowFromAccount(Person person, long value) {
	long result = 0;
	if (clientsMap.containsKey(person)) {
	    Account account = clientsMap.get(person);
	    if (account.getBalance() - value >= 0) {
		account.setBalance(account.getBalance() - value);
		result = value;
	    } else {
		System.out.println("Withdrow Error: Not enought money on " + person.getFirstName()
			+ " " + person.getLastName() + " account's");
	    }
	} else {
	    System.out.println("Withdrow Error: " + person.getFirstName() + " "
		    + person.getLastName() + " account doesn't exist!");
	}
	return result;
    }

    /**
	 * 
	 */
    public void printAllAccounts() {
	System.out.println("_______ACCOUNT OF " + bankName.toUpperCase() + "_______");
	for (Map.Entry<ICreditworthiness, Account> pair : clientsMap.entrySet()) {
	    System.out.println(pair.getKey().getFirstName() + " " + pair.getKey().getLastName()
		    + pair.getValue());
	}
    }
}
