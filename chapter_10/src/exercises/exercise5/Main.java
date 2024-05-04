/**
 * (Display the divisors) Write a program that prompts the user to enter a positive 
 * integer and displays all its divisors in decreasing order. 
 * For example, if the integer is 12 the divisors are displayed as 6, 4, 3, 2, 1. 
 * Use the StackOfIntegers class to store the factors (e.g., 1, 2, 3, 4, 6) and 
 * retrieve and display them in reverse order.
 */
package exercises.exercise5;

import java.util.Scanner;

import bookExercises.stackOfIntegers.StackOfIntegers;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int integer = scanner.nextInt();

		StackOfIntegers divisor = divisor(integer);

		while (!divisor.empty()) {
			System.out.println(divisor.pop() + " ");
		}

	}

	public static StackOfIntegers divisor(int number) {

		StackOfIntegers stackOfIntegers = new StackOfIntegers();

		for (int i = 1; i <= Math.sqrt(number); i++) {

			if (number % i == 0) {
				stackOfIntegers.push(i);

				if (i != number / i) {
					stackOfIntegers.push(number / i);
				}
			}
		}

		return stackOfIntegers;
	}
}
