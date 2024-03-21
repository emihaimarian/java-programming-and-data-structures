/**
 * (Longest common prefix) Write a program that prompts the user to enter two
 * strings and displays the largest common prefix of the two strings. Here are some
 * sample runs:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise51 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        int minLength = Math.min(firstString.length(), secondString.length());
        int index = 0;

        while (index < minLength && firstString.charAt(index) == secondString.charAt(index)) {
            index++;
        }

        String commonPrefix = firstString.substring(0, index);

        if (!commonPrefix.isEmpty())
            System.out.println("The common prefix is " + commonPrefix);
        else
            System.out.println(firstString + " and " + secondString + " have no common prefix");
    }
}
