/**
 * (Replace text) Revise Programming Exercise 12.16 to replace a string in a file with
 * a new string for all files in the specified directory using the following command:
 * java Exercise12_22 dir oldString newString
 */
package exercises.exercise22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Exercise21 dir oldString newString");
            System.exit(1);
        }

        File directory = new File(args[0]);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory " + args[0] + " does not exist or is not a directory");
            System.exit(2);
        }

        String oldStr = args[1];
        String newStr = args[2];

        File[] files = directory.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isFile())
                    replaceTextInFile(file, oldStr, newStr);
            }
        }
    }

    public static void replaceTextInFile(File file, String oldStr, String newStr) {

        StringBuilder stringBuilder = new StringBuilder();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                stringBuilder.append(line.replace(oldStr, newStr)).append(System.lineSeparator());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error reading the file: " + file.getAbsolutePath());
            return;
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print(stringBuilder);
        } catch (FileNotFoundException e) {
            System.err.println("Error writing to the file: " + file.getAbsolutePath());
        }
    }
}
