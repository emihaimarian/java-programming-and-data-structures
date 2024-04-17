/**
 * (Statistics: compute deviation) Programming Exercise 5.45 computes the standard 
 * deviation of numbers. This exercise uses a different but equivalent formula to 
 * compute the standard deviation of n numbers.
 * 
 * mean = (x1 + x2 + x3 + ... xn) / n 
 * deviation = sqrt(((sum from i = 1 to n) * (xi - mean)^2) / (n - 1)) 
 * 
 * To compute the standard deviation with this formula, you have to store the individual 
 * numbers using an array, so they can be used after the mean is obtained. 
 * Your program should contain the following methods:
 *  Compute the deviation of double values public static double deviation(double[] x)
 *  Compute the mean of an array of double values public static double mean(double[] x)
 *  
 *  Write a test program that prompts the user to enter 10 numbers and displays the 
 *  mean and standard deviation
 */
package exercises;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int ARRAY_SIZE = 10;
		double[] array = new double[ARRAY_SIZE];

		int count = 0;

		System.out.print("Enter " + ARRAY_SIZE + " numbers: ");

		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextDouble();
			count++;
		}

		double mean = mean(array);

		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + deviation(array));
	}

	public static double deviation(double[] x) {

		double deviation = 0;
		double mean = mean(x);

		for (double e: x) {
			deviation += Math.pow(e - mean, 2);
		}

		return Math.sqrt(deviation / (x.length - 1));
	}

	public static double mean(double[] x) {

		double sum = 0;

		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}

		return sum / x.length;
	}
}