package bookExercises;

import java.util.Scanner;

public class QuotientWithIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (secondNumber != 0)
            System.out.println(firstNumber + " / " + secondNumber + " is " + (firstNumber / secondNumber));
        else
            System.out.println("Divisor cannot be zero ");
    }
}
