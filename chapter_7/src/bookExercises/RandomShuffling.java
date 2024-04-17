package bookExercises;

import java.util.Arrays;

public class RandomShuffling {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		/**
		 * Random shuffling: for each element array[i], randomly generate an index j and
		 * swap array[i] with array[j]
		 */

		for (int i = 0; i < array.length - 1; i++) {

			int j = (int) (Math.random() * array.length);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}

		System.out.println(Arrays.toString(array));
	}
}
