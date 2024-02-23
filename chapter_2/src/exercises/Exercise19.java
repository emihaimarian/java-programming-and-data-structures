/**
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
 * its area. The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area = sqrt(s*(s-side1) * (s - side2) * (s -side3))
 */
package exercises;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of three points separated by spaces\n" +
                "like x1 y1 x2 y2 x3 y3: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = calculateDistance(x1, y1, x2, y2);
        double side2 = calculateDistance(x2, y2, x3, y3);
        double side3 = calculateDistance(x3, y3, x1, y1);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.format("The area of the triangle is %.1f", area);
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
