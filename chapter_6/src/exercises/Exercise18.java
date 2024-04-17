/**
 * (Check password) Some websites impose certain rules for passwords. Write a
 * method that checks whether a string is a valid password. 
 * Suppose the password rules are as follows:
 * A password must have at least ten characters.
 * A password consists of only letters and digits.
 * A password must contain at least three digits.
 * Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed 
 * or Invalid Password otherwise.
 */
package exercises;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the password: ");
		String password = scanner.nextLine();

		/** In a simpler way use a regex */
		String regex = "^(?=(?:.*\\d){3})[a-zA-Z\\d]+$";
		if (password.length() == 10 && password.matches(regex))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		
//		if (checkPasswordValidity(password, 10, 3))
//			System.out.println("Valid Password");
//		else
//			System.out.println("Invalid Password");
	}

	public static boolean checkPasswordValidity(String password, int length, int numberOfDigits) {
		return checkLenght(password, length) && checkLettersAndDigits(password) && hasDigits(password, numberOfDigits);
	}

	public static boolean checkLenght(String password, int passwordLenght) {
		return password.length() >= passwordLenght;
	}

	public static boolean checkLettersAndDigits(String password) {

		for (int i = 0; i < password.length(); i++) {

			if (!Character.isLetterOrDigit(password.charAt(i)))
				return false;
		}

		return true;
	}

	public static boolean hasDigits(String password, int numberOfDigits) {

		int digit = 0;

		for (int i = 0; i < password.length(); i++) {

			if (Character.isDigit(password.charAt(i)))
				digit++;

			if (digit >= numberOfDigits)
				return true;
		}

		return false;
	}
}
