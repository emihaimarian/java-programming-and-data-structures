/**
 * (Partition of a list) Write the following method that partitions the list using the first element, called a pivot: 
 * public static int partition(int[] list) 
 * After the partition, the elements in the list are rearranged so all the elements before the pivot are less than or equal to the pivot, 
 * and the elements after the pivot are greater than the pivot. 
 * The method returns the index where the pivot is located in the new list. 
 * For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition, the list becomes {3, 2, 5, 9, 6, 8}. 
 * Implement the method in a way that takes at most list.length comparisons. See liveexample.pearsoncmg.com/dsanimation/QuickSortNeweBook.html 
 * for an animation of the implementation.
 * Write a test program that prompts the user to enter the size of the list and the contents of the list and displays the list after the partition. Here is a sample run.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter list size: ");
		final int ARRAY_SIZE = scanner.nextInt();

		int[] array = new int[ARRAY_SIZE];

		int count = 0;

		System.out.print("Enter list content: ");
		while (count < ARRAY_SIZE) {
			array[count] = scanner.nextInt();
			count++;
		}

		System.out.println("After the partition, the list is " + Arrays.toString(partition(array)));
	}

	public static int[] partition(int[] list) {

		int[] array = new int[list.length];

		int low = 0;
		int high = list.length - 1;
		int pivot = list[0];

		for (int index = 1; index < list.length; index++) {
			
			if (list[index] <= pivot)
				array[low++] = list[index];
			else
				array[high--] = list[index];
		}
		array[low] = pivot;

		return array;
	}
}
