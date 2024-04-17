/**
 * (Reverse an array) The reverse method in Section 7.7 reverses an array by copying 
 * it to a new array. Rewrite the method that reverses the array passed in 
 * the argument and returns this array. Write a test program that prompts the user to 
 * enter 10 numbers, invokes the method to reverse the numbers, and displays the numbers.
 */

package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 10;
		int[] array = new int[ARRAY_SIZE];

		System.out.print("Enter " + ARRAY_SIZE + " numbers: ");

		int count = 0;

		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextInt();
			count++;
		}

		int[] reverseArray = reverseArray(array);

		System.out.println(Arrays.toString(reverseArray));

	}

	public static int[] reverseArray(int array[]) {

		int[] reverseArray = new int[array.length];

		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			reverseArray[j] = array[i];
		}

		return reverseArray;
	}
}