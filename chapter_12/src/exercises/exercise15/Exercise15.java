/**
 * (Writing in a sorted file) Write a method public static int writeIn-
 * File (String name, File file) that writes name at its correct position
 * in file so that it fulfills the assumptions given in Programming Exercise 12.14.
 * The method returns the line position of the name.
 */
package exercises.exercise15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        File file = new File("D:\\Workspace\\chapter_12\\src\\exercises\\exercise15\\testFile.txt");

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        int position = writeInFile("Elisabeth", file);
        System.out.println("Name inserted at position: " + position);
    }

    /**
     * Read the file and insert the lines into a list and return the list
     */
    public static List<String> readInFile(File file) {

        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        } catch (
                FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        }

        return lines;
    }

    /**
     * Write the provided list in arguments back to file
     */
    public static void writeFile(List<String> lines, File file) {

        try (PrintWriter printWriter = new PrintWriter(file)) {

            for (String line : lines) {
                printWriter.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        }
    }

    /**
     * Reads the file, finds the correct position to insert the name, insert the name, writes back the updated list and return the inserted position
     */
    public static int writeInFile(String name, File file) {

        List<String> lines = readInFile(file);

        int position = 0;

        for (String line : lines) {

            if (name.compareTo(line) > 0) {
                position++;
            } else {
                break;
            }
        }

        lines.add(position, name);
        writeFile(lines, file);

        return position;
    }
}
