package bookExercises;

public class LinearSearch {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		linearSearch(array, 4);
	}

	public static int linearSearch(int[] array, int key) {

		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
}