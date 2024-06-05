package bookExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("scores.txt");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){

            String firstName = scanner.next();
            String middleName = scanner.next();
            String lastName = scanner.next();
            int score = scanner.nextInt();

            System.out.println(firstName + " " + middleName + " " + lastName + " " + score);
        }

        scanner.close();
    }
}
