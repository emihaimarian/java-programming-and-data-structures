/**
 * (Financial application: compound value) Suppose you save $100 each month
 * in a savings account with annual interest rate 3.75%.
 * The monthly interest rate is 0.0375 / 12 = 0.003125.
 * After the first month, the value in the account becomes:
 * 100 * (1 + 0.003125) = 100.3125
 * After the second month, the value in the account becomes
 * (100 + 100.3125) * (1 + 0.003125) = 200.938
 * After the third month, the value in the account becomes
 * (100 + 200.938) * (1 + 0.003125) = 301.878
 * and so on.
 * Write a program that prompts the user to enter an amount (e.g., 100), the annual
 * interest rate (e.g., 3.75), and the number of months (e.g., 6) and displays the
 * amount in the savings account after the given month.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        double calculateMonthlyInterestRate = annualInterestRate / 1200;

        double compoundFormula = 0;

        for (int i = 0; i <= months; i++) {
            compoundFormula = (amount + compoundFormula) * (1 + calculateMonthlyInterestRate);
        }

        System.out.println("After " + months + " months with the annual interest rate: " + annualInterestRate + " you`ll have in the saving account: " + compoundFormula);
    }
}
