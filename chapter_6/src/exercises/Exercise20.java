/**
 * (Count the letters in a string) Write a method that counts the number of letters in a string using the following header: 
 * public static int countLetters(String s)
 * Write a test program that prompts the user to enter a string and displays 
 * the number of letters in the string.
 */
package exercises;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = scanner.nextLine();

		System.out.println("String " + string + " contains " + countLetters(string) + " letters");
	}

	public static int countLetters(String s) {

		int letters = 0;

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLetter(s.charAt(i)))
				letters++;
		}

		return letters;
	}

}
