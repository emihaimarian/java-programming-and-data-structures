/**
 * (Pattern recognition: consecutive four equal numbers) Write the following method 
 * that tests whether the array has four consecutive numbers with the same value: 
 * public static boolean isConsecutiveFour(int[] values) 
 * Write a test program that prompts the user to enter a series of integers and displays 
 * it if the series contains four consecutive numbers with the same value. 
 * Your program should first prompt the user to enter the input size—i.e., the number of values in the series.
 */

package exercises;

import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of values: ");

		final int ARRAY_SIZE = scanner.nextInt();

		int[] list = new int[ARRAY_SIZE];

		int count = 0;

		System.out.print("Enter the values: ");
		while (count < ARRAY_SIZE) {
			list[count] = scanner.nextInt();
			count++;
		}

		if (isConsecutiveFour(list)) {
			System.out.println("The list has consecutive fours.");
		} else {
			System.out.println("The list has no consecutive fours.");
		}
	}

	public static boolean isConsecutiveFour(int[] values) {

		int count = 1;

		for (int i = 0; i < values.length - 1; i++) {

			if (values[i] == values[i + 1])
				count++;
			else
				count = 1;

			if (count >= 4)
				return true;
		}

		return false;
	}
}
