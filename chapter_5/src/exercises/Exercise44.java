/**
 * (Computer architecture: bit-level operations) A byte value is stored in 8 bits.
 * Write a program that prompts the user to enter a byte integer and displays the 8
 * bits for the integer. Here are sample runs:
 * Enter an integer: 5
 * The 8 bits are 00000101
 * (Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
 * operator (&), which are covered in Appendix G, Bitwise Operations.)
 */
package src.exercises;

import java.util.Scanner;

public class Exercise44 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        byte number = scanner.nextByte();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {

            sb.insert(0, (number & 1));
            number >>= 1;
        }

        System.out.print("The 8 bits are: " + sb);


    }


}
