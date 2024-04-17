package bookExercises;

import java.util.Arrays;
import java.util.Scanner;

public class InitializingAraysWithInputValues {

	public static void main(String[] args) {

		double[] array = new double[10];

		Scanner scanner = new Scanner(System.in);

		/**
		 * Initializing arrays with input values
		 */
		System.out.print("Enter " + array.length + " values: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextDouble();
		}
		System.out.println(Arrays.toString(array));

	}
}
