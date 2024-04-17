/**
 * (Average an array) Write two overloaded methods that return the average of an array with the following headers:
 * public static double average(int[] array) 
 * public static double average(double[] array) 
 * Write a test program that prompts the user to enter 10 integers, invokes the first 
 * method, then displays the average value; prompts the user to enter 10 double 
 * values, invokes the second method, then displays the average value. 
 */
package exercises;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 10;

		int[] intArray = new int[ARRAY_SIZE];
		double[] doubleArray = new double[ARRAY_SIZE];

		int intCounts = 0;
		int doubleCounts = 0;

		System.out.print("Insert " + ARRAY_SIZE + " integers: ");

		while (intCounts < ARRAY_SIZE) {
			intArray[intCounts] = scanner.nextInt();
			intCounts++;
		}

		System.out.print("Insert " + ARRAY_SIZE + " doubles: ");

		while (doubleCounts < ARRAY_SIZE) {
			doubleArray[doubleCounts] = scanner.nextInt();
			doubleCounts++;
		}

		System.out.println("Average of int array: " + average(intArray));
		System.out.println("Average of double array: " + average(doubleArray));
	}

	public static double average(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;
	}

	public static double average(double[] array) {

		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;
	}
}
