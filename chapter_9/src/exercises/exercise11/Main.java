/**
 * Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If a * d - b* c = 0, report that “The equation has no solution.”
 */
package exercises.exercise11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");

		double[] values = new double[6];

		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextDouble();
		}

		LinearEquation linearEquation = new LinearEquation(values[0], values[1], values[2], values[3], values[4],
				values[5]);

		if (!linearEquation.isSolvable())
			System.out.println("The equation has no solution.");
		else
			System.out.println("x: " + linearEquation.getX() + ", y:" + linearEquation.getY());
	}
}
