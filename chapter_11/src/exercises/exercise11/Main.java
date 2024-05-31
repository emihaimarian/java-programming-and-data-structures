/**
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
 * public static void sort(ArrayList<Integer> list) 
 * Write a test program that prompts the user to enter five numbers, stores them in 
 * an array list, and displays them in increasing order.
 */
package exercises.exercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		System.out.print("Enter 5 integers: ");

		int count = 0;

		while (count < 5) {

			list.add(scanner.nextInt());
			count++;
		}

		sort(list);

		System.out.println(list);
	}

	public static void sort(List<Integer> list) {
		Collections.sort(list);
	}
}
