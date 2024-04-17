/**
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the 
 * duplicate values in the array using the following method header: 
 * 	public static int[] eliminateDuplicates(int[] list)
 * Write a test program that reads in 10 integers, invokes the method, and displays 
 * the distinct numbers separated by exactly one space.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 10;
		int[] array = new int[ARRAY_SIZE];

		int count = 0;

		System.out.print("Enter 10 numbers: ");
		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextInt();
			count++;
		}

		System.out.println(Arrays.toString(elimiteDuplicates(array)));

	}

	public static int[] elimiteDuplicates(int[] list) {

		int unique[] = new int[list.length];

		int isUnique = 0;

		for (int i = 0; i < list.length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < isUnique; j++) {

				if (list[i] == unique[j]) {

					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				unique[isUnique] = list[i];
				isUnique++;
			}
		}

		return Arrays.copyOf(unique, isUnique);
	}
}
