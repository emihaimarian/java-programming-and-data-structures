package bookExercises;

import java.util.Arrays;

public class Imuabil {

	public static void main(String[] args) {

		A objA = new A();
		int[] values = objA.getValues();

		values[0] = 100;
		values[1] = 20;

		for (int i = 0; i < objA.getValues().length; i++) {
			System.out.println("Value at index " + i + ": " + objA.getValues()[i]);
		}
	}
}

class A {

	private int[] values;

	public A() {
		this.values = new int[5];
	}

	public int[] getValues() {
		return values;
	}

	public int[] getValuesImmutable() {
		return Arrays.copyOf(values, values.length);
	}
}