/**
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. For a nonletter input, display
 * invalid input.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String input = scanner.nextLine().toLowerCase();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))){
            System.out.println("Invalid input");
        }else {

            char letter = input.charAt(0);

            if(isVowel(letter))
                System.out.println(letter + " is a vowel");
            else
                System.out.println(letter + " is a consonant");
        }
    }

    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
