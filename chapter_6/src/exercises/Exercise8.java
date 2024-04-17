/**
 * (Conversions between mile and kilometer) Write a class that contains the following two methods:
 * Convert from Mile to Kilometer public static double mileToKilometer(double mile)
 * Convert from Kilometer to Mile public static double kilometerToMile(double kilometer)
 * The formula for the conversion is: 1 mile = 1.6 kilometers 
 * Write a test program that invokes these methods to display the following tables:
 *     Miles   Kilometers  |   Kilometers  Miles
 *		1       1.609      |   20          12.430
 *      2       3.218      |   25          15.538
 *      ...
 *      9       14.481     |   60          37.290
 *      10      16.090     |   65          40.398
 */
package exercises;

public class Exercise8 {

	public static void main(String[] args) {

		System.out.println("Miles\tKilometers\t|\t" + "Kilometers\tMiles");
		System.out.println("------------------------------------------------------");

		for (int i = 1, j = 20; i < 11; i++, j += 5) {
			String mileToKilometer = String.format("%.3f", mileToKilometer(i));
			String kilometerToMile = String.format("%.3f", kilometerToMile(j));

			System.out.print(i + "\t" + mileToKilometer + "\t\t|" + "\t" + j + "\t\t" + kilometerToMile);
			System.out.println();
		}

	}

	public static double mileToKilometer(double mile) {
		return mile * 1.609;
	}

	public static double kilometerToMile(double kilometer) {

		return kilometer / 1.609;
	}

}
