/**
 * (Game: heads or tails) Write a program that lets the user guess whether the flip
 * of a coin results in heads or tails. The program randomly generates an integer
 * 0 or 1, which represents head or tail. The program prompts the user to enter a
 * guess, and reports whether the guess is correct or incorrect.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a guess 0-head or 1-tail: ");
        int guess = scanner.nextInt();

        int coin = (int) (Math.random() * 2);

        System.out.println(guess == coin ? "Correct" : "Incorrect");
    }
}
