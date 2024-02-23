/**
 * Game: multiplication quiz) Listing 3.3, Subtraction Quiz.java, randomly generates
 * a subtraction question. Revise the program to randomly generate a multiplication
 * question with two integers less than 1000.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = (int)(Math.random() * 1000), number2 = (int)(Math.random() * 1000);

        System.out.println("What is " + number1 + " * " + number2 + "?");

        if (number1 * number2 == scanner.nextInt()){
            System.out.println("You are correct");
        }else {
            System.out.println("You are wrong");
            System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2));
        }

    }
}
