/**
 * (Random character) Write a program that displays a random lowercase letter
 * using the Math.random() method.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        char randomLetter = (char) ('a' + Math.random() * ('z' - 'a' + 1));
        System.out.println(randomLetter);
    }
}
