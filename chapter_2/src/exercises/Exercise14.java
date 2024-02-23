package exercises;

import java.util.Scanner;

/**
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and dividing,
 * by the square of your height in meters. Write a program that prompts the user to
 * enter a weight in pounds and height in inches and displays the BMI. Note one pound
 * is 0.45359237 kilograms and one inch is 0.0254 meters.
 *
 */

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = scanner.nextDouble();

        double weightToKilo = weight * 0.45359237;
        double heightToMeter = height * 0.0254;

        double bmi = weightToKilo / Math.pow(heightToMeter, 2);

        System.out.println("BMI is " + (int)(bmi * 10000) / 10000.0);
    }
}
