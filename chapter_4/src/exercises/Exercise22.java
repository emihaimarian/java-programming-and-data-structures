/**
 * (Loyalty card discount) Write a program that reads the following information
 * and prints discount information for the customer’s loyalty card at the local café:
 *  Customer’s name (e.g., Nessa)
 *  Number of coffees bought in total (e.g, 35)
 *  Coffee price (e.g., 3)
 *  Standard discount rate (e.g., 15%)
 *  Mailing list member discount rate (e.g., 3%)
 */
package src.exercises;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer’s name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter number of coffees bought in total: ");
        int numberOfCoffees = scanner.nextInt();

        System.out.println("Enter average coffee price: ");
        double averageCoffeePrice = scanner.nextDouble();

        System.out.println("Enter standard discount rate: ");
        double standardDiscountRate = scanner.nextDouble();

        System.out.println("Enter mailing-list member discount rate: ");
        double memberDiscountRate = scanner.nextDouble();

        double totalSpendingOnCoffee = averageCoffeePrice * numberOfCoffees;
        double standardDiscountRateInDollars = ((standardDiscountRate / 100) * totalSpendingOnCoffee) * 100;
        double memberDiscountRateInDollars = ((memberDiscountRate / 100) * totalSpendingOnCoffee) * 100;
        double totalSavedFromDiscount = standardDiscountRateInDollars + memberDiscountRateInDollars;

        double totalSpendingAfterDiscount = totalSpendingOnCoffee - totalSavedFromDiscount;

        System.out.println("Customer Name: " + customerName +
                "\nCoffees Bought: " + numberOfCoffees +
                "\nAverage Coffee Price: " + "$" + averageCoffeePrice +
                "\nTotal Spending on Coffee: " + "$" + totalSpendingOnCoffee +
                "\nDiscounts: " +
                "\n\t" + "Standard discount (" + (standardDiscountRate * 100) + "%): " + "$" + standardDiscountRateInDollars +
                "\n\t" + "Mailing list membership discount (" + (memberDiscountRate * 100) + "%): " + "$" + memberDiscountRateInDollars +
                "\n\t" + "Total Saved: " + totalSavedFromDiscount +
                "\nTotal Spending after Discount: " + "$" + totalSpendingAfterDiscount
        );
    }
}
