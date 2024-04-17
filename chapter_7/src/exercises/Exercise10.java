/**
 * (Find the index of the largest element) Write a method that returns the index of the
 * largest element in an array of integers. If there is more than one element, return
 * the largest index. Use the following header:
 * 	public static int indexOfLargestElement(double[] array)
 * Write a test program that prompts the user to enter 10 numbers, invokes this
 * method to return the index of the largest element, and displays the index and the
 * element itself.
 */
package exercises;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 10;
		double[] array = new double[ARRAY_SIZE];

		int count = 0;

		System.out.println("Insert " + ARRAY_SIZE + " doubles: ");

		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextDouble();
			count++;
		}

		int indexOfLargestElement = indexOfLargestElement(array);

		System.out.println("The largest number is at index: " + indexOfLargestElement + " and the number is: "
				+ array[indexOfLargestElement]);
	}

	public static int indexOfLargestElement(double[] array) {

		int indexOfTheLargest = 0;

		for (int i = 1; i < array.length; i++) {

			if (array[i] > array[indexOfTheLargest]) {
				indexOfTheLargest = i;
			}
		}

		return indexOfTheLargest;
	}
}
