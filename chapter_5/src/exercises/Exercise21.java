/**
 * (Financial application: compare loans with various interest rates) Write a program
 * that lets the user enter the loan amount and loan period in number of years
 * and displays the monthly and total payments for each interest rate starting from
 * 5% to 10%, with an increment of 1/4. Here is a sample run:
 * <p>
 * Loan Amount: 10000
 * Number of Years: 5
 * <p>
 * Interest Rate       Monthly Payment         Total Payment
 * 5.000%              188.71                  11322.74
 * 5.250%              189.86                  11391.59
 * 5.500%              191.01                  11460.70
 * ...
 * 9.750%              211.24                  12674.55
 * 10.000%             212.47                  12748.23
 */

package src.exercises;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Number of Years: ");
        int noOfYears = scanner.nextInt();

        System.out.print("\nInterest Rate\t\tMonthly Payment\t\tTotal Payment\n");

        for (double iR = 5.0; iR <= 10.0; iR += 0.25) {

            String interestRate = String.format("%.3f", iR);

            double monthlyPayment = loanAmount * (iR / 1200) / (1 - 1 / Math.pow(1 + iR / 1200, noOfYears * 12));

            double totalCost = monthlyPayment * 12 * noOfYears;

            System.out.println(interestRate + "%\t\t\t\t\t" + String.format("%.2f", monthlyPayment)
                    + "\t\t\t\t" + String.format("%.2f", totalCost));
        }
    }
}