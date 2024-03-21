/**
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
 * console format to display two digits after the decimal point.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = scanner.nextDouble();

        // points of the pentagon
        double x1 = radius * Math.sin(Math.PI * 2 / 5.0);
        double y1 = radius * Math.cos(Math.PI * 2 / 5.0);

        double x2 = 0; // since cos(90) = 1
        double x3 = x1 * -1;

        double x4 = radius * Math.sin(Math.PI * 4 / 5.0) * -1;
        double y4 = radius * Math.cos(Math.PI / 5.0) * -1;

        double x5 = x4 * -1;

        String output = "The coordinates of five points on the pentagon are\n"
                + "(" + String.format("%.2f", x1) + ", " + String.format("%.2f", y1) + ")\n"
                + "(" + String.format("%.2f", x2) + ", " + String.format("%.2f", radius) + ")\n"
                + "(" + String.format("%.2f", x3) + ", " + String.format("%.2f", y1) + ")\n"
                + "(" + String.format("%.2f", x4) + ", " + String.format("%.2f", y4) + ")\n"
                + "(" + String.format("%.2f", x5) + ", " + String.format("%.2f", y4) + ")\n";

        System.out.println(output);
    }
}
