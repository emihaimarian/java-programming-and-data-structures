package bookExercises;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebCrawler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a url: ");
        String url = scanner.nextLine();

        crawler(url);
    }

    public static void crawler(String startingUrl){

        List<String> listOfPendingUrls = new ArrayList<>();
        List<String> listOfTraversedUrls = new ArrayList<>();

        listOfPendingUrls.add(startingUrl);

        while(!listOfPendingUrls.isEmpty() && listOfTraversedUrls.size() <= 400){

            String urlString = listOfPendingUrls.remove(0);

            if (!listOfTraversedUrls.contains(urlString)){
                listOfTraversedUrls.add(urlString);
                System.out.println("Crawl " + urlString);

                for(String s : getSubUrls(urlString)){

                    if (!listOfTraversedUrls.contains(s)){
                        listOfPendingUrls.add(s);
                    }
                }
            }
        }
    }

    public static List<String> getSubUrls(String urlString){

        List<String> list = new ArrayList<>();

        try{
            URL url = new URL(urlString);
            Scanner openStream = new Scanner(url.openStream());

            int current = 0;

            while (openStream.hasNext()){

                String line = openStream.nextLine();
                current = line.indexOf("http", current);

                while (current > 0){

                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0){
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http", endIndex);
                    }else{
                        current = -1;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return list;
    }
}
