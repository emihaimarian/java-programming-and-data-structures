package bookExercises;

import java.util.Scanner;

public class QuotientWithException {

    public static int quotient(int number1, int number2){

        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");
        return number1 / number2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        try{
            int result = quotient(firstNumber, secondNumber);
            System.out.println(firstNumber + " / " + secondNumber + " is " + result);
        }catch (ArithmeticException ex){
            System.out.println("Exception: an integer cannot be divided by zero ");
        }

        System.out.println("Execution continues ...");
    }
}
