/**
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String character = scanner.nextLine();
        char getFirstChar = character.charAt(0);

        System.out.println("The Unicode for the character " + character + " is " + (int)getFirstChar);

    }
}
