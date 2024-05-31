/**
 * (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account. 
 * An account has the properties account number, balance, annual interest rate, and date created 
 * and methods to deposit and withdraw funds. 
 * Create two subclasses for checking and saving accounts. 
 * A checking account has an overdraft limit, but a savings account cannot be overdrawn.
 */
package exercises.exercise3;

public class Main {

	public static void main(String[] args) {

		Account account = new Account(1234, 1500.0);

		CheckingAccount checkingAccount = new CheckingAccount(4000);
		checkingAccount.withdraw(50000);

		SavingsAccount savingsAccount = new SavingsAccount(false);

		System.out.println(account.toString() + "\n");
		System.out.println(checkingAccount.toString() + "\n");
		System.out.println(savingsAccount.toString());
	}

}
