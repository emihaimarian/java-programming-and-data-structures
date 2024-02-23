package exercises;

import java.util.Scanner;

/**
 * (Geometry: distance of two points) Write a program that prompts the user to
 * enter two points (x1, y1) and (x2, y2) and displays their distance. The formula
 * for computing the distance is sqrt((x2 - x1)^2 + (y2 - y1)^2). Note you can use
 * Math.pow(a, 0.5) to compute sqrt(a).
 */
public class Exercise15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double calculateDistance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between the two points is " + calculateDistance);
    }
}
