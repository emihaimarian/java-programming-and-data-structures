/**
 *(Enter three countries) Write a program that prompts the user to enter three
 * countries and displays them in descending order.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first country: ");
        String firstCountry = scanner.nextLine();

        System.out.println("Enter the second country: ");
        String secondCountry = scanner.nextLine();

        System.out.println("Enter the third country: ");
        String thirdCountry = scanner.nextLine();


        String temp;

        if (secondCountry.compareTo(firstCountry) > 0 && secondCountry.compareTo(thirdCountry) > 0){
            temp = firstCountry;
            firstCountry = secondCountry;
            secondCountry = temp;
        }

        if (thirdCountry.compareTo(firstCountry) > 0 && thirdCountry.compareTo(secondCountry) > 0){
            temp = firstCountry;
            firstCountry = thirdCountry;
            thirdCountry = temp;
        }

        if (thirdCountry.compareTo(secondCountry) > 0){
            temp = secondCountry;
            secondCountry = thirdCountry;
            thirdCountry = temp;
        }

        System.out.println("The three cities in descending order are " + firstCountry + " " + secondCountry + " " + thirdCountry);
    }
}
