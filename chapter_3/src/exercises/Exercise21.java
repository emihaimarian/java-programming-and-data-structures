/**
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is
 * h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7
 * where:
 * h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 * Wednesday, 5: Thursday, and 6: Friday).
 * q is the day of the month.
 * m is the month (3: March, 4: April, ..., 12: December). January and February
 * are counted as months 13 and 14 of the previous year.
 * j is year / 100
 * k is the year of the century (i.e., year % 100).
 * Note all divisions in this exercise perform an integer division. Write a program
 * that prompts the user to enter a year, month, and day of the month, and displays
 * the name of the day of the week.
 * (Hint: January and February are counted as 13 and 14 in the formula, so you need
 * to convert the user input 1 to 13 and 2 to 14 for the month and change the year to
 * the previous year. For example, if the user enters 1 for m and 2015 for year, m will
 * be 13 and year will be 2014 used in the formula.)
 */
package src.exercises;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();

        System.out.println("Enter month: 1 - 12: ");
        int month = scanner.nextInt();

        System.out.println("Enter the day of the month: 1 - 31");
        int dayOfTheMonth = scanner.nextInt();

        //Convert January and February. They are counted as months 13 and 14 of the previous year.

        if (month == 1 || month == 2){
            month = (month == 1) ? 13 : 14;
            year--;
        }

        int dayOfTheWeek = (dayOfTheMonth + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        System.out.println("Day of the week is " + daysOfTheWeek(dayOfTheWeek));
    }

    public static String daysOfTheWeek(int day){

        return switch (day) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "";
        };
    }
}
