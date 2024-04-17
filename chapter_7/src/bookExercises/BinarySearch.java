package bookExercises;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 2, 3, 4, 5, 6 };

		System.out.println(binarySearch(array, 1));
	}

	public static int binarySearch(int[] array, int key) {

		int low = 0;
		int high = array.length - 1;

		while (high >= low) {

			int middle = low + ((high - low) / 2);

			if (key < array[middle])
				high = middle - 1;
			else if (key == array[middle])
				return middle;
			else
				low = middle + 1;
		}

		/*
		 * Returning −low − 1 indicates not only that the key is not in the list, but
		 * also where the key would be inserted.
		 */
		return -low - 1;
	}
}
