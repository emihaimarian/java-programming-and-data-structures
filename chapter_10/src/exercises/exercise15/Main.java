/**
 * (Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle 
 * that encloses a set of points in a two-dimensional plane, as shown in Figure 10.24d. 
 * Write a method that returns a bounding rectangle for a set of points in a two-dimensional plane, as follows:
 * public static MyRectangle2D getRectangle(double[][] points)
 * The Rectangle2D class is defined in Programming Exercise 10.13. Write a test 
 * program that prompts the user to enter five points and displays the bounding rectangle’s center, width, and height.
 */
package exercises.exercise15;

import java.util.Scanner;

import exercises.exercise13.MyRectangle2D;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter five points: ");

		double[][] points = new double[5][2];

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = scanner.nextDouble();
			}
		}

		MyRectangle2D myRectangle = MyRectangle2D.getRectangle(points);

		System.out.println("The bounding rectangle's center (" + myRectangle.getX() + ", " + myRectangle.getY() + "),  "
				+ "width " + myRectangle.getWidth() + ", height " + myRectangle.getHeight());
	}

}
