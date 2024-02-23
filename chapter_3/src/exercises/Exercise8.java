/**
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();
        int thirdInteger = scanner.nextInt();

        int temporary;

        if (firstInteger > secondInteger) {
            temporary = firstInteger;
            firstInteger = secondInteger;
            secondInteger = temporary;
        }

        if (firstInteger > thirdInteger) {
            temporary = firstInteger;
            firstInteger = thirdInteger;
            thirdInteger = temporary;
        }

        //Or you can check again using the first if statement
        if (secondInteger > thirdInteger) {
            temporary = secondInteger;
            secondInteger = thirdInteger;
            thirdInteger = temporary;
        }

        System.out.println("Integers sorted in non-decresing order: " + firstInteger + " " + secondInteger + " " + thirdInteger);

    }
}
