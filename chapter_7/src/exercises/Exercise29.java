/**
 * (Game: dice) Suppose three dice are thrown at random. Write a program that 
 * shows all possible permutations or configurations of the three dice that yield the 
 * sum of nine.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) {

		final int ARRAY_SIZE = 3;
		int[] dices = new int[ARRAY_SIZE];
		
		 permutations(dices, ARRAY_SIZE, 0, 9, 0);
	}

	public static void permutations(int[] dices, int n, int index, int targetSum, int currentSum) {

		if (index == n) {
			if (currentSum == targetSum) {
				printArray(dices);
			}
			return;
		}

		for (int value = 1; value <= 6; value++) {
			dices[index] = value;
			permutations(dices, n, index + 1, targetSum, currentSum + value);
		}
	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
