/**
 * (Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the
 * ISBN number as a string.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");

        String isbn = scanner.nextLine();

        int isbnAsInt = Integer.parseInt(isbn);

        int d1 = isbnAsInt / 100000000;
        int remainingDigits = isbnAsInt % 100000000;

        int d2 = remainingDigits / 10000000;
        remainingDigits %= 10000000;

        int d3 = remainingDigits / 1000000;
        remainingDigits %= 1000000;

        int d4 = remainingDigits / 100000;
        remainingDigits %= 100000;

        int d5 = remainingDigits / 10000;
        remainingDigits %= 10000;

        int d6 = remainingDigits / 1000;
        remainingDigits %= 1000;

        int d7 = remainingDigits / 100;
        remainingDigits %= 100;

        int d8 = remainingDigits / 10;
        remainingDigits %= 10;

        int d9 = remainingDigits;

        //d1 * 1 replaced with d1
        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.println("The ISBN-10 number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + (d10 == 10 ? "X" : d10));
    }
}
