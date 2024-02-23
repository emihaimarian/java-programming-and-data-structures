package src.bookExamples;

import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10), number2 = (int)(Math.random() * 10);

        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("What is " + number1 + " - " + number2 + "?");

        if (number1 - number2 == scanner.nextInt()){
            System.out.println("You are correct");
        }else {
            System.out.println("You are wrong");
            System.out.println(number1 + " − " + number2 + " should be " + (number1 - number2));
        }
    }
}
