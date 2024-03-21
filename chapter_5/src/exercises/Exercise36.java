/**
 * (Business application: checking ISBN) Use loops to simplify Programming Exercise 3.9.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise36 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");

        int isbn = scanner.nextInt();

        int remainingDigits = isbn;
        int sum = 0;

        for (int i = 9; i >= 1; i--) {
            int digit = remainingDigits / (int) Math.pow(10, i - 1);
            remainingDigits %= (int) Math.pow(10, i - 1);

            sum += digit * i;
        }

        int digit10 = sum % 11;

        System.out.print("The 10-digit ISBN is: ");
        if (digit10 == 10) {
            System.out.println(isbn + "X");
        } else {
            System.out.println(isbn + "" + digit10);
        }
    }
}