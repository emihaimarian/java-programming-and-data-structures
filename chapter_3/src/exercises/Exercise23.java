/**
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the rectangle centered at
 * (1, 1) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
 * (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
 * rectangle if its horizontal distance to (1, 1) is less than or equal to 10 / 2 and its
 * vertical distance to (1, 1) is less than or equal to 5.0 / 2. Test your program to
 * cover all cases.)
 */
package src.exercises;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double centerX = 1;
        double centerY = 1;
        double width = 10;
        double height = 5;

        double halfWidth = width / 2.0;
        double halfHeight = height / 2.0;

        double calculateHorizontalDistance = x - centerX;
        double calculateVerticalDistance = y - centerY;

        boolean insideRectangle = calculateHorizontalDistance <= halfWidth && calculateVerticalDistance <= halfHeight;

        System.out.println("Point " + "(" + x + " " + y + ")" + ((insideRectangle) ? " in " : " not in") + " the rectangle");

    }
}
