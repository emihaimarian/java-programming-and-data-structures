/**
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. 
 * The bubble-sort algorithm makes several passes through the array. 
 * On each pass, successive neighboring pairs are compared. 
 * If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. 
 * The technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” their way to 
 * the top, and the larger values “sink” to the bottom. 
 * Write a test program that reads in 10 double numbers, invokes the method, and displays the sorted numbers.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 10;
		int[] array = new int[ARRAY_SIZE];

		int count = 0;

		System.out.print("Insert " + ARRAY_SIZE + " integers: ");
		while (count < ARRAY_SIZE) {

			array[count] = scanner.nextInt();
			count++;
		}

		bubbleSort(array);

		System.out.println(Arrays.toString(array));
	}

	public static void bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}