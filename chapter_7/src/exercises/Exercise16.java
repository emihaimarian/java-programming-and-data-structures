/**
 * (Execution time) Write a program that creates an array of numbers from 1 to 100,000,000 in ascending order. 
 * Display the execution time of invoking the linear Search method and the binary Search method in Listings 7.6 and 7.7 respectively. 
 * Display the execution time of invoking both searches for the following numbers: 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000. 
 * You can use the following code template to obtain the execution time:
 * long startTime = System.nanoTime();
 * perform the task;
 * long endTime = System.NanoTime();
 * long executionTime = endTime − startTime;
 */
package exercises;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 5;
		int[] array = new int[ARRAY_SIZE];

		int count = 0;

		System.out.print("Insert " + ARRAY_SIZE + " integers: ");

		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextInt();
			count++;
		}

		System.out.print("What number do you want to search for in array: ");
		int key = scanner.nextInt();

		long startTimeForLinearSearch = System.nanoTime();

		System.out.println("Linear search started");
		linearSearch(array, key);

		long endTimeForLinearSearch = System.nanoTime();
		long executionTimeForLinearSearch = endTimeForLinearSearch - startTimeForLinearSearch;

		selectionSort(array);
		long startTimeForBinarySearch = System.nanoTime();
		System.out.println("Binary search started");
		binarySearch(array, key);

		long endTimeForBinarySearch = System.nanoTime();
		long executionTimeForBinarySearch = endTimeForBinarySearch - startTimeForBinarySearch;

		System.out.println("Execution time of linear search is: " + executionTimeForLinearSearch);
		System.out.println("Execution time of binary search is: " + executionTimeForBinarySearch);

	}

	public static int linearSearch(int[] array, int key) {

		for (int i = 0; i < array.length; i++) {

			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int currentSmallest = array[i];
			int indexOfTheSmallest = i;

			for (int j = i + 1; j < array.length; j++) {

				if (currentSmallest > array[j]) {
					currentSmallest = array[j];
					indexOfTheSmallest = j;
				}
			}

			if (currentSmallest != i) {
				array[indexOfTheSmallest] = array[i];
				array[i] = currentSmallest;
			}
		}
	}

	public static int binarySearch(int[] array, int key) {

		int low = 0;
		int high = array.length - 1;

		while (high >= low) {

			int middle = (low + (high - low)) / 2;

			if (key < array[middle])
				high = middle - 1;
			else if (key == array[middle])
				return middle;
			else
				low = middle + 1;
		}

		return -low - 1;
	}
}
