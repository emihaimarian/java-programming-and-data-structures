/**
 * (Financial application: compute CD value) Suppose you put $10,000 into a CD with an annual percentage yield of 6.15%.
 * After one month, the CD is worth
 * 10000 + 10000 * 6.15 / 1200 = 10051.25
 * After two months, the CD is worth
 * 10051.25 + 10051.25 * 6.15 / 1200 = 10102.76
 * After three months, the CD is worth
 * 10102.76 + 10102.76 * 6.15 / 1200 = 10154.53
 * and so on.
 * Write a program that prompts the user to enter an amount (e.g., 10000), the
 * annual percentage yield (e.g., 6.15), and the number of months (e.g., 18) and
 * displays a table as shown in the sample run.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter annual percentage yield:: ");
        double annualPercentageYield = scanner.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int months = scanner.nextInt();

        for (int i = 0; i <= months; i++) {
            amount += amount * (annualPercentageYield / 1200);

            System.out.println("Month\tCD Value");
            System.out.println(months + "\t\t" + amount);
        }
    }
}
