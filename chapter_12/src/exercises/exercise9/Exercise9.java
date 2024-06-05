/**
 * (BinaryFormatException) Exercise 12.7 implements the bin2Dec method
 * to throw a BinaryFormatException if the string is not a binary string. Define
 * a custom exception called BinaryFormatException. Implement the bin2Dec
 * method to throw a BinaryFormatException if the string is not a binary string.
 */
package exercises.exercise9;

public class Exercise9 {

    public static void main(String[] args) {

        try {
            System.out.println(bin2Dec("1100100")); // 100
        } catch (BinaryFormatException e) {
            e.printStackTrace();
        }

    }

    public static int bin2Dec(String string) throws BinaryFormatException {

        if (!isBinary(string))
            throw new BinaryFormatException(string + " is not in binary");

        int power = 0;
        int decimal = 0;

        for (int i = string.length() - 1; i >= 0; i--) {

            if (string.charAt(i) == '1')
                decimal += (int) Math.pow(2, power);
            power++;
        }

        return decimal;
    }

    public static boolean isBinary(String string) {

        for (char c : string.toCharArray()) {

            if (c != '1' && c != '0')
                return false;
        }
        return true;
    }
}
