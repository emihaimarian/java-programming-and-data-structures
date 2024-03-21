package src.bookExercises;

import java.util.Scanner;

public class GuessNumberOneTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100);

        System.out.println("Guess a magic number between 0 and 100");
        System.out.println("Enter your guess: ");
        int guessNumber = scanner.nextInt();

        if (guessNumber == randomNumber)
            System.out.println("Yes, the number is" + randomNumber);
        else if (guessNumber > randomNumber)
            System.out.println("Your guess is too high");
        else
            System.out.println("Your guess is too low");
    }
}
