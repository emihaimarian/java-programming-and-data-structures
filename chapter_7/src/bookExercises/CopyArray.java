package bookExercises;

import java.util.Arrays;

/**
 * To copy the contents of one array into another you have to copy the array’s
 * individual elements into the other array. There are three ways to copy
 * arrays: Use a loop to copy individual elements one by one. Use the static
 * arraycopy method in the System class. Use the clone method to copy arrays;
 * this will be introduced in Chapter 13, Abstract Classes and Interfaces.
 */
public class CopyArray {

	public static void main(String[] args) {

		int[] sourceArray = { 2, 3, 4, 5, 10 };
		int[] targetArray1 = new int[sourceArray.length];
		int[] targetArray2 = new int[sourceArray.length];

		for (int i = 0; i < sourceArray.length; i++) {
			targetArray1[i] = sourceArray[i];
		}

		System.arraycopy(sourceArray, 0, targetArray2, 0, sourceArray.length);
		System.out.println(Arrays.toString(targetArray2));

		int[] array1;
		array1 = new int[10];

		array1 = new int[20];

		for (int i = 0; i < array1.length; i++) {
			int randomNumber = (int) (Math.random() * 100);
			array1[i] = randomNumber;
		}
		
		System.out.println(Arrays.toString(array1));
	}
}
