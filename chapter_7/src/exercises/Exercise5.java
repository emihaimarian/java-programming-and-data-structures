/**
 * (The number of even numbers and odd numbers) Write a program that reads ten integers, and then display the number of even numbers 
 * and odd numbers. Assume that the input ends with 0.
 */
package exercises;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int odd = 0;
		int even = 0;

		System.out.print("Enter numbers: ");

		while (true) {

			int number = scanner.nextInt();

			if (number == 0)
				break;
			else if (number % 2 == 0)
				even++;
			else
				odd++;

		}

		System.out.println("The number of odd numbers: " + odd);
		System.out.println("The number of even numbers: " + even);
	}
}
