/**
 * (Conversions between pounds and kilograms) Write a class that contains the following two methods:
 *
 * public static double poundToKilogram(double pound)
 *
 * public static double kilogramToPound(double kilogram)
 *
 * The formula for the conversion is: pound = 0.453 * kilogram && kilogram = 2.204 * pound
 * Write a test program that invokes these methods to display the following tables:
 *
 *          Kilograms   Pounds  |   Pounds  Kilograms
 *          1           2.2     |   20      9.09
 *          3           6.6     |   25      11.36
 *          ...
 *          197         433.4   |   510     231.82
 *          199         437.8   |   515     234.09
 */
package exercises;

public class Exercise9 {

	public static void main(String[] args) {

		System.out.println("Kilograms\tPounds\t|" + "\tPounds\tKilograms");
		System.out.println("------------------------------------------------------");

		for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
			String kilogramToPound = String.format("%.1f", kilogramToPound(i));
			String poundToKilogram = String.format("%.3f", poundToKilogram(j));

			System.out.print(i + "\t\t" + kilogramToPound + "\t|" + "\t" + j + "\t" + poundToKilogram);
			System.out.println();
		}

	}

	public static double poundToKilogram(double pound) {
		return 0.453 * pound;
	}

	public static double kilogramToPound(double kilogram) {
		return 2.204 * kilogram;
	}

}
