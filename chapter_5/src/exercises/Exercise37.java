/**
 * (Decimal to binary) Write a program that prompts the user to enter a decimal
 * integer then displays its corresponding binary value. Don’t use Java’s Integer.
 * toBinaryString(int) in this program.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise37 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");

        int decimal = scanner.nextInt();
        boolean isNegative = decimal < 0;

        if (decimal == 0)
            System.out.print("0");

        int[] binary = new int[32];

        decimal = Math.abs(decimal);

        int index = 0;

        while (decimal > 0) {
            binary[index] = decimal % 2;
            decimal /= 2;
            index++;
        }

        if (isNegative)
            System.out.print("1");

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
