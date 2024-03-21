/**
 * (Pass or fail) Write a program that prompts a student to enter a Java score.
 * If the score is greater or equal to 60, display “you pass the exam”; otherwise,
 * display “you don’t pass the exam”. Your program ends with input −1. Here is a
 * sample run:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your score: ");
            int score = scanner.nextInt();

            if (score == -1)
                break;

            if (score >= 60)
                System.out.println("You pass the exam");
            else
                System.out.println("You don’t pass the exam");
        }
    }
}
