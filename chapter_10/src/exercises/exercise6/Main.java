/**
 * (Display the factorial values of numbers less than 9) Write a program that displays the factorials of all numbers less 
 * than 9 in decreasing order. Use the StackOfIntegers class to store the factorial values (e.g., 1, 2, 6, 24, . . . ) and 
 * retrieve and display them in reverse order.
 */
package exercises.exercise6;

import bookExercises.stackOfIntegers.StackOfIntegers;

public class Main {

	public static void main(String[] args) {

		StackOfIntegers stackOfIntegers = new StackOfIntegers();

		for (int i = 1; i < 9; i++) {
			// Best thing to do is to overload the method in stackOfIntegers for long
			// primitive
			stackOfIntegers.push((int) factorial(i));
		}

		while (!stackOfIntegers.empty()) {
			System.out.println(stackOfIntegers.pop() + " ");
		}
	}

	public static long factorial(int n) {

		long factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
