package bookExercises;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = null;
		m1(date);
		// Is null
		System.out.println(date);

		Date date2 = new Date(1234567);
		m2(date2);
		System.out.println(date2.getTime());

		Date date3 = new Date(1234567);
		m3(date3);
		System.out.println(date3.getTime());

		Date date4 = new Date(1234567);
		m4(date4);
		System.out.println(date4.getTime());

		Date[] dates = new Date[5];
		// Null
		System.out.println(dates[0]);
		System.out.println(dates[0].toString());

	}

	public static void m1(Date date) {
		date = new Date();
	}

	public static void m2(Date date) {
		date = new Date(7654321);
	}

	public static void m3(Date date) {
		date.setTime(7654321);
	}

	public static void m4(Date date) {
		date = null;
	}
}
