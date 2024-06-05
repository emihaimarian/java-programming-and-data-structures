/**
 * (Replace words) Suppose you have a lot of files in a directory that contain
 * words Exercisei_j, where i and j are digits. Write a program that pads a 0
 * before i if i is a single digit and 0 before j if j is a single digit. For example, the
 * word Exercise2_1 in a file will be replaced by Exercise02_01. In Java, when
 * you pass the symbol * from the command line, it refers to all files in the directory
 * (see Supplement III.V). Use the following command to run your program:
 * java Exercise12_27 *
 */
package exercises.exercise27;

import java.io.File;

public class Exercise27 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java Exercise27 *");
            System.exit(1);
        }

        for (String arg : args) {

            File file = new File(arg);

            if (file.isFile()) {
                String fileName = file.getName();

                if (fileName.matches("Exercise\\d+_\\d+.*")) {

                    String newName = fileName.replaceAll("Exercise(\\d)_", "Exercise0$1_")
                            .replaceAll("_(\\d)\\.", "_0$1.");

                    File newFile = new File(file.getParent(), newName);

                    if (file.renameTo(newFile)) {
                        System.out.println("Renamed " + fileName + " to " + newName);
                    } else {
                        System.out.println("Failed to rename " + fileName);
                    }
                }
            }
        }
    }
}
