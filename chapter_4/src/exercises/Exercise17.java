/**
 * (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The
 * first character indicates the major and the second is number character 1, 2, 3, 4,
 * which indicates whether a student is a freshman, sophomore, junior, or senior.
 * Suppose the following characters are used to denote the majors:
 * I: Information Management
 * C: Computer Science
 * A: Accounting
 */
package src.exercises;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two characters: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Invalid input");
        }

        System.out.println(studentMajor(input.charAt(0)) + " " + studentStatus(input.charAt(1)));
    }


    public static String studentStatus(char number) {
        return switch (number) {
            case '1' -> "Freshman";
            case '2' -> "Sophomore";
            case '3' -> "Junior";
            case '4' -> "Senior";
            default -> "Invalid student status";
        };
    }

    public static String studentMajor(char abbreviation) {

        return switch (abbreviation) {
            case 'I' -> "Information Management";
            case 'C' -> "Computer Science";
            case 'A' -> "Accounting";
            default -> "Invalid student major";
        };
    }
}
