package exercises;

import java.util.Scanner;

/**
 * (Convert meters into feet) Write a program that reads a number in meters, converts
 * it to feet, and displays the result. One meter is 3.2786 feet.
 */
public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double METER_IN_FEET = 3.2786;

        System.out.println("Enter a value for meter: ");
        double meter = scanner.nextDouble();

        System.out.println(meter + " meters is " + meter * METER_IN_FEET + " feet");

    }
}
