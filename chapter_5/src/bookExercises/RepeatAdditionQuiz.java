package src.bookExercises;

import java.util.Scanner;

public class RepeatAdditionQuiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = scanner.nextInt();

        while(number1 + number2 != answer){
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?");
            answer = scanner.nextInt();
        }

        System.out.println("You got it");

    }
}
