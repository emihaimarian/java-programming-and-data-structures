package bookExercises;

/**
 * When passing an array to a method, the reference of the array is passed to
 * the method.
 */
public class PassingArrayToMethods {

	public static void main(String[] args) {
		printArray(new int[] { 3, 1, 2, 6, 4, 2 });

		int x = 1;
		int[] y = new int[10];
		
		m(x, y);

		System.out.println("x is " + x);
		System.out.println("y[0] is " + y[0]);

	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

	public static void m(int number, int[] numbers) {
		number = 1001;
		numbers[0] = 5555;
	}
}
