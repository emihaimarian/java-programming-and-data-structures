/**
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 * java, to fix the possible loss of accuracy when converting a float value to an int
 * value. Read the input as a string such as "11.56". Your program should extract
 * the dollar amount before the decimal point, and the cents after the decimal
 * amount using the indexOf and substring methods.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String amount = scanner.nextLine();

        String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

        int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

        int numberOfQuarters = cents / 25;
        cents %= 25;

        int numberOfDimes = cents / 10;
        cents %= 10;

        int numberOfNickels = cents / 5;
        cents %= 5;

        System.out.println("Your amount " + amount + " consists of\n "
                + numberOfOneDollars + " dollars\n "
                + numberOfQuarters + " quarters\n "
                + numberOfDimes + " dimes\n "
                + numberOfNickels + " nickels\n "
                + cents + " pennies\n "
        );
    }
}
