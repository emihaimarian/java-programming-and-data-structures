/**
 * (Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years and displays
 * the future investment value using the following formula:
 * futureInvestmentValue =
 * investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98.
 */

package exercises;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        System.out.printf("The future investment value is: %.2f%n", futureInvestmentValue);
    }
}
