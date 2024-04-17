/**
 * (Month name) Write a program that prompts the user to enter an integer between 1 and 12 and then displays 
 * the name of the month that corresponds to the integer entered by 
 * the user. For example, if the user enters three, the program should display March.
 */

package exercises;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final String[] MONTHS = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		System.out.print("Please enter the month as integer (values between 1 - 12: ");
		int monthAsInt = scanner.nextInt();

		if (monthAsInt < 0 && monthAsInt > 12) {
			System.out.print("Invalid input, please enter again the month: ");
			monthAsInt = scanner.nextInt();
		}

		System.out.println(MONTHS[monthAsInt - 1]);
	}
}