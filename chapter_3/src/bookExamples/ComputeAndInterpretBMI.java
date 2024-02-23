/**
 * Write a program that prompts the user to enter a weight in pounds and height in inches and
 * displays the BMI. Note that one pound is 0.45359237 kilograms, and one inch is 0.0254
 * meters.
 */
package src.bookExamples;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

    public static void main(String[] args) {

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + bmi);

        if(bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
