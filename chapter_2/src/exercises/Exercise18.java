/**
 * (Print a table) Write a program that displays the following table. Calculate the
 * middle point of two points.
 *    a        b      Middle Point
 * (0, 0)   (2, 1)    (1.0, 0.5)
 * (1, 4)   (4, 2)    (2.5, 3.0)
 * (2, 7)   (6, 3)    (4.0, 5.0)
 * (3, 9)   (10, 5)   (6.5, 7.0)
 * (4, 11)  (12, 7)   (8.0, 9.0)

 */
package exercises;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter (a1, a2): ");
        double a1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();

        System.out.println("Enter (b1, b2): ");
        double b1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        /* For whatever reason this is not the correct formula for this exercise
        double middleX = (a1 + a2) / 2;
        double middleY = (b1 + b2) / 2;
        */

        double middleX = (a1 + b1) / 2;
        double middleY = (a2 + b2) / 2;

        System.out.println("a b Middle Point");

        System.out.printf("(%d, %d)\t(%d, %d)\t(%.1f, %.1f)%n", (int)a1, (int)b1, (int)a2, (int)b2, middleX, middleY);
    }
}
