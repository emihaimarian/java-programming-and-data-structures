package bookExercises;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new java.util.Scanner(System.in);

		int[][] matrix = new int[2][10];

		initArrayWithInputValues(matrix, scanner);

		initArrayWithRandomValues(matrix);

		printArray(matrix);
	}

	private static int sumAllElements(int[][] matrix) {

		int total = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
			}
		}

		return total;
	}

	private static int sumAllElementsByColumn(int[][] matrix) {

		int total = 0;

		for (int column = 0; column < matrix[0].length; column++) {
			for (int row = 0; row < matrix.length; row++)
				total += matrix[row][column];
			System.out.println("Sum for column " + column + " is " + total);
		}

		return total;
	}

	private static void printArray(int[][] matrix) {

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}

	private static void initArrayWithRandomValues(int[][] matrix) {

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 100);
			}
		}
	}

	private static void initArrayWithInputValues(int[][] matrix, Scanner scanner) {

		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = scanner.nextInt();
			}
		}
	}
}