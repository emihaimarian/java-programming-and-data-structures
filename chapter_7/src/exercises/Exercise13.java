/**
 * (Random number selector) Write a method that returns a random number from a
 * list of numbers passed in the argument. The method header is specified as follows:
 * 	public static int getRandom(int... numbers)
 */
package exercises;

public class Exercise13 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(getRandom(array));
	}

	public static int getRandom(int... numbers) {

		int randomNumber = (int) (Math.random() * numbers.length);

		return numbers[randomNumber];
	}
}
