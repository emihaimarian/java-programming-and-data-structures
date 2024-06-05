/**
 * (Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces
 * text in a source file and saves the change into a new file. Revise the program to
 * save the change into the original file. For example, invoking
 * java Exercise12_16 file oldString newString
 * replaces oldString in the source file with newString.
 */
package exercises.exercise16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Exercise16 sourceFile oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);

        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);

        if (!targetFile.exists()) {
            System.out.println("Target file " + args[1] + " does not exist");
            System.exit(3);
        }

        String oldStr = args[1];
        String newStr = args[2];

        StringBuilder content = new StringBuilder();

        try (Scanner scanner = new Scanner(sourceFile)) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                content.append(line.replaceAll(oldStr, newStr)).append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            System.exit(3);
        }

        try (PrintWriter printWriter = new PrintWriter(sourceFile)) {
            printWriter.print(content);
        } catch (FileNotFoundException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            System.exit(4);
        }
    }
}
