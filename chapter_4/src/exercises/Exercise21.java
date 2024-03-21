/**
 * (Check substring position) Write a program that prompts the user to enter two
 * strings, and reports whether the second string begins the first string.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string s1: ");
        String s1 = scanner.nextLine();

        System.out.println("Enter string s2: ");
        String s2 = scanner.nextLine();

        if (s1.startsWith(s2)) {
            System.out.println(s2 + " is a prefix of " + s1);
        } else {
            System.out.println(s2 + " is not a prefix of " + s1);
        }

    }
}
