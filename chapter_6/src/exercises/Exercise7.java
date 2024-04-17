/**
 * (Financial application: compute the future investment value) 
 * Write a method that computes future investment value at a given interest rate for a specified number of years. 
 * The future investment is determined using the formula in Programming Exercise 2.21.
 * Use the following method header: public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years)
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 * Write a test program that prompts the user to enter the investment amount (e.g., 1,000) and the interest rate (e.g., 9%) 
 * and prints a table that displays future value for the years from 1 to 30, as shown below:
 * 	The amount invested: 1000
 *  Annual interest rate: 9
 *
 *              Years   Future Value
 *              1       1093.80
 *              2       1196.41
 *                  ...
 *              29      13467.25
 *              30      14730.57
 * 
 */
package exercises;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = scanner.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = scanner.nextDouble();

		System.out.println("Years\t\tFuture Value");
		
        for (int i = 0; i < 30; i++){
            String formatted = String.format("%.2f",futureInvestmentValue(investmentAmount, annualInterestRate / 1200, i + 1));
            System.out.println(i+1 + "\t\t" + formatted);
        }
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}

}
