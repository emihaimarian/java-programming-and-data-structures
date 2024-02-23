/**
 * (Geometry: two rectangles) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first, as
 * shown in Figure 3.9. Test your program to cover all cases.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter r1’s center x-, y-coordinates, width, and height: ");
        double r1x = scanner.nextDouble();
        double r1y = scanner.nextDouble();
        double r1Width = scanner.nextDouble();
        double r1Height = scanner.nextDouble();

        System.out.println("Enter r2’s center x-, y-coordinates, width, and height: ");
        double r2x = scanner.nextDouble();
        double r2y = scanner.nextDouble();
        double r2Width = scanner.nextDouble();
        double r2Height = scanner.nextDouble();

        if ((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) &&
                (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
                (r1Height / 2 + r2Height / 2 <= r1Height) &&
                (r1Width / 2 + r2Width / 2 <= r1Width))
            System.out.println("r2 is inside r1");
        else if ((r1x + r1Width / 2 > r2x - r2Width) || (r1y + r1Height / 2 > r2y - r2Height))
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");
    }
}