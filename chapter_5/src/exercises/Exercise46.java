/**
 * (Reverse a string) Write a program that prompts the user to enter a string and displays
 * the string in reverse order.
 */
package src.exercises;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercise46 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        String reverseString = "";

        for (int i = string.length() - 1; i >= 0; i--){
            reverseString += string.charAt(i);
        }

        System.out.println("The reversed string is: " + reverseString);

        StringBuilder stringBuilder = new StringBuilder(string).reverse();

        System.out.println("The reversed string is: " + stringBuilder.toString());

    }

}
