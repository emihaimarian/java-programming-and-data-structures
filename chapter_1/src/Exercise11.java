/**
 * (Population projection)
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years.
 * Current population is 312,032,486 and a year is 365 days.
 */

public class Exercise11 {
    public static void main(String[] args) {

        int birthInSecond = 7;
        int deathInSeconds = 13;
        int immigrationInSeconds = 45;
        int currentPopulation = 312032486;
        int daysInYear = 365;

        int birthsInAYear = calculatePerYear(birthInSecond, daysInYear);
        int deathsInAYear = calculatePerYear(deathInSeconds, daysInYear);
        int immigrationInAYear = calculatePerYear(immigrationInSeconds, daysInYear);

        for (int i = 1; i <= 5; i++){
            currentPopulation = currentPopulation + birthsInAYear - deathsInAYear + immigrationInAYear;
            System.out.print("The population in year " + i + " will be " + currentPopulation);
            System.out.println();
        }
    }

    public static int calculatePerYear(int valueInSeconds, int daysInYear){

        int howManySecondsInOneYear = 24 * 60 * 60 * daysInYear;
        return howManySecondsInOneYear / valueInSeconds;
    }
}
