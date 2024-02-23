/**
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor–
 * rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
 * a paper can wrap a rock.) The program randomly generates a number 0, 1, or
 * 2 representing scissor, rock, and paper. The program prompts the user to enter
 * a number 0, 1, or 2 and displays a message indicating whether the user or the
 * computer wins, loses, or draws.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("scissor (0), rock (1), paper (2): ");
        int user = scanner.nextInt();

        int computer = (int)(Math.random() * 3);

        if (user == computer)
            System.out.println("The computer is " + getString(computer) + "." + " You are " + getString(user) + " too. It is a draw");
        else if((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1))
            System.out.println("The computer is " + getString(computer) + "." + " You are " + getString(user) + "." + " You won");
        else
            System.out.println("The computer is " + getString(computer) + "." + " You are " + getString(user) + "." + " You lose");
    }

    public static String getString(int number) {
        return switch (number) {
            case 0 -> "scissor";
            case 1 -> "rock";
            case 2 -> "paper";
            default -> "The choice doesn't exist";
        };
    }
}
