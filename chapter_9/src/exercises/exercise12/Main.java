/**
 *	Write a program that prompts the user to enter these four endpoints and displays the intersecting point.  
 *  As discussed in Programming Exercise 3.25 the intersecting point can be found by solving a linear equation. 
 *  Use the LinearEquation class in Programming Exercise 9.11 to solve this equation.
 */
package exercises.exercise12;

import java.util.Scanner;

import exercises.exercise11.LinearEquation;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Point[] point = new Point[4];

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

		for (int i = 0; i < point.length; i++) {
			point[i] = new Point(scanner.nextDouble(), scanner.nextDouble());
		}

		/**
		 * point[0] x1, y1 point[1] x2, y2 point[2] x3, y3 point[3] x4, y4
		 */
		double a = point[0].getY() - point[1].getY();
		double b = -(point[0].getX() - point[1].getX());
		double c = point[2].getY() - point[3].getY();
		double d = -(point[2].getX() - point[3].getX());
		double e = a * point[0].getX() - (-b) * point[0].getY();
		double f = c * point[2].getX() - (-d) * point[2].getY();

		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

		if (!linearEquation.isSolvable())
			System.out.println("The equation has no solution.");
		else
			System.out.println("x: " + linearEquation.getX() + ", y:" + linearEquation.getY());

	}
}
