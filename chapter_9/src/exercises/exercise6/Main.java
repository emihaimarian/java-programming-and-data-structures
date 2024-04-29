/**
 * Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */
package exercises.exercise6;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		int[] array = fill(100000, random);

		Stopwatch stopwatch = new Stopwatch();

		stopwatch.start();
		selectionSort(array);
		stopwatch.stop();
		
		System.out.println("Time to sort " + array.length + " elements is " + stopwatch.getElapsedTime() + " milliseconds");
		
	}

	public static void selectionSort(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {

			int minimum = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[minimum]) {
					minimum = j;
				}
			}

			if (minimum != i) {
				swap(array, i, minimum);
			}

		}
	}

	public static int[] fill(int size, Random random) {

		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(size);
		}

		return array;
	}

	public static void swap(int array[], int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
