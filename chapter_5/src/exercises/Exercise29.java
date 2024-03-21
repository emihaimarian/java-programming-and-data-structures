/**
 * Display calendars) Write a program that prompts the user to enter the year and
 * first day of the year and displays the calendar table for the year on the console. For
 * example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 * your program should display the calendar for each month in the year, as follows:
 * January 2013
 * Sun Mon Tue Wed Thu Fri Sat
 *  1   2   3   4   5
 * 6   7   8   9  10  11  12
 * 13  14  15  16  17  18  19
 * 20  21  22  23  24  25  26
 * 27  28  29  30  31
 */
package src.exercises;

import java.util.Scanner;

public class Exercise29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();

        System.out.print("Enter first day of the year: ");
        int day = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        for (int month = 1; month <= 12; month++) {

            for (int i = 0; i < 23 - (getMonth(month).length() / 2); i++) {
                System.out.print(" ");
            }

            System.out.println(getMonth(month));
            System.out.println("-----------------------------------------------");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");

            day %= 7;
            for (int i = 0; i <= day * 7; i++) {
                System.out.print(" ");
            }

            int lastDayOfMonth = 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12)
                lastDayOfMonth += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                lastDayOfMonth += 30;
            else {
                if (isLeapYear)
                    lastDayOfMonth += 29;
                else
                    lastDayOfMonth += 28;
            }

            for (int d = 1; d <= lastDayOfMonth; d++) {

                if (d < 10)
                    System.out.print(" ");
                if (day % 7 == 6)
                    System.out.print(d + "\n ");
                else {
                    System.out.print(d + "     ");
                    if (d == lastDayOfMonth)
                        System.out.println();
                }
                day++;
            }
            System.out.println();
        }
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