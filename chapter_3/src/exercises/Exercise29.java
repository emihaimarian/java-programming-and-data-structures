/**
 * (Geometry: two circles) Write a program that prompts the user to enter the center
 * coordinates and radii of two circles and determines whether the second circle
 * is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2
 * is inside circle1 if the distance between the two centers 6 = r1 − r2
 * and circle2 overlaps circle1 if the distance between the two centers 6 =
 * r1 + r2. Test your program to cover all cases.)
 */
package src.exercises;

import java.util.Scanner;

public class Exercise29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle1’s center x-, y-coordinates, and radius: ");
        double c1x = scanner.nextDouble();
        double c1y = scanner.nextDouble();
        double c1Radius = scanner.nextDouble();

        System.out.println("Enter circle2’s center x-, y-coordinates, and radius: ");
        double c2x = scanner.nextDouble();
        double c2y = scanner.nextDouble();
        double c2Radius = scanner.nextDouble();

        double distance = Math.pow(Math.pow(c2x - c1x, 2) + Math.pow(c2y - c1y, 2), 0.5);

        if (distance <= Math.abs(c1Radius - c2Radius))
            System.out.println("circle2 is inside circle1");
        else if (distance <= c1Radius + c2Radius)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
    }

}
