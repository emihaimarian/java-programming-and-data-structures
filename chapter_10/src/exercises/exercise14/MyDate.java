/**
 * (The MyDate class) Design a class named MyDate. The class contains:
 * The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January.
 * A no-arg constructor that creates a MyDate object for the current date.
 * A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds.
 * A constructor that constructs a MyDate object with the specified year, month, and day.
 * Three getter methods for the data fields year, month, and day, respectively.
 * A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.
 * (Hint: The first two constructors will extract the year, month, and day 
 * from the elapsed time. For example, if the elapsed time is 561555550000  milliseconds, 
 * the year is 1987, the month is 9, and the day is 18. You may use the GregorianCalendar class 
 * discussed in Programming Exercise 9.5 to simplify coding.)
 */
package exercises.exercise14;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private GregorianCalendar gregorianCalendar;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public MyDate() {
		this.gregorianCalendar = new GregorianCalendar();
		this.year = gregorianCalendar.get(Calendar.YEAR);
		this.month = gregorianCalendar.get(Calendar.MONTH);
		this.day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
	}

	public MyDate(long elapsedTime) {
		this.gregorianCalendar = new GregorianCalendar();
		setDate(elapsedTime);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	private void setDate(long elapsedTime) {

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);

		setYear(calendar.get(Calendar.YEAR));
		setMonth(calendar.get(Calendar.MONTH));
		setDay(calendar.get(Calendar.DAY_OF_MONTH));
	}

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
}
