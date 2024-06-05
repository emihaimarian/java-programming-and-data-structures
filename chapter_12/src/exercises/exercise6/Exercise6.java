/**
 * (NumberFormatException) Listing 6.8 implements the hex2Dec(String hexString) method,
 * which converts a hex string into a decimal number.
 * Implement the hex2Dec method to throw a NumberFormatException if the
 * string is not a hex string. Write a test program that prompts the user to enter
 * a hex number as a string and displays its decimal equivalent. If the method
 * throws an exception, display “Not a hex number”.
 */
package exercises.exercise6;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = scanner.nextLine();

        try {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int hexToDecimal(String hex)  {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!Character.isDigit(hexChar) && (hexChar < 65 || hexChar > 71))
                throw new NumberFormatException(hexChar + " is not a valid hex digit");

            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {

        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
