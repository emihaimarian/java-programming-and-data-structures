package exercises;

import java.util.Scanner;

/**
 * (Convert square meter into ping) Write a program that converts square meter into
 * ping. The program prompts the user to enter a number in square meter, converts
 * it to ping, and displays the result. One square meter is 0.3025 ping
 */
public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double ONE_SQUARE_METER_TO_PING = 0.3025;

        System.out.println("Enter a number in square meters: ");
        double squareMeters = scanner.nextDouble();

        System.out.println(squareMeters + "square meters is "+ squareMeters * ONE_SQUARE_METER_TO_PING + " pings");

    }
}
