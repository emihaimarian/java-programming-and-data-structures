/**
 * (Geometry: point position) Programming Exercise 3.32 shows how to test whether a point is 
 * on the left side of a directed line, on the right, or on the same line. 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 
 * and displays whether p2 is on the left side of the line from p0 to p1, right side, 
 * the same line, or on the line segment. 
 */
package exercises;

import java.util.Scanner;

public class Exercise39 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three points for p0, p1, and p2: ");
		
		double x0 = scanner.nextDouble();
		double y0 = scanner.nextDouble();
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();

		System.out.print("(" + x2 + ", " + y2 + ") is on the ");
		
		if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
			System.out.print("line segment ");
		else if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
			System.out.print("left side of the line ");
		else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
			System.out.print("same line ");
		else
			System.out.print("right side of the line");
		System.out.println("from " + "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	}

	/**
	 * Return true if point (x2, y2) is on the left side of the directed line from
	 * (x0, y0) to (x1, y1)
	 */
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return pointPosition(x0, y0, x1, y1, x2, y2) > 0;
	}

	/**
	 * Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1)
	 */
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return pointPosition(x0, y0, x1, y1, x2, y2) == 0;
	}

	/**
	 * Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1,
	 * y1)
	 */
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (pointPosition(x0, y0, x1, y1, x2, y2) == 0 && (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1));
	}

	public static double pointPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}
}