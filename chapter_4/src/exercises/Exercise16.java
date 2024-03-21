/**
 * (Days of a month) Write a program that prompts the user to enter the year and the
 * first three letters of a month name (with the first letter in uppercase) and displays
 * the number of days in the month. If the input for month is incorrect, display a
 * message.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Enter a month: ");
        String month = scanner.nextLine();

        if(month.isEmpty() || !Character.isLetter(month.charAt(0))){
            System.out.println("Invalid month");
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month.equals("Mar") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            System.out.println(month + year + " has 30 days");
        } else if (month.equals("Feb")) {
            System.out.println(month + " " + year + " has" + (isLeapYear ? " 29 " : " 28 ") + "days");
        } else {
            System.out.println(month + " " + year + " has 31 days");
        }
    }
}
