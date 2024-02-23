package exercises;

import java.util.Scanner;

/**
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so it prompts the user to enter the
 * time zone offset to GMT and displays the time in the specified time zone
 */
public class Exercise8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();

        //Epoch Time
        long totalMilliseconds = System.currentTimeMillis();
        totalMilliseconds += offset * 3600000L;

        final long totalSeconds = totalMilliseconds / 1000;
        final long currentSecond = totalSeconds % 60;

        final long totalMinutes = totalSeconds / 60;
        final long currentMinute = totalMinutes % 60;

        final long totalHours = totalMinutes / 60;
        final long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
