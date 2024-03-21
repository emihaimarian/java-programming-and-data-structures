/**
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all angles have the same degree (i.e.,
 * the polygon is both equilateral and equiangular). The formula for computing the
 * area of a regular polygon is: area = (n * Math.pow(s,2)) / (4 * Math.tan(Math.PI/n));
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        int numberOfSides = scanner.nextInt();

        System.out.println("Enter the side: ");
        double side = scanner.nextDouble();

        double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/numberOfSides));

        System.out.println("The area of the polygon is: " + area);

    }
}
