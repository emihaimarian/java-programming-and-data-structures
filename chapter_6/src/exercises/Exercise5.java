/**
 * (Sort three numbers) Write a method with the following header to display three numbers in decreasing order:
 * public static void displaySortedNumbers(double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the 
 * method to display them in decreasing order.
 */
package exercises;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		System.out.print("Enter third number: ");
		int num3 = scanner.nextInt();

		displaySortedNumbers(num1, num2, num3);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double temp;

        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

		System.out.println("Number in decrese order " + num1 + " " + num2 + " " + num3);
	}
}
