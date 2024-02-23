/**
 * (Geometry: point on line segment) Exercise 3.32 shows how to test whether a
 * point is on an unbounded line. Revise Exercise 3.32 to test whether a point is on
 * a line segment. Write a program that prompts the user to enter the three points for
 * p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1. Here
 * are some sample runs:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise34 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2 : ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double comparison = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        String output1 = "(" + x2 + ", " + y2 + ") is ";
        String output2 = "on the line segment from (" + x0 + ", " + y0 + ") to " + "(" + x1 + ", " + y1 + ").";
        if (comparison == 0)
            System.out.println(output1 + output2);
        else
            System.out.println(output1 + "not " + output2);
    }
}
