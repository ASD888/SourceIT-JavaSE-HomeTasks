package com.sourceit.java.basic.meshcheriakov.ht10;

import com.sourceit.java.basic.meshcheriakov.ht10.bank.Bank;
import com.sourceit.java.basic.meshcheriakov.ht10.person.Person;

/**
 * @author Artur Meshcheriakov
 *
 *         TASK:
 *         Script:
 *         - Person 1 creates an account in a bank;
 *         - Person 2 creates an account in a bank;
 *         - Person 1 take a credit in a bank;
 *         - Person 1 put a cash on his account;
 *         - Person 1 transmit money on Person 2 account;
 *         - Person 2 draw out money from his account;
 *         Create a program realizing this script;
 */
public class Launcher {

    public static void main(String[] args) {

	Bank bank = new Bank("UkrSibBank");
	Person person1 = new Person("Dmitro", "Apelsinkin");
	Person person2 = new Person("Vasia", "Rogov");

	bank.createAccount(person1);
	bank.createAccount(person2);

	person1.addCash(bank.giveCredit(person1, 100000));
	bank.putOnAccount(person1, person1.withdrawCash(100000));
	bank.transferFromAccountToAnother(person1, person2, 50000);
	person1.addCash(bank.withdrowFromAccount(person1, 50000));

	person1.printCash();
	person2.printCash();

	bank.printAllAccounts();
    }
}
