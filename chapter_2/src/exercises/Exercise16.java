/**
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is are = 3*sqrt(3)/2 * s^2 where s is the length of a side.
 *
 */
package exercises;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the side: ");

        double lengthOfTheSide = scanner.nextDouble();

        double area = (3 * Math.sqrt(3)) / 2 * Math.pow(lengthOfTheSide, 2);

        System.out.format("The area of the hexagon is %.4f" , area);

    }
}
