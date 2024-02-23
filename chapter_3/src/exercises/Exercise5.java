/**
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week. Here is a sample run:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today’s day: ");
        int day = scanner.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int elapsedSinceToday = scanner.nextInt();

        int futureDate = (elapsedSinceToday - day) % 7;

        System.out.println("Today is " + daysOfTheWeek(day) + " and the future day is " + daysOfTheWeek(futureDate));
    }

    public static String daysOfTheWeek(int day){

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
}
