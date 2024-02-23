    /**
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
 * then displays the cost of the trip.
 */
package exercises;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = scanner.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.println("Enter price per gallon: ");
        double pricePerGallon  = scanner.nextDouble();

        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;

        System.out.format("The cost of driving is $ %.2f", costOfDriving);

    }
}
