/**
 * (Baby name popularity ranking) The popularity ranking of baby names from
 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
 * in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
 * babynameranking2010.txt. You can download these files using the URL such
 * as http://liveexample.pearsoncmg.com/data/babynamesranking2001.txt. Each file
 * contains 1,000 lines. Each line contains a ranking, a boy’s name, number for the
 * boy’s name, a girl’s name, and number for the girl’s name. For example, the first
 * two lines in the file babynameranking2010.txt are as follows:
 * 1 Jacob 21,875 Isabella 22,731
 * 2 Ethan 17,866 Sophia 20,477
 * Therefore, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the
 * boy’s name Ethan and girl’s name Sophia are ranked #2; 21,875 boys are named
 * Jacob, and 22,731 girls are named Isabella. Write a program that prompts the
 * user to enter the year, gender, followed by a name, and displays the ranking
 * of the name for the year. Your program should read the data directly from the
 * Web.
 */
package exercises.exercise31;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise31 {

    private static final String URL = "http://liveexample.pearsoncmg.com/data/babynamesranking";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the gender: ");
        String gender = scanner.next();

        System.out.print("Enter the name: ");
        String name = scanner.next();

        String formatURL = URL + year + ".txt";

        try {
            URL url = new URL(formatURL);
            List<Baby> babies = getBabies(url);

            if (gender.equals("M")) {
                List<Boy> boys = filterByName(babies, Boy.class, name);

                for (Boy boy : boys) {
                    System.out.println("Rank: " + boy.getRank() + " Name: " + boy.getName() + " Total: " + boy.getTotalNumber());
                }
            }

            if (gender.equals("F")) {
                List<Girl> girls = filterByName(babies, Girl.class, name);

                for (Girl girl : girls) {
                    System.out.println("Rank: " + girl.getRank() + " Name: " + girl.getName() + " Total: " + girl.getTotalNumber());
                }
            }

        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static List<Baby> getBabies(URL url) {

        List<Baby> babiesList = new ArrayList<>();

        try (Scanner scanner = new Scanner(url.openStream())) {

            while (scanner.hasNext()) {

                String lineFromFile = scanner.nextLine();

                String[] babiesValues = lineFromFile.split("\\s+");

                if (babiesValues.length >= 5) {

                    Boy boy = new Boy();
                    boy.setRank(Integer.parseInt(babiesValues[0]));
                    boy.setName(babiesValues[1]);
                    boy.setTotalNumber(Integer.parseInt(babiesValues[2]));
                    babiesList.add(boy);

                    Girl girl = new Girl();
                    girl.setRank(Integer.parseInt(babiesValues[0]));
                    girl.setName(babiesValues[3]);
                    girl.setTotalNumber(Integer.parseInt(babiesValues[4]));
                    babiesList.add(girl);

                } else {
                    System.out.println("Skipping malformed line: " + lineFromFile);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return babiesList;
    }

    private static <T extends Baby> List<T> filterByName(List<Baby> babiesList, Class<T> type, String name) {

        return babiesList.stream()
                .filter(type::isInstance)
                .map(type::cast)
                .filter(baby -> baby.getName().equals(name))
                .collect(Collectors.toList());
    }
}
