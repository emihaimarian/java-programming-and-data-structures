/**
 * (Use the Date class) Write a program that creates a Date object, sets its elapsed time to 10000, 100000, 1000000, 10000000, 
 * 100000000, 1000000000, 10000000000, and 100000000000, and displays the date and time using the toString() method, respectively.
 */
package exercises.exercise3;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Date date = new Date();

		// i < 1e11 is equivalent to i < 100000000000
		for (long i = 10000; i < 1e11; i *= 10) {
			date.setTime(i);
			System.out.println(date.toString() + " for " + i);
		}
	}
}
