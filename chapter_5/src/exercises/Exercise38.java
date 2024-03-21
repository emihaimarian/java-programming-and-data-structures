/**
 * (Decimal to octal) Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value. Don’t use Java’s Integer.
 * toOctalString(int) in this program.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise38 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");

        int decimal = scanner.nextInt();
        boolean isNegative = decimal < 0;

        if (decimal == 0)
            System.out.print("0");

        decimal = Math.abs(decimal);

        StringBuilder stringBuilder = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 8;
            stringBuilder.insert(0, remainder);
            decimal /= 8;
        }

        if (isNegative)
            System.out.print("-" + stringBuilder);
        else
            System.out.println(stringBuilder);
    }
}
