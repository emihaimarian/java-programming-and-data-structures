/**
 * (Remove package statement) Suppose you have Java source files under the directories
 * chapter1, chapter2, . . . , chapter34. Write a program to remove the
 * statement package chapteri; in the first line for each Java source file under
 * the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
 * are under the root directory srcRootDirectory. The root directory and
 * chapteri directory may contain other folders and files. Use the following
 * command to run the program:
 * java Exercise12_20 srcRootDirectory
 */
package exercises.exercise20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {

//        if (args.length != 1) {
//            System.out.println("Usage: java Exercise12_18 srcRootDirectory");
//            System.exit(1);
//        }

        File directory = new File("D:/Workspace/chapter_12/src/exercises/exercise18/test");

        if (!directory.exists()) {
            System.out.println("Directory " + directory + "does not exist");
            System.exit(2);
        } else {

            File[] files = directory.listFiles();

            for (File file : files) {

                if (file.isDirectory() && file.getName().startsWith("chapter")) {

                    String packageStatement = "package " + file.getName() + ";\r\n";
                    try {
                        insertInFiles(file, packageStatement);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    private static void insertInFiles(File directory, String line) throws FileNotFoundException {

        File[] files = directory.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isFile() && file.getName().endsWith(".java")) {
                    removePackage(file, line);
                }
            }
        }
    }

    private static void removePackage(File file, String line) throws FileNotFoundException {

        StringBuilder stringBuilder = new StringBuilder(line);

        try (Scanner scanner = new Scanner(file)) {

            String firstLine = scanner.nextLine();

            if (firstLine.startsWith("package"))
                stringBuilder.append(firstLine).append("\r\n");

            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine()).append("\r\n");
            }
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.printf("%s\r\n", stringBuilder);
        }
    }
}
