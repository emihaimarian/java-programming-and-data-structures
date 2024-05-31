/**
 * (New Account class) An Account class was specified in Programming Exercise 9.7. 
 * Design a new Account class as follows:
 * Add a new data field name of the String type to store the name of the customer.
 * Add a new constructor that constructs an account with the specified name, id, and balance.
 * Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts. 
 * Each transaction is an instance of the Transaction class, which is defined as shown in Figure 11.6.
 * Modify the withdraw and deposit methods to add a transaction to the transactions array list.
 * All other properties and methods are the same as in Programming Exercise 9.7.
 */
package exercises.exercise8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

	private int id;
	private String name;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private List<Transaction> transactionList;

	public Account() {
		this.name = "";
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
		this.transactionList = new ArrayList<Transaction>();
	}

	public Account(int id, double balance) {
		this.name = "";
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
		this.transactionList = new ArrayList<Transaction>();
	}

	public Account(String name, int id, double balance) {
		this(id, balance);
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** Return id */
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	public void withdraw(double amount) {
		balance -= amount;
		transactionList.add(new Transaction('W', amount, balance, "Withdrawal from account"));
	}

	public void deposit(double amount) {
		balance += amount;
		transactionList.add(new Transaction('D', amount, balance, "Deposit to account"));
	}

	@Override
	public String toString() {
		return "Account id = " + getId() + ", name = " + name + ", balance = " + getBalance() + ", dateCreated = "
				+ getDateCreated() + ", transactionList = " + getTransactionList();
	}
}
