package src.bookExamples;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + "?");

        int answer = scanner.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
