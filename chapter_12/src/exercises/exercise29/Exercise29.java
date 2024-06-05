/**
 * (Rename files) Suppose you have several files in a directory named Exercisei_
 * j, where i and j are digits. Write a program that pads a 0 before j if j is a single
 * digit. For example, a file named Exercise2_1 in a directory will be renamed
 * to Exercise2_01. In Java, when you pass the symbol * from the command line,
 * it refers to all files in the directory (see Supplement III.V). Use the following
 * command to run your program:
 * java Exercise12_29 *
 */
package exercises.exercise29;

import java.io.File;

public class Exercise29 {

    public class Exercise28 {

        public static void main(String[] args) {

            if (args.length == 0) {
                System.out.println("Usage: java Exercise12_28 *");
                System.exit(1);
            }

            for (String arg : args) {
                File file = new File(arg);

                if (file.isFile()) {
                    String fileName = file.getName();

                    if (fileName.matches("Exercise\\d+_\\d")) {
                        String newName = fileName.replaceAll("_(\\d)$", "_0$1");

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
}
