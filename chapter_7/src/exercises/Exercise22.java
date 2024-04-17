/**
 * (Count the number of vowels in a string) Write a program that prompts the user to enter 
 * a string, and counts and displays the number of both lowercase and uppercase vowels 
 * in the string.
 */
package exercises;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a string: ");
		String string = scanner.nextLine();

		countVowels(string);
	}

	public static void countVowels(String string) {

		int upperCaseVowels = 0;
		int lowerCaseVowels = 0;

		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				if (Character.isLowerCase(ch)) {
					lowerCaseVowels++;
				} else {
					upperCaseVowels++;
				}
			}
		}

		System.out.println(string + " has an upper case vowels: " + upperCaseVowels);
		System.out.println(string + " has an lower case vowels: " + lowerCaseVowels);
	}
}
