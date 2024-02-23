package src.bookExamples;

import java.util.Scanner;

public class SimpleIfDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();

        if (integer % 5 == 0){
            System.out.println("HiFive");
        }

        if (integer % 2 == 0){
            System.out.println("HiEven");
        }
        }
}
