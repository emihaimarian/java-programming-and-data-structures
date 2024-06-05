/**
 * (HexFormatException) Programming Exercise 12.6 implements the hex2Dec
 * method to throw a NumberFormatException if the string is not a hex
 * string. Define a custom exception called HexFormatException. Implement
 * the hex2Dec method to throw a HexFormatException if the string is not a hex string.
 */
package exercises.exercise8;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = scanner.nextLine();

        try {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!Character.isDigit(hexChar) && (hexChar < 65 || hexChar > 71))
                throw new HexFormatException(hexChar + " is not a valid hex digit");

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
