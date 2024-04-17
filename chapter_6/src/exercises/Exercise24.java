/**
 * (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the current time. 
 * Revise this example to display the current date and time. 
 * The calendar example in Listing 6.12, PrintCalendar.java, should give you some ideas on how to find the year, month, and day.
 */
package exercises;

public class Exercise24 {

	public static void main(String[] args) {

		final int RO_TIME_ZONE_OFFSET = 2;
		final double MILLISECONDS_IN_A_YEAR = 3.15569E10;
		final double MILLISECONDS_IN_A_MONTH = 2.63E9;
		final double MILLISECONDS_IN_A_DAY = 8.64E7;

		printCurrentTime(RO_TIME_ZONE_OFFSET);
		printCurrentDate(MILLISECONDS_IN_A_YEAR, MILLISECONDS_IN_A_MONTH, MILLISECONDS_IN_A_DAY);

	}

	public static void printCurrentDate(double millisecondsInAYear, double millisecondsInAMonth,
			double millisecondsInADay) {
		System.out.print(day(millisecondsInAYear, millisecondsInAMonth, millisecondsInADay) + "."
				+ month(millisecondsInAYear, millisecondsInAMonth) + "." + year(millisecondsInAYear));
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
}
