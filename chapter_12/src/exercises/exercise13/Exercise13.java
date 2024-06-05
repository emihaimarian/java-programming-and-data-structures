/**
 * (Count characters, words, and lines in a file) Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by
 * whitespace characters. The file name should be passed as a command-line
 * argument, as shown in Figure 12.13.
 */
package exercises.exercise13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        File file = new File("D:\\Workspace\\chapter_12\\src\\exercises\\exercise13\\testFile.txt");

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        List<String> lines = new ArrayList<>();
        readFromFile(file, lines);

        System.out.println("File " + file + " has: ");
        System.out.println(countChars(lines) + " characters");
        System.out.println(countWords(lines) + " words");
        System.out.println(countLines(lines) + " lines");

    }

    private static void readFromFile(File file, List<String> lines) {
        try (Scanner scanner = new Scanner(file);) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (
                FileNotFoundException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static int countLines(List<String> lines) {
        return lines.size();
    }

    private static int countChars(List<String> lines) {

        int chars = 0;

        for (String string : lines) {
            chars += string.length();
        }
        return chars;
    }

    private static int countWords(List<String> lines) {

        int words = 0;

        for (String string : lines) {
            words += string.split(" ").length;
        }

        return words;
    }
}