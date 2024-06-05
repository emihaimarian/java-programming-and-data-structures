/**
 * (Process scores in a text file on the Web) Suppose the text file on the Web
 * http://liveexample.pearsoncmg.com/data/Scores.txt contains an unspecified
 * number of scores separated by spaces. Write a program that reads the scores
 * from the file and displays their total and average.
 */
package exercises.exercise23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise23 {

    private static final String URL = "http://liveexample.pearsoncmg.com/data/Scores.txt";

    public static void main(String[] args) {

        try {
            URL url = new URL(URL);

            int sum = 0;
            List<Integer> scoreList = getScoreList(url);

            for (Integer score : scoreList) {
                sum += score;
            }
            System.out.println("Average is " + sum / scoreList.size());

        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<Integer> getScoreList(URL url) {
        List<Integer> scoreList = new ArrayList<>();

        try (Scanner scanner = new Scanner(url.openStream())) {
            while (scanner.hasNext())
                scoreList.add(scanner.nextInt());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return scoreList;
    }
}
