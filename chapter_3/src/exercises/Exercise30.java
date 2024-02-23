/**
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock. Here is a sample run:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();

        //Epoch Time
        long totalMilliseconds = System.currentTimeMillis();

        final long totalSeconds = totalMilliseconds / 1000;
        final long currentSecond = totalSeconds % 60;

        final long totalMinutes = totalSeconds / 60;
        final long currentMinute = totalMinutes % 60;

        final long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;

        System.out.println("Current time is " + ((currentHour > 12) ? currentHour - 12 : currentHour) + ":" + currentMinute + ":" + currentSecond + ((currentHour > 12) ? " PM" : " AM"));
    }
}
