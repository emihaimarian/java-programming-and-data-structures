/**
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet and
 * 10 inches, you will enter 5 for feet and 10 for inches.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double METERS_PER_FEET = 0.3048;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter feet: ");
        double feet = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;

        double heightInMeters = (height * METERS_PER_INCH) + (feet * METERS_PER_FEET);
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
