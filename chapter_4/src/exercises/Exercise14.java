/**
 * (Phone key pads) The international standard letter/number mapping found on the
 * telephone is shown below:
 * Write a program that prompts the user to enter a lowercase or uppercase letter
 * and displays its corresponding number. For a non letter input, display invalid
 * input
 * // a,b,c = 2     97 - 99
 * // d,e,f = 3     100 - 102
 * // g,h,i = 4     103 - 105
 * // j,k,l = 5     106 - 108
 * // m,n,o = 6     109 - 111
 * // p,q,r,s = 7   112 - 115
 * // t,u,v = 8     116 - 118
 * // w,x,y,z = 9   119 - 122
 */
package src.exercises;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String input = scanner.nextLine().toLowerCase();

        if (input.isEmpty() || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid input");
        }

        char letter = Character.toLowerCase(input.charAt(0));

        System.out.println("The corresponding number is " + number(letter));

    }

    public static int number(char letter) {

        return switch (letter) {
            case 'a', 'b', 'c' -> 2;
            case 'd', 'e', 'f' -> 3;
            case 'g', 'h', 'i' -> 4;
            case 'j', 'k', 'l' -> 5;
            case 'm', 'n', 'o' -> 6;
            case 'p', 'q', 'r', 's' -> 7;
            case 't', 'u', 'v' -> 8;
            case 'w', 'x', 'y', 'z' -> 9;
            default -> -1;
        };
    }
}
