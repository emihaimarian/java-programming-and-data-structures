/**
 * (Display pyramid) Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid, as shown in the following sample run:
 * 7 6 5 4 3 2 1 2 3 4 5 6 7
 * 6 5 4 3 2 1 2 3 4 5 6
 * 5 4 3 2 1 2 3 4 5
 * 4 3 2 1 2 3 4
 * 3 2 1 2 3
 * 2 1 2
 * 1
 */
package src.exercises;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = scanner.nextInt();

        if (numberOfLines > 0 && numberOfLines < 15) {

            for (int i = numberOfLines; i >= 1; i--) {

                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }

                System.out.println();
            }

        }
    }
}