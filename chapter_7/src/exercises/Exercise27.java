/**
 * (Check whether the array is sorted with constant interval) An array list is sorted with a constant interval 
 * if its elements are arranged in an ascending order and there is a constant difference between adjacent elements. 
 * Write a method that returns true if list is sorted with a constant interval, using the following header: 
 * public static boolean isSortedConstantInterval(int[] list) 
 * Write a test program that prompts the user to enter a list of integers. 
 * Note the first number in the input indicates the number of elements in the list. 
 * This number is not part of the list.
 */
package exercises;

import java.util.Scanner;

public class Exercise27 {

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

		if (!isSortedInConstantInterval(array))
			System.out.println("The list is not sorted with a constant interval");
		else
			System.out.println("The list is sorted with a constant interval");
	}

	public static boolean isSortedInConstantInterval(int[] list) {

		int interval = list[1] - list[0];

		for (int i = 0; i < list.length; i++) {

			if (list[i] > list[i + 1] || list[i + 1] - list[i] != interval) {
				return false;
			}
		}
		return true;
	}
}
