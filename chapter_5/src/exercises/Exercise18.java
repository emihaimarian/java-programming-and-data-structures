/**
 * (Display four patterns using loops) Use nested loops that display the following
 * patterns in four separate programs:
 * Pattern A       Pattern B       Pattern C       Pattern D
 * *               * * * *                *       * * * *
 * * *             * * *                * *         * * *
 * * * *           * *                * * *           * *
 * * * * *         *                * * * *             *
 */
package src.exercises;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int lines = scanner.nextInt();

        System.out.println("\nPattern A: ");
        for (int row = 1; row <= lines; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\nPattern B: ");
        for (int row = lines; row >= 1; row--) {
            for (int column = 1; column <= row; column++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("\nPattern C: ");
        for (int row = 0; row < lines; row++) {
            for (int space = 0; space < lines - row - 1; space++)
                System.out.print("  ");
            for (int column = 0; column <= row; column++)
                System.out.print("* ");

            System.out.println();
        }

        System.out.println("\nPattern D: ");
        for (int row = 0; row < lines; row++) {

            for (int space = 0; space < row; space++)
                System.out.print("  ");
            for (int column = row; column < lines; column++)
                System.out.print("* ");
            System.out.println();
        }
    }
}