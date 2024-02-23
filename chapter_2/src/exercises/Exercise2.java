package exercises;

import java.util.Scanner;

/**
 * (Compute the volume of a triangle) Write a program that reads in the length of
 * sides of an equilateral triangle and computes the area and volume using the following
 * formulas:
 * area = sqrt(3)/4 * (length of the sides)
 * volume = area * length
 */

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the equilateral triangle:");

        double lengthOfSides = scanner.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(lengthOfSides , 2);
        double volume = area * lengthOfSides;

        System.out.println("The area is " + (int)(area * 100) / 100.0);
        System.out.println("The volume of the Triangular prism is " + (int)(volume * 100) / 100.0);


    }
}
