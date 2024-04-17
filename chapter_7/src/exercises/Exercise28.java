/**
 * (Math: permutations) Write a program that prompts the user to enter four integers 
 * and then displays all possible ways of arranging the four integers.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 4;
		int[] array = new int[ARRAY_SIZE];

		int count = 0;

		System.out.print("Insert " + ARRAY_SIZE + " integers: ");
		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextInt();
			count++;
		}

		System.out.println("All the permutations for " + Arrays.toString(array));
		permutations(array, ARRAY_SIZE, ';');
	}

	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	/** Here we`re using HEAP`s algorithm with recursion */
	public static void permutations(int[] array, int n, char delimiter) {

		if (n == 1) {
			printArray(array, delimiter);
		} else {

			for (int i = 0; i < n - 1; i++) {
				permutations(array, n - 1, delimiter);

				if (n % 2 == 0) {
					swap(array, i, n - 1);
				} else {
					swap(array, 0, n - 1);
				}
			}
			permutations(array, n - 1, delimiter);
		}

	}

	public static void printArray(int[] array, char delimiter) {
		System.out.println(Arrays.toString(array));
	}
}
