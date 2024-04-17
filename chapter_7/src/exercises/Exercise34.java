/**
 * (Sort characters in a string) Write a method that returns a sorted string using the following header:
 * public static String sort(String s) 
 * For example, sort("acb") returns abc. 
 * Write a test program that prompts the user to enter a string and displays the sorted string.
 */
package exercises;

import java.util.Scanner;

public class Exercise34 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the string to sort: ");
		String stringToSort = scanner.nextLine();

		System.out.println(sort(stringToSort));

	}

	public static String sort(String s) {

		char[] stringToCharArray = s.toCharArray();
		boolean sorted = false;

		while (!sorted) {

			sorted = true;

			for (int i = 0; i < stringToCharArray.length - 1; i++) {

				if (Character.toLowerCase(stringToCharArray[i]) > Character.toLowerCase(stringToCharArray[i + 1])) {

					char temp = stringToCharArray[i];
					stringToCharArray[i] = stringToCharArray[i + 1];
					stringToCharArray[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return String.valueOf(stringToCharArray);
	}
}
