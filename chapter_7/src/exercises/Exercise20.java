/**
 * (Descending Bubble Sort) Modify the bubble sort method of Programming Exercise 
 * 7.18, and sort the elements in the array in descending order instead of ascending 
 * order. Write a test program that reads 10 double numbers, invokes the method, 
 * and displays the sorted numbers in descending order.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 10;
		double[] array = new double[ARRAY_SIZE];

		int count = 0;

		System.out.print("Insert " + ARRAY_SIZE + " integers: ");
		while (count < ARRAY_SIZE) {

			array[count] = scanner.nextDouble();
			count++;
		}

		descendingBubbleSort(array);

		System.out.println(Arrays.toString(array));
	}

	public static void descendingBubbleSort(double[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] < array[j + 1]) {

					double temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
