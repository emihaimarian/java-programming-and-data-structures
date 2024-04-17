/**
 * (Computing lcm) Write a method that returns the lcm (least common multiple) of 
 *  an unspecified number of integers. The method header is specified as follows: 
 *  public static int lcm(int... numbers) 
 *  Write a test program that prompts the user to enter five numbers, invokes the 
 *  method to find the lcm of these numbers, and displays the lcm.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 5;
		int[] array = new int[ARRAY_SIZE];

		System.out.print("Insert " + ARRAY_SIZE + " integers: ");

		int count = 0;

		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextInt();
			count++;
		}

		System.out.print("The least common multiple of " + Arrays.toString(array) + " is " + lcm(array));
	}

	public static int lcm(int... numbers) {

		int lcm = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			int currentNumber = numbers[i];

			lcm = (lcm * currentNumber) / gcd(lcm, currentNumber);
		}

		return lcm;
	}

	public static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}
}
