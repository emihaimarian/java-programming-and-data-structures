package bookExercises;

public class SwapingIntAndArrayTest {

	public static void main(String[] args) {

		int[] a = { 1, 2 };

		swapPassingIntegers(a[0], a[1]);
		System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);

		swapPassingArray(a);
		System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
	}

	// Not swapping the array values
	public static void swapPassingIntegers(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}

	// This is how you swap values into array -> passing the reference of array;
	public static void swapPassingArray(int[] a) {

		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
}
