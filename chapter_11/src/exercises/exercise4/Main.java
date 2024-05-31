/**
 * (Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers. 
 * The method returns null if the list is null or the list size is 0. public static Integer max(ArrayList<Integer> list) 
 * Write a test program that prompts the user to enter a sequence of 
 * numbers ending with 0 and invokes this method to return the largest number in the input.
 */
package exercises.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter integers: ");

		List<Integer> list = new ArrayList<>();

		while (scanner.nextInt() != 0) {
			list.add(scanner.nextInt());
		}

		System.out.println("Largest number from the list: " + max(list));
	}

	public static Integer max(List<Integer> list) {

		if (list == null)
			return null;

		if (list.size() == 0)
			return 0;

		return Collections.max(list);
	}
}