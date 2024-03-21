/**
 * (Count vowels and consonants) Assume that the letters A, E, I, O, and U are vowels.
 * Write a program that prompts the user to enter a string, and displays the
 * number of vowels and consonants in the string.
 * Enter a string: Programming is fun
 * The number of vowels is 5
 * The number of consonants is 11
 */
package src.exercises;

import java.util.Scanner;

public class Exercise49 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < string.length(); i++) {

            char ch = Character.toLowerCase(string.charAt(i));

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    countVowels++;
                else
                    countConsonants++;
            }
        }

        System.out.println("The number of vowels is " + countVowels);
        System.out.println("The number of consonants is " + countConsonants);
    }
}
