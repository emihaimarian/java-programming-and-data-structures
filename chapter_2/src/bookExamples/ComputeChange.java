package bookExamples;

import java.util.Scanner;

public class ComputeChange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Receive the amount */
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        /* Find the number of one dollar */
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        /* Find the number of quarters in the remaining amount */
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        /* Find the number of dimes in remaining amount */
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        /* Find the number of nickels in remaining amount */
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        /* find the number of pennies in the remaining amount */
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
