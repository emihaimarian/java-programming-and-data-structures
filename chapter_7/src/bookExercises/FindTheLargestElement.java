package bookExercises;

public class FindTheLargestElement {

	public static void main(String[] args) {

		double[] array = new double[10];

		/** Finding the largest element */

		double max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[0] < array[i])
				max = array[i];
		}

		System.out.println(max);
	}
}
