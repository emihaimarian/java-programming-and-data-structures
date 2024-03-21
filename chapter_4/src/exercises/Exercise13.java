/**
 * (Convert letter grade to number) Write a program that prompts the user to enter
 * a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3,
 * 2, 1, or 0. For other input, display invalid grade.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter grade: ");
        String input = scanner.nextLine();

        if (input.isEmpty() || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid input");
        }

        char letter = Character.toUpperCase(input.charAt(0));

        int decimal = Math.abs((int)letter - 69);

        //F should be 0 not 1
        if (letter == 'F')
            decimal--;

        if (letter < 65 || letter > 70)
            System.out.println(letter + " is an invalid grade");
        else
            System.out.println("The numeric value for grade " + letter + " is " + decimal);
    }
}
