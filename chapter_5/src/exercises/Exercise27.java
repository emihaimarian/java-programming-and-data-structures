/**
 * (Display leap years) Write a program that displays all the leap years, ten per line,
 * from 2014 to 2114, separated by exactly one space. Also display the number of
 * leap years in this period.
 */
package src.exercises;

public class Exercise27 {

    public static void main(String[] args) {

        final int DISPLAY_YEAR_PER_LINE = 10;
        int count = 0;

        for (int year = 2014; year <= 2114; year++) {

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeapYear) {
                count++;
                System.out.print(year + (count % DISPLAY_YEAR_PER_LINE == 0 ? "\n" : " "));
            }
        }
        System.out.println();
    }
}
