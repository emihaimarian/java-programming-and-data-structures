/**
 * (Check whether array is sorted) An array list is required to be sorted in ascending order. 
 * Write a method that returns true if list is sorted, using the following header: 
 * public static boolean isSorted(int[] list) 
 * Write a test program that prompts the user to enter a list of integers. 
 * Note the first number in the input indicates the number of elements in the list. This number is not part of the list.
 */
package exercises;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter list: ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		int count = 0;
		while (count < size) {
			array[count] = scanner.nextInt();
			count++;
		}

		if (isSorted(array))
			System.out.println("The list is sorted");
		else
			System.out.println("The list is not sorted");

	}

	public static boolean isSorted(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
