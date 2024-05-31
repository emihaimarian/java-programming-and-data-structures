/**
 * (Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList: 
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter five numbers, stores them in 
 * an array list, and displays their sum.
 */
package exercises.exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Double> list = new ArrayList<>();

		System.out.print("Enter 5 numbers: ");

		int count = 0;

		while (count < 5) {

			list.add(scanner.nextDouble());
			count++;
		}

		System.out.println(sum(list));
	}

	public static double sum(List<Double> list) {

		double sum = 0;

		for (Double number : list) {
			sum += number;
		}

		return sum;

	}
}
