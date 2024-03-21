/**
 * (Find numbers divisible by 3 and 4) Write a program that displays all the numbers
 * from 100 to 1,000, ten per line, that are divisible by 3 and 4. Numbers are
 * separated by exactly one space.
 */
package src.exercises;

public class Exercise10 {

    public static void main(String[] args) {

        final int NUMBERS_PER_LINE = 10;
        int count = 0;

        for (int startFrom = 100; startFrom <= 1000; startFrom++){

            if (startFrom % 3 == 0 && startFrom % 4 == 0){
                count++;

                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(startFrom);
                else
                    System.out.print(startFrom + " ");
            }
        }
    }
}
