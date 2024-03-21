/**
 * (Occurrence of max numbers) Write a program that reads integers, finds the largest of them
 * and counts its occurrences.
 * Assume the input ends with number 0.
 * Suppose you entered 3 5 2 5 5 5 0; The program finds that the largest is 5 and the occurrence count for 5 is 4.
 * If no input is entered, display "No numbers are entered except 0".
 * (Hint: Maintain two variables max and count.
 * max stores the current max
 * number and count stores its occurrences.
 * Initially, assign the first number to max and 1 to count.
 * Compare each subsequent number with max. If the number is greater than max, assign it to max and reset count to 1.
 * If the number is equal to max, increment count by 1.)
 */
package src.exercises;

import java.util.Scanner;

public class Exercise41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integers (ending with 0): ");

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered except 0");
            return;
        }

        int max = number;
        int count = 1;

        while (number != 0) {

            number = scanner.nextInt();

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number " + max + " is " + count);

    }
}
