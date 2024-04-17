package bookExercises;

import java.util.Arrays;

public class InitializingArraysWithRandomValues {
	
	public static void main(String[] args) {
		
		double[] array = new double[10];
		
		/** Initializing arrays with random values */
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 100;
		}

		System.out.println(Arrays.toString(array));
	}
}
