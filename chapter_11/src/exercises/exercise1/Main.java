/**
 * Write a test program that prompts the user to enter three sides of the triangle, a color, 
 * and a Boolean value to indicate whether the triangle is filled. 
 * The program should create a Triangle object with these sides and set the color and filled properties using the input. 
 * The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */
package exercises.exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double[] sidesFromInput = new double[3];

		System.out.print("Enter three side of the triangle: ");

		for (int i = 0; i < sidesFromInput.length; i++) {
			sidesFromInput[i] = scanner.nextDouble();
		}

		scanner.nextLine();

		System.out.println("Enter a color: ");
		String color = scanner.nextLine();

		System.out.println("Is the triangle filled (true / false)? ");
		boolean filled = scanner.nextBoolean();

		Triangle triangle = new Triangle(sidesFromInput[0], sidesFromInput[1], sidesFromInput[2], color, filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") + "filled");
	}
}
