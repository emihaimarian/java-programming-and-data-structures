package exercises.exercise7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Account[] accounts = initializeAccountArray();

		int keepTrackOfUserChoice = 0;

		while (keepTrackOfUserChoice != 4) {

			int getId = action("Enter an id: ", scanner);

			Account foundedAccount = searchAccount(accounts, getId);

			if (foundedAccount != null) {
				printMenu();

				int getChoice = action("\nEnter a choice: ", scanner);
				keepTrackOfUserChoice = getChoice;
				switchCaseMenu(getChoice, foundedAccount, scanner);

			} else {
				System.err.println("Account not found, please try again.");
				System.exit(1);
			}
		}
	}

	private static int action(String string, Scanner scanner) {

		System.out.print(string);
		return scanner.nextInt();
	}

	private static Account[] initializeAccountArray() {
		Account[] accounts = new Account[10];

		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		return accounts;
	}

	public static Account searchAccount(Account[] accounts, int id) {

		for (Account account : accounts) {

			if (account.getId() == id)
				return account;
		}

		return null;
	}

	private static void printMenu() {
		System.out.print("\nMain menu");
		System.out.print("\n1: check balance");
		System.out.print("\n2: withdraw");
		System.out.print("\n3: deposit");
		System.out.print("\n4: exit");
	}

	public static void switchCaseMenu(int choice, Account account, Scanner scanner) {

		switch (choice) {
		case 1:
			System.out.print("The balance is " + account.getBalance());
			break;
		case 2:
			System.out.print("Enter the amount to withdraw: ");
			double withdrawAmount = scanner.nextDouble();
			account.withdraw(withdrawAmount);
			break;
		case 3:
			System.out.print("Enter an amount to deposit: ");
			double amountToDeposit = scanner.nextDouble();
			account.deposit(amountToDeposit);
			break;
		case 4:
			break;
		default:
			System.out.print("Option doesn`t exist");
			break;
		}
	}
}
