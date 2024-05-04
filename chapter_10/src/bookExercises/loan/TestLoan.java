package bookExercises.loan;

import java.util.Scanner;

public class TestLoan {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate = scanner.nextDouble();

		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = scanner.nextInt();

		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = scanner.nextDouble();

		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

		System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	}
}
