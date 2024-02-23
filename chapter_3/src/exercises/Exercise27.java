/**
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 * shown below. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a point’s x- and y-coordinates: ");

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double intersectX = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersectY = (-y * (200 * 100)) / (-y * 200 - x * 100);

        System.out.println("The point " + ((x > intersectX || y > intersectY) ? "is not " : "is ") + "in the triangle");

    }
}
