/**
 * (Process string) Write a program that prompts the user to enter a string and displays
 * the characters at even positions.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise48 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        for (int i = 1; i < string.length() + 1; i++) {

            if (i % 2 == 0) {

                char ch = string.charAt(i - 1);

                if (Character.isSpaceChar(ch))
                    continue;

                System.out.print(ch);
            }
        }
    }
}
