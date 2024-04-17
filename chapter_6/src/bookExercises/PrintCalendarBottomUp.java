package bookExercises;

import java.util.Scanner;

public class PrintCalendarBottomUp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter full year (e.g., 2012): ");
		int year = scanner.nextInt();

		System.out.print("Enter month as a number between 1 and 12: ");
		int month = scanner.nextInt();

		printMonth(year, month);
	}

	public static void printMonth(int year, int month) {
		System.out.print(month + " " + year);
	}

	public static void printMonthTitle(int year, int month) {
	}

	public static void printMonthBody(int year, int month) {
	}

	public static String getMonthName(int month) {
		return "January";
	}

	public static int getStartDay(int year, int month) {
		return 1;
	}

	public static int getTotalNumberOfDays(int year, int month) {
		return 1000;
	}

	public static int getNumberOfDaysInMonth(int year, int month) {
		return 31;
	}

	public static boolean isLeapYear(int year) {
		return true;
	}
}