/**
 * (Find the largest element) Write a method that finds the largest element in an array 
 * of double values using the following header:
 * 	public static double max(double[] array) 
 * Write a test program that prompts the user to enter ten numbers, invokes this 
 * method to return the maximum value, and displays the maximum value. 
 */

package exercises;

import java.util.Scanner;

public class Exercise9 {

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

		System.out.println("The minimum number is: " + max(array));

	}

	public static double max(double[] array) {

		double max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (max < array[i])
				max = array[i];
		}

		return max;

	}
}
