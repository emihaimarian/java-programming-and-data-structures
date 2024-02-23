package exercises;

import java.util.Scanner;

/**
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and display the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program.
 */
public class Exercise11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        int birthInSecond = 7;
        int deathInSeconds = 13;
        int immigrationInSeconds = 45;
        int currentPopulation = 312032486;

        int birthsInAYear = calculatePerYear(birthInSecond, numberOfYears);
        int deathsInAYear = calculatePerYear(deathInSeconds, numberOfYears);
        int immigrationInAYear = calculatePerYear(immigrationInSeconds, numberOfYears);

        currentPopulation = currentPopulation + birthsInAYear - deathsInAYear + immigrationInAYear;
        System.out.print("The population in year " + numberOfYears + " will be " + currentPopulation);
        System.out.println();
    }

    public static int calculatePerYear(int valueInSeconds, int daysInYear){

        int howManySecondsInOneYear = 24 * 60 * 60 * 365 * daysInYear;
        return howManySecondsInOneYear / valueInSeconds;
    }
}
