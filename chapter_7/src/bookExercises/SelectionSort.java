package bookExercises;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = { 1, 9, 4, 6, 5, 4 };
		selectionSort(array);

		System.out.println(Arrays.toString(array));
	}

	public static void selectionSort(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {

			int currentSmallest = array[i];
			int indexOfTheSmallest = i;

			for (int j = i + 1; j < array.length; j++) {

				if (currentSmallest > array[j]) {
					currentSmallest = array[j];
					indexOfTheSmallest = j;
				}
			}

			if (currentSmallest != i) {
				array[indexOfTheSmallest] = array[i];
				array[i] = currentSmallest;
			}
		}
	}
}
