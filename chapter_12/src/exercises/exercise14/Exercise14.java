/**
 * (Reading in a sorted file) Write a method public static int readInFile
 * (String line, File file) that returns the position number of a line in the
 * file filename or −1 if there is no such line or file.
 * We assume that this file contains names of people with a name per line. Names
 * (and hence lines) are listed in ascending alphabetical order in the file. We can
 * not find the same line twice.
 */
package exercises.exercise14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        File file = new File("D:\\Workspace\\chapter_12\\src\\exercises\\exercise14\\testFile.txt");

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        System.out.println(readInFile("Ethan", file));

    }

    public static int readInFile(String line, File file) {

        try (Scanner scanner = new Scanner(file)) {

            int count = 0;

            while (scanner.hasNext()) {

                String currentLine = scanner.nextLine();

                if (currentLine.equals(line))
                    return count;
                count++;
            }

        } catch (
                FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        }

        return -1;
    }
}
