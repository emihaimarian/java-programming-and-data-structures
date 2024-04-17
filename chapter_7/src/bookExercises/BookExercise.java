package bookExercises;

import java.util.Arrays;

public class BookExercise {

	public static void main(String[] args) {

		/**
		 * Create an array to hold 10 double values.
		 */
		double[] arrayInitializer = new double[10];

		/**
		 * Assign the value 5.5 to the last element in the array.
		 */

		double[] assignValueInLastElement = { 2, 3, 4, 5 };
		assignValueInLastElement[assignValueInLastElement.length - 1] = 5.5;

		System.out.println(Arrays.toString(assignValueInLastElement));

		/**
		 * Display the sum of the first two elements. Easy way array[0] + array[1]
		 */

		int[] displaySumOfFirstTwo = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < displaySumOfFirstTwo.length; i++) {

			while (i <= 1) {
				sum += displaySumOfFirstTwo[i];
				break;
			}
		}

		System.out.println(sum);

		/**
		 * Write a loop that computes the sum of all elements in the array.
		 */

		int[] sumOfAllElements = { 1, 2, 3, 4, 5, 6 };
		int sumOfAllElementsFromArray = 0;
		for (int i = 0; i < sumOfAllElements.length; i++) {

			sumOfAllElementsFromArray += sumOfAllElements[i];
		}

		System.out.println(sumOfAllElementsFromArray);

		/**
		 * Write a loop that finds the minimum element in the array
		 */

		int[] minimumElementArray = { 10, 32, 43, 24, 5 };
		int key = minimumElementArray[0];

		for (int i = 1; i < minimumElementArray.length; i++) {

			if (minimumElementArray[i] < key) {
				key = minimumElementArray[i];
			}
		}

		System.out.println(key);

		/**
		 * Randomly generate an index and display the element of this index in the
		 * array.
		 */

		int[] array = { 1, 2, 3, 4, 5, 6 };

		int toDisplay = 0;

		for (int i = 0; i < array.length; i++) {
			int randomIndex = (int) (Math.random() * array.length);
			toDisplay = array[randomIndex];
		}
		
		System.out.println(toDisplay);
		
		
	}

}
