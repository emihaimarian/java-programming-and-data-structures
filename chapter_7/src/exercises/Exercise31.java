/**
 * (Merge two sorted lists) Write the following method that merges two sorted lists 
 * into a new sorted list: public static int[] merge(int[] list1, int[] list2) 
 * Implement the method in a way that takes at most list1.length + list2. length comparisons. 
 * See liveexample.pearsoncmg.com/dsanimation/MergeSortNeweBook.html for an animation of the implementation. 
 * Write a test program that prompts the user to enter two sorted lists and displays the merged 
 * list. Here is a sample run. Note the first number in the input indicates the number 
 * of the elements in the list. This number is not part of the list.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter list1 size and contents: ");
		int[] list1 = createArrayFromInput(scanner);

		System.out.println("Enter list2 size and contents: ");
		int[] list2 = createArrayFromInput(scanner);

		System.out.println("list1 is " + Arrays.toString(list1));
		System.out.println("list2 is " + Arrays.toString(list2));

		System.out.println("The merged list is: " + Arrays.toString(merge(list1, list2)));
	}

	private static int[] createArrayFromInput(Scanner scanner) {

		final int LIST_SIZE = scanner.nextInt();
		int[] array = new int[LIST_SIZE];

		int count = 0;

		while (count < LIST_SIZE) {
			array[count] = scanner.nextInt();
			count++;
		}
		return array;
	}

	private static int[] merge(int[] list1, int[] list2) {

		final int ARRAY_SIZE = list1.length + list2.length;
		int[] merged = new int[ARRAY_SIZE];

		int i = 0, j = 0, k = 0;

		while (i < list1.length && j < list2.length) {

			if (list1[i] < list2[i])
				merged[k++] = list1[i++];
			else
				merged[k++] = list2[j++];
		}

		while (i < list1.length) {
			merged[k++] = list1[i++];
		}

		while (j < list2.length) {
			merged[k++] = list2[j++];
		}

		return merged;
	}
}
