package exercises;

import java.util.Scanner;

/**
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the maximum number of years and remaining
 * days for the minutes. For simplicity, assume that a year has 365 days
 */
public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        long inputMinutes = scanner.nextLong();

        long minutesInADay = 24 * 60;
        long minutesInAYear = 365 * minutesInADay;
        long years = inputMinutes / minutesInAYear;
        long remainingMinutes = inputMinutes % minutesInAYear;
        long days = remainingMinutes / minutesInADay;

        System.out.println(inputMinutes + " minutes is approximately " + years + " years and " + days + " days.");

    }
}
