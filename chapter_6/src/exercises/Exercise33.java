/**
 * (Current date and time) Invoking System.currentTimeMillis() returns the elapsed time in milliseconds 
 * since midnight of January 1, 1970. Write a program that displays the date and time. Here is a sample run:
 * Current date and time is May 16, 2012 10:34:23
 */
package exercises;

public class Exercise33 {
	public static void main(String[] args) {

		final int RO_TIME_ZONE_OFFSET = 2;
		final double MILLISECONDS_IN_A_YEAR = 3.15569E10;
		final double MILLISECONDS_IN_A_MONTH = 2.63E9;
		final double MILLISECONDS_IN_A_DAY = 8.64E7;

		System.out.print("Current date and time is ");

		printCurrentDate(MILLISECONDS_IN_A_YEAR, MILLISECONDS_IN_A_MONTH, MILLISECONDS_IN_A_DAY);
		printCurrentTime(RO_TIME_ZONE_OFFSET);
	}

	public static void printCurrentDate(double millisecondsInAYear, double millisecondsInAMonth,
			double millisecondsInADay) {

		System.out.print(getMonth(month(millisecondsInAYear, millisecondsInAMonth)) + " "
				+ day(millisecondsInAYear, millisecondsInAMonth, millisecondsInADay) + ", "
				+ year(millisecondsInAYear) + " ");

	}

	public static void printCurrentTime(int offsetGMT) {

		final long totalMilliseconds = System.currentTimeMillis();

		final long totalSeconds = totalMilliseconds / 1000;
		final long currentSecond = totalSeconds % 60;

		final long totalMinutes = totalSeconds / 60;
		final long currentMinute = totalMinutes % 60;

		final long totalHours = (totalMinutes / 60) + offsetGMT;
		final long currentHour = totalHours % 24;

		System.out.print(currentHour + ":" + currentMinute + ":" + currentSecond + " ");

	}

	public static int year(double millisecondsInAYear) {
		return (int) (System.currentTimeMillis() / millisecondsInAYear) + 1970;
	}

	public static int month(double millisecondsInAYear, double millisecondsInAMonth) {
		return (int) ((System.currentTimeMillis() % millisecondsInAYear) / millisecondsInAMonth) + 1;
	}

	public static int day(double millisecondsInAYear, double millisecondsInAMonth, double millisecondsInADay) {
		return (int) (((System.currentTimeMillis() % millisecondsInAYear) % millisecondsInAMonth) / millisecondsInADay)
				+ 2;
	}

	public static String getMonth(int month) {
		return switch (month) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "August";
		case 9 -> "September";
		case 10 -> "October";
		case 11 -> "November";
		case 12 -> "December";
		default -> "";
		};
	}
}
