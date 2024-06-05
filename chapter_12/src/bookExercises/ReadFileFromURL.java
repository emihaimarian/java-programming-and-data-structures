package bookExercises;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a URL: ");
        String URL = scanner.nextLine();

        try{
            java.net.URL url = new URL(URL);

            int count = 0;
            Scanner openStream = new Scanner(url.openStream());

            while(openStream.hasNext()){
                String line = openStream.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        } catch (IOException e) {
            System.out.println("I/O Errors: no such file");
        }


    }
}
