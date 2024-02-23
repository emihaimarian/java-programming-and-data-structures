/**
 * 1.12 (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 */
public class Exercise12 {

    public static void main(String[] args) {

        int hours = 1;
        int minutes = 40;
        int seconds = 35;
        int distanceCovered = 24;

        double convertMilesToKm = distanceCovered * 1.6;
        double convertToMinutes = hours * 60 + minutes + seconds / 60;

        double convertToKph = 60 * convertMilesToKm / convertToMinutes;
        System.out.println(convertToKph);



    }
}
