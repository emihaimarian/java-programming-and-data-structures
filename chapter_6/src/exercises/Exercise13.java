/**
 * (Sum series) Write a method to compute the following series:
 * m(i) = 1/3 + 2/4 + ... + i/i + 2 
 * Write a test program that displays the following table:
 */
package exercises;

public class Exercise13 {

	public static void main(String[] args) {

		System.out.println("I" + "\t\t" + "m(i)");
		System.out.println("-----------------------");

		for (int i = 1; i < 20; i++) {
			String formated = String.format("%.3f", m(i));
			System.out.println(i + "\t\t" + formated);
		}
	}

	public static double m(int number) {

		double sum = 0;

		for (int i = 1; i <= number; i++) {
			sum += (double) i / (i + 2);
		}

		return sum;
	}

}
