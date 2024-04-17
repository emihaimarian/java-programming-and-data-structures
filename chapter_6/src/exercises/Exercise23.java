/**
 * (Occurrences of a specified character) Write a method that finds the number of
 * occurrences of a specified character in a string using the following header:
 * public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2. 
 * Write a test program that prompts the user to enter a string followed by a character then displays the
 * number of occurrences of the character in the string.
 */

package exercises;

public class Exercise23 {

	public static void main(String[] args) {

		System.out.println(count("Welcome", 'e'));
	}

	public static int count(String str, char a) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}

}
