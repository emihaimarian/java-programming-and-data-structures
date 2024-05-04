/**
 * (Game: ATM machine) Use the Account class created in Programming Exercise 9.7 to simulate an ATM machine. 
 * Create 10 accounts in an array with id 0, 1, . . . , 9 and an initial balance of $100. 
 * The system prompts the user to enter an id. 
 * If the id is entered incorrectly, ask the user to enter a correct id. 
 * Once an id is accepted, the main menu is displayed as shown in the sample run. 
 * You can enter choice 
 * 	1 for viewing the current balance
 *  2 for withdrawing money 
 *  3 for depositing money 
 *  4 for exiting the main menu. 
 *  Once you exit, the system will prompt for an id again. Thus, once the system starts, it will not stop.
 */
package exercises.exercise7;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account(int id, double balance) {
	    this.id = id;
	    this.balance = balance;
	    this.annualInterestRate = 0;
	    this.dateCreated = new Date();
	}

	public Account() {
		this(0, 0);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) / 100;
	}

	public double getMonthlyInterest() {
		return balance * getAnnualInterestRate();
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
