/**
 * (Remove text) Write a program that removes all the occurrences of a specified string from a text file. For example, invoking
 * java Exercise12_11 John filename removes the string John from the specified file. Your program should get the
 * arguments from the command line.
 */
package exercises.exercise11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        String stringToRemove = "john";
        File file = new File("testFile.txt");

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        List<String> lines = new ArrayList<>();
        replaceInFile(file, stringToRemove, lines);

        writeFile(file, lines);
    }

    private static void replaceInFile(File file, String stringToRemove, List<String> lines) {

        try (Scanner scanner = new Scanner(file);) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String modifiedLine = line.replace(stringToRemove, "");
                lines.add(modifiedLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void writeFile(File file, List<String> lines) {

        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (String string : lines) {
                printWriter.println(string);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
