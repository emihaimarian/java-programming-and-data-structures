package exercises;

import java.util.Scanner;

/**
 * (Physics: Motion) Newton’s equation of motion for distance covered given initial
 * velocity, constant acceleration, and total time is described by the expression:
 * s = u * t + 1/2 * a * t^2
 *  Write a program that prompts the user to enter the initial velocity u in meters/
 * second, time span t in seconds and acceleration a in meters/second2, and returns
 * the distance covered. Here is a sample run
 */
public class Exercise9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter u,t, and a: ");
        double initialVelocity = scanner.nextDouble();
        double timeSpan = scanner.nextDouble();
        double acceleration = scanner.nextDouble();

        System.out.println("The distance covered is " +  initialVelocity * timeSpan + 0.5 * acceleration * Math.pow(timeSpan, 2));
    }
}
