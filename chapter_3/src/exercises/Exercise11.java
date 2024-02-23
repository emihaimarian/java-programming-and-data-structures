/**
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 has 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 has 31 days.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Enter a month: ");
        int month = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(months(month) + year + " has 30 days");
        } else if (month == 2) {
            System.out.println(months(month) + " " + year + " has" + (isLeapYear ? " 29 " : " 28 ") + "days");
        } else {
            System.out.println(months(month) + " " + year + " has 31 days");
        }
    }

    public static String months(int month) {

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
