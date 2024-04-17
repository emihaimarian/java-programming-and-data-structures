/**
 * (Math: approximate the square root) There are several techniques for implementing the sqrt method in the Math class. 
 * One such technique is known as the Babylonian method. 
 * It approximates the square root of a number, n, by repeatedly  performing the calculation using the following formula:
 * nextGuess = (lastGuess + n / lastGuess) / 2
 * 
 * When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root. 
 * The initial guess can be any positive value (e.g., 1).
 * This value will be the starting value for lastGuess. 
 * If the difference between nextGuess and lastGuess is less than a very small number, such as 0.0001,
 * you can claim that nextGuess is the approximated square root of n. 
 * If not, nextGuess becomes lastGuess and the approximation process continues. 
 * Implement the following method that returns the square root of n: public static double sqrt(long n)
 * Write a test program that prompts the user to enter a positive double value and displays its square root.
 */
package exercises;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive double value: ");
		long number = scanner.nextLong();

		if (number < 0) {
			System.out.println("Number is not positive, please try again");
			System.exit(-1);
		}

		System.out.println("The approximated square root of " + number + " is: " + sqrt(number));

	}

	public static double sqrt(long n) {

		long lastGuess = 1;
		long nextGuess = (lastGuess + n / lastGuess / 2);

		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}
}
