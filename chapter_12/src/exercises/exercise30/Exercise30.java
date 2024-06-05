/**
 * (Occurrences of each letter) Write a program that prompts the user to enter a
 * file name and displays the occurrences of each letter in the file. Letters are case
 * insensitive.
 */
package exercises.exercise30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File doesn`t exist");
            System.exit(1);
        }

        display(readLetters(file));
    }

    private static int[] readLetters(File file) {

        int[] letter = new int[26];

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                countLetters(line, letter);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        return letter;

    }

    private static int[] countLetters(String string, int[] letter) {

        for (int i = 0; i < string.length(); i++) {

            if (Character.isLetter(string.charAt(i))) {
                letter[Character.toUpperCase(string.charAt(i)) - 'A']++;
            }
        }
        return letter;
    }

    public static void display(int[] counts) {

        for (int i = 0; i < counts.length; i++)
            System.out.println("The occurrence of " + (char) (i + 'A') + "'s is "
                    + counts[i]);
    }
}
