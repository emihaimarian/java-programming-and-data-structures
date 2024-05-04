package bookExercises.palindrome;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = scanner.nextLine();

		System.out.println(
				"Ignoring nonalphanumeric characters, is " + string + " a palindrome? " + isPalindrome(string));
	}

	public static boolean isPalindrome(String string) {

		String string1 = filter(string);
		String string2 = reverse(string1);

		return string2.equals(string1);
	}

	public static String filter(String string) {

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {

			if (Character.isLetterOrDigit(string.charAt(i)))
				stringBuilder.append(string.charAt(i));
		}

		return stringBuilder.toString();
	}

	public static String reverse(String string) {

		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder.reverse();

		return stringBuilder.toString();
	}

}
