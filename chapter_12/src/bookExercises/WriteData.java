package bookExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("scores.txt");

        if(file.exists()){
            File absoluteFile = file.getAbsoluteFile();
            System.out.println(absoluteFile);
            System.out.println("File already exists");
            System.exit(1);
        }

        try(PrintWriter output = new PrintWriter(file)){
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }

}
