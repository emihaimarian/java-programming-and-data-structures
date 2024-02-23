/**
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in pounds).
 * c(w) = 2.5, if 0 < w <= 2
 * c(w) = 4.5, if 2 < w <= 4
 * c(w) = 7.5, if 4 < w <= 10
 * c(w) = 10.5, if 0 < w <= 20
 * Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost. If the weight is greater than 20, display a message “the
 * package cannot be shipped.”
 */
package src.exercises;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight of the package: ");
        double weight = scanner.nextDouble();

        if (weight <= 0 || weight > 20){
            System.out.println("The package cannot be shipped");
        }

        double dollarPerPound;

        if (weight > 0 && weight <= 2) {
            dollarPerPound = 2.5;
            printShippingCost(weight, dollarPerPound);
        } else if (weight > 2 && weight <= 4) {
            dollarPerPound = 4.5;
            printShippingCost(weight, dollarPerPound);
        } else if (weight > 4 && weight <= 10) {
            dollarPerPound = 7.5;
            printShippingCost(weight, dollarPerPound);
        } else if (weight > 0 && weight <= 20) {
            dollarPerPound = 10.5;
            printShippingCost(weight, dollarPerPound);
        }
    }

    public static void printShippingCost(double weight, double dollarPerPound){
        System.out.println("The shipping cost is: " + (weight * dollarPerPound) + ".");
    }
}
