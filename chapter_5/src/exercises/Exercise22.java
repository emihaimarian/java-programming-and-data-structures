/**
 * (Financial application: loan amortization schedule) The monthly payment for a given
 * loan pays the principal and the interest. The monthly interest is computed by multiplying
 * the monthly interest rate and the balance (the remaining principal). The principal
 * paid for the month is therefore the monthly payment minus the monthly interest. Write
 * a program that lets the user enter the loan amount, number of years, and interest rate
 * then displays the amortization schedule for the loan. Here is a sample run:
 * <p>
 * Loan Amount: 10000
 * Number of Years: 1
 * Annual Interest Rate: 7
 * <p>
 * Monthly Payment: 865.26
 * Total Payment: 10383.21
 * <p>
 * Payment#        Interest        Principal      Balance
 * 1               58.33           806.93         9193.07
 * 2               53.62           811.64         8381.43
 * ...
 * 11              10.00           855.26          860.27
 * 12              5.01            860.25          0.01
 */

package src.exercises;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();

        double balance = loanAmount;
        double monthlyInterestRate = annualInterestRate / (1200 * numberOfYears);
        double principal;
        double interest;
        double monthlyPayment = balance / (12 * numberOfYears) + (monthlyInterestRate * balance / (12 * numberOfYears));

        System.out.println("\nMonthly Payment: " + String.format("%.3f", monthlyPayment));
        System.out.println("Total Payment: " + String.format("%.3f", (monthlyPayment * numberOfYears * 12)) + "\n");

        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\t\t\tBalance");

        for (int i = 1; i <= numberOfYears * 12; i++) {

            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
        }

    }
}
