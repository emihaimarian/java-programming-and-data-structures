/**
 * (Addition quiz) Rewrite Listing 5.1, RepeatAdditionQuiz.java, to alert the user 
 * if an answer is entered again. (Hint: use an array list to store answers.)
 */
package exercises.exercise16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		System.out.print("What is " + number1 + " + " + number2 + "? ");

		int answer = scanner.nextInt();
		list.add(answer);

		while (number1 + number2 != answer) {

			System.out.print("Wrong. Try again. What is " + number1 + " + " + number2 + "? ");

			answer = scanner.nextInt();

			if (list.contains(answer)) {
				System.out.println("You already entered " + answer);
			} else {
				list.add(answer);
			}
		}

		System.out.println("You got it!");
	}
}
