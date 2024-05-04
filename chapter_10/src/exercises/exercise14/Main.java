/**
 * Write a test program that creates two MyDate objects (using new MyDate() and 
 * new MyDate(34355555133101L)) and displays their year, month, and day. 
 * (Hint: The first two constructors will extract the year, month, and day 
 * from the elapsed time. For example, if the elapsed time is 561555550000  milliseconds, 
 * the year is 1987, the month is 9, and the day is 18. You may use the GregorianCalendar class 
 * discussed in Programming Exercise 9.5 to simplify coding.)
 */
package exercises.exercise14;

public class Main {

	public static void main(String[] args) {

		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(561555550000L);

		System.out.println(date1.toString());
		System.out.println(date2.toString());
	}
}
