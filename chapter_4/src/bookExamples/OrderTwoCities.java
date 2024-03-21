package src.bookExamples;

import java.util.Scanner;

public class OrderTwoCities {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first city: ");
        String firstCity = scanner.nextLine();

        System.out.println("Enter the second city: ");
        String secondCity = scanner.nextLine();

        if (firstCity.compareTo(secondCity) < 0)
            System.out.println("The cities in alphabetical order are " + firstCity + "," + secondCity);
        else
            System.out.println("The cities in alphabetical order are " + secondCity + "," + firstCity);
    }
}
