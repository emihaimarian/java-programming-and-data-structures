/**
 * (Compute the perimeter of a rectangle) Write a program that read two edges of a
 * rectangle and computes the perimeter if the input is valid. Otherwise, display that
 * the input is invalid. The input is valid if both edges are of different lengths.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        double perimeter = (length + width) * 2;

        if (length <= 0 || width <= 0 || length == width)
            System.out.println("The input is invalid, both edges should be different in lengths and both of them should be greater than 0.");
        else
            System.out.println("Perimeter is: " + perimeter);
    }
}
