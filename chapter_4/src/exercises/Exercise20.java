/**
 * (Check IMEI number) Write a program that prompts a user to enter the
 * International Mobile Equipment Identity (IMEI) number in the format
 * DD-DDDDDD-DDDDDD-D, where D is a digit. Your program should check
 * whether the input is valid.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String IMEI_FORMAT = "DD-DDDDDD-DDDDDD-D";

        System.out.println("Enter IMEI number (International Mobile Equipment Identity) in the format DD-DDDDDD-DDDDDD-D: ");
        String inputImei = scanner.nextLine();

        String digitRegex = "^\\d{2}-\\d{6}-\\d{6}-\\d$";

        if (inputImei.length() != IMEI_FORMAT.length() && !(inputImei.matches(digitRegex)))
            System.out.println(inputImei + " is an invalid IMEI number. The IMEI should contain " + IMEI_FORMAT.length() + " characters or format is invalid");
        else
            System.out.println(inputImei + " is a valid IMEI number");
    }
}
