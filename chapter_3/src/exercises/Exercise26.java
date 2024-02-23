/**
 * (Use the &&, ||, and ^ operators) Write a program that prompts the user to
 * enter an integer and determines whether it is divisible by 4 and 5, whether it is
 * divisible by 4 or 5, and whether it is divisible by 4 or 5 but not both. Here is a
 * sample run of this program:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();

        System.out.println("Is 10 divisible by 4 and 5?" + ((integer % 4 == 0 && integer % 5 == 0) ? " true" : " false"));
        System.out.println("Is 10 divisible by 4 or 5?" + ((integer % 4 == 0 || integer % 5 == 0) ? " true" : " false"));
        System.out.println("Is 10 divisible by 4 or 5 but not both?" + ((integer % 4 == 0 ^ integer % 5 == 0) ? " true" : " false"));
    }
}
