/**
 * (Combine two lists) Write a method that returns the union of two array lists of integers using the following header: 
 * public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
 * For example, the addition of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}. 
 * Write a test program that prompts the user to enter two lists, 
 * each with five integers, and displays their union. The numbers are separated by 
 * exactly one space.
 */
package exercises.exercise14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		insertInList(scanner, list1, "list1");
		insertInList(scanner, list2, "list2");

		System.out.println(union(list1, list2));
	}

	public static void insertInList(Scanner scanner, List<Integer> list, String listName) {

		System.out.print("Enter 5 integers in " + listName + ": ");

		int count = 0;

		while (count < 5) {
			list.add(scanner.nextInt());
			count++;
		}
	}

	public static List<Integer> union(List<Integer> list1, List<Integer> list2) {

		Stream<Integer> combinedStream = Stream.of(list1, list2).flatMap(Collection::stream);

		List<Integer> collectionCombined = combinedStream.collect(Collectors.toList());

		return collectionCombined;
	}
}
