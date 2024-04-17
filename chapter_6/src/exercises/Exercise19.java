/**
 * Write a test program that reads three sides for a triangle and uses the isValid method to test if the input is valid 
 * and uses the area method to obtain the area.
 * The program displays the area if the input is valid. Otherwise, it displays that the input is invalid. 
 * The formula for computing the area of a triangle is given in Programming Exercise 2.19.
 
 */

package exercises;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three sides for a triangle: ");
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();

		if (isValid(side1, side2, side3))
			System.out.println("The area of the triangle is " + area(side1, side2, side3));
		else
			System.out.println("Input is invalid");
	}

	/** Return true if the sum of every two sides is greater than the third side. */
	public static boolean isValid(double side1, double side2, double side3) {
		return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
	}

	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {

		double semiPerimeter = (side1 + side2 + side3) / 2;

		// Heron`s Formula
		return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

	}
}
