/**
 * (Geometry: Area of a five-pointed star) The area of a five-pointed star can be
 * computed using the following formula (r is the radius of the inscribing circle):
 * Area = 10 * ( (Math.tan(Math.PI/10) / (3 - Math.pow(Math.tan(Math.PI/10), 2) ) * Math.pow(radius,2)));
 * Write a program that prompts the user to enter the radius of the inscribing circle
 * and displays its area.
 *
 */
package src.exercises;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle inscribing the star: ");
        double radius = scanner.nextDouble();

        double area = 10 * ((Math.tan(Math.PI/10) / (3 - Math.pow(Math.tan(Math.PI/10), 2) ) * Math.pow(radius,2)));
        System.out.println("The area of the star is: " + area);
    }
}
