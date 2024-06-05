package bookExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {

    public static void main(String[] args) {

        if (args.length !=4){
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
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

        try(Scanner scanner = new Scanner(sourceFile);
            PrintWriter printWriter = new PrintWriter(targetFile)){

            while (scanner.hasNext()){
                String string1 = scanner.nextLine();
                String string2 = string1.replaceAll(args[2], args[3]);
                printWriter.println(string2);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
