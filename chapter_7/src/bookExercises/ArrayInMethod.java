package bookExercises;

import java.util.Arrays;

public class ArrayInMethod {

	public static void main(String[] args) {

		int[] array = { 6, 5, 4, 3, 2, 1 };
		int[] reversedArray = reverse(array);

		System.out.println(Arrays.toString(reversedArray));
	}

	public static int[] reverse(int[] list) {

		int[] result = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}

		return result;
	}

}
