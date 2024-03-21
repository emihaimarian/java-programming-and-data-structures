/**
 * Find numbers divisible by 3 or 4, but not both) Write a program that displays
 * all the numbers from 100 to 200, ten per line, that are divisible by 3 or 4, but not
 * both. Numbers are separated by exactly one space.
 */

package src.exercises;

public class Exercise11 {

    public static void main(String[] args) {

        final int NUMBERS_PER_LINE = 10;
        int count = 0;

        for (int startFrom = 100; startFrom <= 200; startFrom++){

            if (startFrom % 3 == 0 ^ startFrom % 4 == 0){
                count++;

                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(startFrom);
                else
                    System.out.print(startFrom + " ");
            }
        }
    }
}
