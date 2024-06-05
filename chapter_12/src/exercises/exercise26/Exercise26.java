/**
 * (Create a directory) Write a program that prompts the user to enter a directory
 * name and creates a directory using the File’s mkdirs method. The program
 * displays the message “Directory created successfully” if a directory is created
 * or “Directory already exists” if the directory already exists.
 */

package exercises.exercise26;

import java.io.File;
import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Return the absolute path: ");
        String directoryName = scanner.nextLine();

        if (new File(directoryName).mkdirs()) {
            System.out.println("Directory " + directoryName + " created");
        } else {
            System.out.println("Directory " + directoryName + " already exists");
        }
    }
}
