/**
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s 
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 * most 1s. (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
 */
package exercises.exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the array size n: ");
		int arraySize = scanner.nextInt();

		int[][] array = new int[arraySize][arraySize];

		fillArray(array);
		printArray(array);

		System.out.print("\nThe largest row index: ");
		print(largestRow(array));

		System.out.print("\nThe largest column index: ");
		print(largestColumn(array));
	}

	public static void fillArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static int max(int[] array) {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max)
				max = array[i];
		}

		return max;
	}

	public static void getIndex(List<Integer> list, int[] count, int x) {

		for (int i = 0; i < count.length; i++) {

			if (count[i] == x)
				list.add(i);
		}
	}

	public static void print(List<Integer> list) {

		for (Integer integer : list) {
			System.out.print(integer);
		}
	}

	public static void printArray(int[][] array) {

		System.out.println("The random array is");

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static List<Integer> largestColumn(int[][] array) {

		List<Integer> index = new ArrayList<Integer>();

		int[] count = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1)
					count[j]++;
			}
		}

		int max = max(count);

		getIndex(index, count, max);

		return index;
	}

	public static List<Integer> largestRow(int[][] array) {

		List<Integer> index = new ArrayList<Integer>();

		int[] count = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[j][i] == 1)
					count[j]++;
			}
		}

		int max = max(count);

		getIndex(index, count, max);

		return index;
	}
}
