/**
 * (Process a string) Write a program that prompts the user to enter a string and
 * displays its length and its last character.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        if (input.isEmpty()){
            System.out.println("Invalid input");
        }

        System.out.println("String: " + input + " has " + input.length() + " characters" + " and the last character is " + input.charAt(input.length() - 1));

    }
}
