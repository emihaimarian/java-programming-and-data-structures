/**
 * (Hex to binary) Write a program that prompts the user to enter a hex digit and
 * displays its corresponding binary number in four digits. For example, hex digit 7
 * is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For
 * an incorrect input, display invalid input.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a hex digit: ");
        String hexDigit = scanner.nextLine();

        char getDigit = hexDigit.charAt(0);

        if (Character.isLetter(getDigit)) {
            getDigit = Character.toUpperCase(getDigit);
        }

        String binary = binaryValueOf(getDigit);

        if (binary == null)
            System.out.println(getDigit + " is an invalid input");
        else
            System.out.println("The binary value is " + binary);
    }

    public static String binaryValueOf(char digit) {

        String binary = switch (digit) {
            case '0' -> "0000";
            case '1' -> "0001";
            case '2' -> "0010";
            case '3' -> "0011";
            case '4' -> "0100";
            case '5' -> "0101";
            case '6' -> "0110";
            case '7' -> "0111";
            case '8' -> "1000";
            case '9' -> "1001";
            case 'A' -> "1010";
            case 'B' -> "1011";
            case 'C' -> "1100";
            case 'D' -> "1101";
            case 'E' -> "1110";
            case 'F' -> "1111";
            default -> "";
        };
        return binary;
    }
}
