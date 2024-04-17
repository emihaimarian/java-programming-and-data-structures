/**
 * (Palindrome integer) Write the methods with the following headers:
 * Return the reversal of an integer, e.g., reverse(456) returns 654 -> public static int reverse(int number)
 * Return true if number is a palindrome public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. 
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */
package exercises;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (isPalindrome(number))
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");

	}

	public static int reverse(int number) {

		int reverse = 0;

		for (int i = number; i > 0; i /= 10) {
			int digit = i % 10;
			reverse = reverse * 10 + digit;
		}

		return reverse;
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
