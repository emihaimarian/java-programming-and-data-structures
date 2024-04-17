package bookExercises;

public class FindTheSmallestIndex {

	public static void main(String[] args) {

		double[] array = new double[10];

		/** Finding the smallest index of the largest element */

		double max = array[0];
		int indexOfMax = 0;

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				indexOfMax = i;
			}
		}
		System.out.println(indexOfMax);
	}
}
