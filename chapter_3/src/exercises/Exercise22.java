/**
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle, as shown in Figure 3.7a.
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * The formula for computing the distance is sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2). Test your
 * program to cover all cases.)
 */
package src.exercises;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double centerX = 0;
        double centerY = 0;

        double distance = Math.sqrt(Math.pow((x - centerX), 2) + Math.pow((y - centerY), 2));
        boolean inCircle = distance <= 10;

        System.out.println("Point " + "(" + x + " " + y + ")" + ((inCircle) ? " in " : " not in") + " the circle");

    }
}
