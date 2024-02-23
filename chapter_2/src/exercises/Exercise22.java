/**
 * (Financial application: monetary units) Rewrite Listing 2.10,
 * ComputeChange.java, to fix the possible loss of accuracy when converting
 * a double value to an int value. Enter the input as an integer whose last
 * two digits represent the cents. For example, the input 1156 represents 11
 * dollars and 56 cents.
 */
package exercises;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount as an integer (e.g., 1156 for $11.56): ");
        int amountInCents = scanner.nextInt();

        // Extract dollars and cents
        int dollars = amountInCents / 100;
        int cents = amountInCents % 100;

        /* Find the number of one dollar */
        int numberOfOneDollars = dollars;

        /* Find the number of quarters in the remaining amount */
        int numberOfQuarters = cents / 25;
        cents %= 25;

        /* Find the number of dimes in remaining amount */
        int numberOfDimes = cents / 10;
        cents %= 10;

        /* Find the number of nickels in remaining amount */
        int numberOfNickels = cents / 5;
        cents %= 5;

        /* find the number of pennies in the remaining amount */
        int numberOfPennies = cents;

        System.out.println("Your amount $" + dollars + "." + (cents < 10 ? "0" + cents : cents) + " consists of:");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }

}
