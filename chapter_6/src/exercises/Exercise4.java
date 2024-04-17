/**
 * Display an integer reversed) Write a method with the following header to display an integer in reverse order:
 * public static void reverse(int number)
 * For example, reverse(3456) displays 6543. 
 * Write a test program that prompts the user to enter an integer then displays its reversal.
 * 
 */
package exercises;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.print("Reverse of " + number + " is ");
		reverse(number);
	}

	public static void reverse(int number) {

		int reverse = 0;

		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}

		System.out.print(reverse);
	}

}
