/**
 * (Number of days in a year) Write a method that returns the number of days in a year using the following header:
 * public static int numberOfDaysInAYear(int year)
 * Write a test program that displays the number of days in the years between 2014 and 2034.
 */
package exercises;

public class Exercise16 {

	public static void main(String[] args) {

		System.out.println("Year" + "\t\tDays in year");
		for (int year = 2014; year <= 2034; year++) {
			System.out.println(year + "\t\t" + numberOfDaysInAYear(year));
		}
	}

	public static int numberOfDaysInAYear(int year) {

		if (isLeapYear(year))
			return 366;
		else
			return 365;
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
