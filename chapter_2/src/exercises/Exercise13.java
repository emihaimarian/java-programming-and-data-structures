package exercises;

import java.util.Scanner;

/**
 * (Financial application: compound value) Suppose you save $100 each month in a
 * savings account with annual interest rate 3.75%. Thus, the monthly interest rate is
 * 0.0375/12 = 0.003125. After the first month, the value in the account becomes
 * 100 * (1 + 0.003125) = 100.3125
 * After the second month, the value in the account becomes
 * (100 + 100.3125) * (1 + 0.003125) = 200.938
 * After the third month, the value in the account becomes
 * (100 + 200.938) * (1 + 0.003125) = 301.878
 *
 * Write a program that prompts the user to enter a monthly saving amount and displays
 * the account value after the sixth month. (In Exercise 5.30, you will use a loop
 * to simplify the code and display the account value for any month.)
 */
public class Exercise13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");

        double monthlySavingAmount  = scanner.nextDouble();

        double interestRate = 0.0357;
        double monthlyInterestRate = interestRate / 12;

        double accountValue = 0;

        for (int i = 0; i < 6; i++) {
            accountValue = (accountValue + monthlySavingAmount) * (1 + monthlyInterestRate);
        }

        System.out.printf("The account value after the sixth month is: %.2f%n", accountValue);
    }
}
