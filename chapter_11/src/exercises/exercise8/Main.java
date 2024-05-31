/**
 * Write a test program that creates an Account with annual interest rate 1.5%, 
 * balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the 
 * account and withdraw $5, $4, and $2 from the account. Print an account summary 
 * that shows the account holder name, interest rate, balance, and all transactions.
 */
package exercises.exercise8;

public class Main {

	public static void main(String[] args) {

		Account account = new Account("George", 1122, 1000);

		account.setAnnualInterestRate(1.5);

		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);

		System.out.println("       Account Summary");
		System.out.println("------------------------------------");
		System.out.println("Account holder name: " + account.getName());
		System.out.println("Interest rate: " + account.getAnnualInterestRate());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.println("\n     List of transactions");
		System.out.println("------------------------------------");

		for (int i = 0; i < account.getTransactionList().size(); i++) {
			System.out.println("Date: " + (account.getTransactionList()).get(i).getDate());
			System.out.println("Type: " + (account.getTransactionList()).get(i).getType());
			System.out.println("Amount: " + (account.getTransactionList()).get(i).getAmount());
			System.out.println("Balance: " + (account.getTransactionList()).get(i).getBalance());
			System.out.println("Description: " + (account.getTransactionList()).get(i).getDescription());
			System.out.println();
		}
	}
}