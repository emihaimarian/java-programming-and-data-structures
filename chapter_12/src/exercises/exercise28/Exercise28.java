/**
 * (Rename files) Suppose you have a lot of files in a directory named Exercisei_
 * j, where i and j are digits. Write a program that pads a 0 before i if i is a single
 * digit. For example, a file named Exercise2_1 in a directory will be renamed
 * to Exercise02_1. In Java, when you pass the symbol * from the command line,
 * it refers to all files in the directory (see Supplement III.V). Use the following
 * command to run your program:
 * java Exercise12_28 *
 */
package exercises.exercise28;

import java.io.File;

public class Exercise28 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java Exercise12_28 *");
            System.exit(1);
        }

        for (String arg : args) {

            if (arg.matches("Exercise\\d{1,2}_.*")) {

                int underscoreIndex = arg.indexOf('_');

                if (underscoreIndex > 9) {
                    continue;
                }

                String newName = arg.substring(0, arg.indexOf('_') - 1)
                        + "0" + arg.substring(arg.indexOf('_') - 1);

                File file = new File(arg);

                boolean success = file.renameTo(new File(newName));

                if (success) {
                    System.out.println("Renamed " + arg + " to " + newName);
                } else {
                    System.out.println("Failed to rename " + arg);
                }
            }
        }
    }
}
