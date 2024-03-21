/**
 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
 * plays the scissor-rock-paper game. Revise the program to let the user continuously
 * play until either the user or the computer wins three times more than their
 * opponent.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise34 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int computerPoints = 0;
        int userPoints = 0;

        while (true) {

            if (Math.abs(computerPoints - userPoints) >= 3) {

                if (computerPoints > userPoints) {
                    System.out.println("Computer won!");
                } else {
                    System.out.println("User won!");
                }

                break;
            }

            System.out.println("User score: " + userPoints + " " + "Computer score: " + computerPoints);

            System.out.println("scissor (0), rock (1), paper (2): ");
            int user = scanner.nextInt();

            int computer = (int) (Math.random() * 3);

            if (user == computer)
                System.out.println("The computer is " + getString(computer) + "." + " You are " + getString(user) + " too. It is a draw");
            else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
                userPoints++;
                System.out.println("The computer is " + getString(computer) + "." + " You are " + getString(user) + "." + " You won");
            } else {
                computerPoints++;
                System.out.println("The computer is " + getString(computer) + "." + " You are " + getString(user) + "." + " You lose");
            }
        }

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
