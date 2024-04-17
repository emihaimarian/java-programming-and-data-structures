/**
 * (Estimate pi) pi can be computed using the following summation:
 * m(i) = 4 * ( 1 - 1/3 + 1/5 - 1/7 + 1/9 + ... + (-1)^i+1/2i - 1)
 * Write a method that returns m(i) for a given i
 */
package exercises;

public class Exercise14 {

	public static void main(String[] args) {

		System.out.println("i\t\tm(i)");
		System.out.println("-----------------------------");

		for (int i = 1; i < 902; i += 100) {
			String formattEstimatedPI = String.format("%.4f", estimatePI(i));
			System.out.println(i + "\t\t" + formattEstimatedPI);
		}

	}

	public static double estimatePI(int number) {

		double pi = 0;

		if (number == 1)
			return 4.0;

		for (int i = 1; i < number; i++) {

			double numerator = Math.pow(-1, i + 1);
			double denominator = (2 * i) - 1;

			pi += numerator / denominator;
		}

		return 4 * pi;
	}
}
