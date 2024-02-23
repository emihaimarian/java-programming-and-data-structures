/**
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
 * user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
 * from Chinese
 * RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
 * dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 * Here are the sample runs:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = scanner.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convertOption = scanner.nextInt();

        double amount;
        switch (convertOption) {
            case 0:
                System.out.println("Enter the dollar amount: ");
                amount = scanner.nextDouble();
                System.out.println("$" + amount + " is " + (amount * exchangeRate) + " yuan");
                break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                amount = scanner.nextDouble();
                System.out.println(amount + " yuan is $" + ((int) ((amount * 100) / exchangeRate)) / 100.0);
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}
