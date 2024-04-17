/**
 * (Normalizing integers) Write a program that prompts the user to enter 10 integers, 
 * and normalizes the integers to be in the range of 0 to 1 by dividing every integer 
 * with the largest integer. Display the 10 normalized real-valued numbers.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 10;
		int[] array = new int[ARRAY_SIZE];

		int count = 0;

		System.out.print("Enter " + ARRAY_SIZE + " numbers: ");

		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextInt();
			count++;
		}

		System.out.println(Arrays.toString(normalize(array)));
	}

	public static int max(int[] array) {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (max < array[i])
				max = array[i];
		}

		return max;
	}

	public static double[] normalize(int[] array) {

		double max = max(array);
		double[] normalizeData = new double[array.length];

		for (int i = 0; i < normalizeData.length; i++) {
			normalizeData[i] = (double) array[i] / max;
		}

		return normalizeData;
	}
}
