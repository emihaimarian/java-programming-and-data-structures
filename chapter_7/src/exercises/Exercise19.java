/**
 * (Sorted?) Write the following method that returns true if the list is already sorted in decreasing order: 
 * public static boolean isSorted(int[] list)
 * Write a test program that prompts the user to enter a list and displays whether the list is sorted or not. 
 * Here is a sample run. Note that the first number in the input 
 * indicates the number of the elements in the list. This number is not part of the list.
 */
package exercises;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter list: ");

		final int ARRAY_SIZE = scanner.nextInt();

		int[] list = new int[ARRAY_SIZE];

		int count = 0;

		while (count < ARRAY_SIZE) {
			list[count] = scanner.nextInt();
			count++;
		}

		if (isSorted(list))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}

	public static boolean isSorted(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {

			if (list[i] < list[i + 1])
				return false;
		}
		return true;
	}
}
