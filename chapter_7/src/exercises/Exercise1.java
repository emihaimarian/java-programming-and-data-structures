/**
 * (Assign grades) Write a program that reads student scores, gets the best score, and 
 * then assigns grades based on the following scheme:  
 * 	Grade is A if score is >= best -5; 
 * 	Grade is B if score is >= best -10; 
 * 	Grade is C if score is >= best -15;
 * 	Grade is D if score is >= best -20; 
 * 	Grade is F otherwise. 
 * The program prompts the user to enter the total number of students, and then prompts the user to enter all of the scores 
 * and concludes by displaying the grades.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numberOfStudents = scanner.nextInt();

		int[] scoreArray = new int[numberOfStudents];

		System.out.print("Enter " + numberOfStudents + " " + "scores: ");

		int best = Integer.MIN_VALUE;

		for (int i = 0; i < numberOfStudents; i++) {

			int score = scanner.nextInt();

			if (score > 0) {
				scoreArray[i] = score;

				if (score > best)
					best = score;
			} else {
				System.out.println("Score cannot be negative. Please try again.");
				score = scanner.nextInt();
			}
		}

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Student " + i + " score is " + scoreArray[i] + " and grade is "
					+ getScoreChar(scoreArray[i], best));
		}
	}

	public static char getScoreChar(int score, int best) {

		if (score >= best - 5)
			return 'A';
		else if (score >= best - 10)
			return 'B';
		else if (score >= best - 15)
			return 'C';
		else if (score >= best - 20)
			return 'D';
		else
			return 'F';
	}
}
