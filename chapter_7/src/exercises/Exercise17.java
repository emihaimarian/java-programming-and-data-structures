/**
 * (Sort students) Write a program that prompts the user to enter the number of students, the students’ names, 
 * and their scores and prints student names in decreasing order of their scores. 
 * Assume the name is a string without spaces, use the Scanner’s next() method to read a name.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the total number of stundets: ");
		int totalNumberOfStudents = scanner.nextInt();

		String[] stundetsName = new String[totalNumberOfStudents];
		int[] studentsScore = new int[totalNumberOfStudents];

		int count = 0;

		while (count < totalNumberOfStudents) {

			System.out.print("Enter the student name: ");
			stundetsName[count] = scanner.next();

			System.out.print("Enter the student score: ");
			studentsScore[count] = scanner.nextInt();

			count++;
		}

		sortStudentsByScore(stundetsName, studentsScore);
		System.out.println(Arrays.toString(stundetsName));

	}

	public static void sortStudentsByScore(String[] names, int[] scores) {

		for (int i = 0; i < scores.length; i++) {

			int maxIndex = i;

			for (int j = i + 1; j < scores.length; j++) {

				if (scores[j] > scores[maxIndex]) {
					maxIndex = j;
				}

				int tempScore = scores[i];
				scores[i] = scores[maxIndex];
				scores[maxIndex] = tempScore;

				String tempName = names[i];
				names[i] = names[maxIndex];
				names[maxIndex] = tempName;
			}
		}
	}
}