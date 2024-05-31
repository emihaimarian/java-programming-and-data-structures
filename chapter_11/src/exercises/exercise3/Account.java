package exercises.exercise3;

import java.util.Date;

public class Account {

	protected int accountNumber;
	protected double balance;
	protected double annualInterestRate;
	protected Date dateCreated;

	public Account() {
	}

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return (getAnnualInterestRate() / 12) / 100;
	}

	public double getMonthlyInterest() {
		return getBalance() * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return "Account Number: " + getAccountNumber() + "\nDate created: " + getDateCreated() + "\nBalance: $"
				+ String.format("%.2f", balance) + "\nMonthly interest: $"
				+ String.format("%.2f", getMonthlyInterest());
	}
}
