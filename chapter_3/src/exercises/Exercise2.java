/**
 * (Game: multiply three numbers) The program in Listing 3.1, Addition Quiz.java,
 * generates two integers and prompts the user to enter the product of these two integers.
 * Revise the program to generate three single-digit integers and prompt the
 * user to enter the multiplication of these three integers.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        int number3 = (int) (System.currentTimeMillis() / 20 % 20);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is " + number1 + " * " + number2 + " * " + number3 + "?");

        int answer = scanner.nextInt();

        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " + (number1 * number2 * number3 == answer));
    }
}
