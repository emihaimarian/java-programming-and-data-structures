/**
 * (Even or odd number) Write a program that prompts the user to enter an integer
 * and displays whether the integer is an odd number or not. Here are the sample
 * runs:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();

        System.out.println(integer + " is" + ((integer % 2 == 0) ? " even" : " odd") + " number");
    }
}
