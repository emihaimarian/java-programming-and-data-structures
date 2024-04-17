/**
 * (Display numbers) Write a method that prints numbers using the following header:
 * public static void printNumbers(int num1, int num2, int numberPerLine)
 * This method prints the characters between num1 and num2 with the specified numbers per line. 
 * Write a test program that prints ten characters per line from 1 to 100. 
 * Numbers are separated by exactly one space.
 */
package exercises;

public class Exercise12 {

	public static void main(String[] args) {

		printNumbers(1, 100, 10);
	}

	public static void printNumbers(int num1, int num2, int numberPerLine) {

		int counter = 0;

		for (int i = num1; i < num2 + 1; i++) {

			if (counter % numberPerLine == 0)
				System.out.println();

			System.out.print((i < 10) ? i + "  " : i + " ");

			counter++;
		}
	}
}