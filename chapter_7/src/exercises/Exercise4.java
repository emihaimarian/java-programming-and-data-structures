/**
 * (Analyze scores) Write a program that reads an unspecified number of scores and
 * determines how many scores are above or equal to the average, and how many
 * scores are below the average. Enter a negative number to signify the end of the
 * input. Assume the maximum number of scores is 100.
 */
package exercises;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[100];

		int number;
		int average = 0;
		int countNumbers = 0;
		int aboveAverage = 0;
		int belowAverage = 0;
		for (int i = 0; i < scores.length; i++) {

			number = scanner.nextInt();

			if (number < 0)
				break;

			scores[i] = number;
			average += number;
			countNumbers++;
		}

		average /= countNumbers;

		for (int i = 0; i < countNumbers; i++) {

			if (scores[i] >= average)
				aboveAverage++;
			else
				belowAverage++;
		}

		System.out.println("Average of scores: " + average);
		System.out.println("Number of scores above or equal to average: " + aboveAverage);
		System.out.println("Number of scores below average: " + belowAverage);
	}
}