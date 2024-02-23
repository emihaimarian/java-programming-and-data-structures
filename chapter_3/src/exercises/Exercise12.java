/**
 * (Palindrome integer) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome
 * if it reads the same from right to left and from left to right. A negative integer is
 * treated the same as a positive integer.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");
        int integer = scanner.nextInt();

        int firstDigit = integer / 100;
        int remainingDigits = integer % 100;
        int lastDigit = remainingDigits % 10;

        System.out.println(integer + ((firstDigit == lastDigit) ? " is a " : " is not a ") + "palindrome");
    }
}
