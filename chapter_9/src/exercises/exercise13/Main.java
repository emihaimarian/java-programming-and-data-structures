/**
 * * Write the following method that returns the location of the largest element in a two-dimensional array: 
 * 	public static Location locateLargest(double[][] a) 
 *  The return value is an instance of Location. 
 *  Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.
 */
package exercises.exercise13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns in the array: ");

		final int ROW_SIZE = scanner.nextInt();
		final int COLUMN_SIZE = scanner.nextInt();

		double[][] array = new double[ROW_SIZE][COLUMN_SIZE];

		System.out.println("Enter the array: ");

		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] = scanner.nextDouble();
			}
		}

		Location maxValue = locateLargest(array);
		System.out.println("The location of the largest element is " + maxValue.getMaxValue() + " at ("
				+ maxValue.getRow() + ", " + maxValue.getColumn() + ")");

	}

	public static Location locateLargest(double[][] a) {

		int initialRow = 0;
		int initialColumn = 0;

		double maxValue = a[initialRow][initialColumn];

		for (int row = 0; row < a.length; row++) {

			for (int column = 0; column < a[row].length; column++) {

				if (a[row][column] > maxValue) {
					maxValue = a[row][column];
					initialRow = row;
					initialColumn = column;
				}
			}
		}

		return new Location(initialRow, initialColumn, maxValue);
	}
}
