/**
 * (Binary to decimal) Write a program that prompts the user to enter binary digits
 * and displays its corresponding decimal value.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter binary digits (0000 to 1111): ");
        String binary = scanner.nextLine();

        int firstDigit = Integer.parseInt(String.valueOf(binary.charAt(0)));
        int secondDigit = Integer.parseInt(String.valueOf(binary.charAt(1)));
        int thirdDigit = Integer.parseInt(String.valueOf(binary.charAt(2)));
        int fourthDigit = Integer.parseInt(String.valueOf(binary.charAt(3)));

        double decimal = (firstDigit * Math.pow(2, 3)) + (secondDigit * Math.pow(2,2)) + (thirdDigit * Math.pow(2,1)) + (fourthDigit * Math.pow(2,0));

        System.out.println("The decimal value is: " + (int)decimal);
    }
}
