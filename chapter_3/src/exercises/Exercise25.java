/**
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and
 * (x2, y2) and on line 2 as (x3, y3) and (x4, y4).
 * The intersecting point of the two lines can be found by solving the following
 * linear equations:
 * (y1 - y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
 * (y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3
 * This linear equation can be solved using Cramer’s rule.
 * If the equation has no solutions, the two lines are parallel
 */
package src.exercises;

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The two lines are parallel.");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.println("The intersecting point is at (" + x + ", " + y + ").");
        }
    }
}
