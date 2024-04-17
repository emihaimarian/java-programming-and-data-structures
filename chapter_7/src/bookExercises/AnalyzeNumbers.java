package bookExercises;

import java.util.Scanner;

public class AnalyzeNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of items: ");

		int number = scanner.nextInt();
		double[] numbers = new double[number];

		double sum = 0;

		System.out.print("Enter the numbers: ");

		for (int i = 0; i < number; i++) {
			numbers[i] = scanner.nextDouble();
			sum += numbers[i];
		}

		double average = sum / number;

		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > average)
				count++;
		}

		System.out.println("The average is " + average);
		System.out.println("Number of elements above the average is " + count);
	}

}
