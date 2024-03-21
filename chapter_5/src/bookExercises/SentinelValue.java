package src.bookExercises;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer (the input ends if it is 0): ");
        int data = scanner.nextInt();

        int sum = 0;

        while (data != 0) {
            sum += data;

            System.out.println("Enter an integer (the input ends if it is 0): ");
            data = scanner.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
