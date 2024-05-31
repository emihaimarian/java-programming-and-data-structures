/**
 * (Remove duplicates) Write a method that removes the duplicate elements from an array list of integers 
 * using the following header: 
 * public static void removeDuplicate(ArrayList<Integer> list) 
 * Write a test program that prompts the user to enter 10 integers to a list and displays 
 * the distinct integers in their input order and separated by exactly one space.
 */
package exercises.exercise13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		System.out.print("Enter 10 integers: ");

		int count = 0;

		while (count < 10) {

			list.add(scanner.nextInt());
			count++;
		}

		removeDuplicate(list);

		System.out.print("The distinct integers are ");

		for (Integer integer : list) {
			System.out.println(integer + " ");
		}

	}

	public static void removeDuplicate(List<Integer> list) {

		for (int i = 0; i < list.size() - 1; i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
	}
}
