/**
 * (Shuffle ArrayList) Write the following method that shuffles the elements in an ArrayList of integers:
 * public static void shuffle(ArrayList<Integer> list)
 */
package exercises.exercise7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		shuffle(list);
		System.out.println(list.toString());

	}

	public static void shuffle(List<Integer> list) {
		Collections.shuffle(list);
	}
}
