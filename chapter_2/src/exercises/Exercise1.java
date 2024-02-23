package exercises;

import java.util.Scanner;

/**
*(Convert mile to kilometer) Write a program that reads a mile in a double value
*from the console, converts it to kilometers, and displays the result. The formula
*for the conversion is as follows: 1 mile = 1.6 kilometers
 */
public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
        double input = scanner.nextDouble();

        System.out.println(input + " miles is " + (float) (input * 1.6) + " kilometers");

    }
}
