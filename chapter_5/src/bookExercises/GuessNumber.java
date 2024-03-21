package src.bookExercises;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100);

        System.out.println("Guess a magic number between 0 and 100");

        int guessNumber = -1;
        while (guessNumber != randomNumber) {

            System.out.println("Enter your guess: ");
            guessNumber = scanner.nextInt();

            if (guessNumber == randomNumber)
                System.out.println("Yes, the number is " + randomNumber);
            else if (guessNumber > randomNumber)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}