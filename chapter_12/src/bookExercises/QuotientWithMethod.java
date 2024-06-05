package bookExercises;

import java.util.Scanner;

public class QuotientWithMethod {

    public static int quotient(int number1, int number2){
        if (number2 == 0){
            System.out.println("Divisor cannot be zero ");
            System.exit(1);
        }

        return number1 / number2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int result = quotient(firstNumber, secondNumber);
        System.out.println(firstNumber + " / " + secondNumber + " is " + result);
    }
}
