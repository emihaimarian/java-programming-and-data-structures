/**
 * (Display the first days of each month) Write a program that prompts the user to
 * enter the year and first day of the year, then displays the first day of each month
 * in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
 * January 1, 2013, your program should display the following output:
 * January 1, 2013 is Tuesday
 * ...
 * December 1, 2013 is Sunday
 */
package src.exercises;

import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();

        System.out.print("Enter first day of the year: ");
        int day = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        for (int month = 1; month <= 12; month++) {

            String getMonth = returnMonth(month);

            day %= 7;
            String getDay = daysOfTheWeek(day);

            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12)
                day += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                day += 30;
            else {
                if (isLeapYear)
                    day += 29;
                else
                    day += 28;
            }
            System.out.println(getMonth + " 1, " + year + " is " + getDay);
        }

    }

    public static String daysOfTheWeek(int day) {

        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "";
        };
    }

    public static String returnMonth(int month) {

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
