package bookExercises;

import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " / " + secondNumber + " is " + (firstNumber / secondNumber));
    }
}
