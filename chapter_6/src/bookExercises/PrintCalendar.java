package bookExercises;

import java.util.Scanner;

public class PrintCalendar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter full year (e.g., 2012): ");
		int year = scanner.nextInt();

		System.out.print("Enter month as a number between 1 and 12: ");
		int month = scanner.nextInt();

		printMonth(year, month);
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}

	public static void printMonth(int year, int month) {
		System.out.print(month + " " + year);
	}

	public static void printMonthTitle(int year, int month) {
		System.out.println(" " + getMonthName(month) + " " + year);
		System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	public static void printMonthBody(int year, int month) {

		int startDay = getStartDay(year, month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		int i = 0;

		for (i = 0; i < startDay; i++)
			System.out.print(" ");

		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}

	public static String getMonthName(int month) {

		String monthName = "";

		switch (month) {
		case 1 -> monthName = "January";
		case 2 -> monthName = "February";
		case 3 -> monthName = "March";
		case 4 -> monthName = "April";
		case 5 -> monthName = "May";
		case 6 -> monthName = "June";
		case 7 -> monthName = "July";
		case 8 -> monthName = "August";
		case 9 -> monthName = "September";
		case 10 -> monthName = "October";
		case 11 -> monthName = "November";
		case 12 -> monthName = "December";
		}
		;

		return monthName;
	}

	public static int getStartDay(int year, int month) {

		final int START_DAY_FOR_JAN_1_1800 = 3;

		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	public static int getTotalNumberOfDays(int year, int month) {

		int total = 0;

		for (int i = 1800; i < year; i++) {

			if (isLeapYear(i))
				return total = total + 366;
			else
				return total = total + 365;
		}

		for (int i = 1; i < month; i++) {
			total += getNumberOfDaysInMonth(year, i);
		}
		return total;

	}

	public static int getNumberOfDaysInMonth(int year, int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0;
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}