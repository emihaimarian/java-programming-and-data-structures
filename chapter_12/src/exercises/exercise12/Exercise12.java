/**
 * **12.12 (Reformat Java source code) Write a program that converts the Java source
 * code from the next-line brace style to the end-of-line brace style. For example,
 * the following Java source in (a) uses the next-line brace style. Your program
 * converts it to the end-of-line brace style in (b).
 * <p>
 * public class Test
 * {
 * public static void main(String[] args)
 * {
 * // Some statements
 * }
 * }
 * <p>
 * public class Test {
 * public static void main(String[] args) {
 * // Some statements
 * }
 * }
 * <p>
 * <p>
 * Your program can be invoked from the command line with the Java source-code
 * file as the argument. It converts the Java source code to a new format. For example,
 * the following command converts the Java source-code file Test.java to
 * the end-of-line brace style. java Exercise12_12 Test.java
 */
package exercises.exercise12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        File file = new File("D:\\Workspace\\chapter_12\\src\\exercises\\exercise12\\Test.java");

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        List<String> lines = new ArrayList<>();
        formatFile(file, lines);

        writeFile(file, lines);
    }

    private static void formatFile(File file, List<String> lines) {

        try (Scanner scanner = new Scanner(file);) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine().trim();

                if (line.equals("{")) {
                    String prevLine = lines.remove(lines.size() - 1);
                    lines.add(prevLine + " {");
                } else {
                    lines.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Formatting error: misplaced '{' without preceding content.");
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
