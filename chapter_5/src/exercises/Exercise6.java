/**
 * (Conversion from square meter to ping) Write a program that displays the following
 * two tables side by side (note that 1 ping = 3.305 square meters):
 * Ping 	Square meter | Square meter 	Ping
 * 10 			33.050   | 		30 			9.077
 * 15           49.575   |      35          10.590
 * ....
 * 75           247.875  |      95          28.744
 * 80           264.400 |      100          30.257
 */
package src.exercises;

public class Exercise6 {

    public static void main(String[] args) {

        System.out.println("Ping" + "\t\tSquare meter" + "\t\t|\t" + "Square meter" + "\t\t\tPing");

        for (int startPingFrom = 10, startSquareMeterFrom = 30; startPingFrom <= 80; startPingFrom += 5, startSquareMeterFrom += 5){

            double calculateSquareMeter = startPingFrom * 3.305;
            double calculatePing = startSquareMeterFrom / 3.305;

            System.out.println(startPingFrom + "\t\t\t\t" + String.format("%,.3f", calculateSquareMeter)  +"\t\t\t|\t\t\t" + startSquareMeterFrom + "\t\t\t\t" + String.format("%,.3f", calculatePing));
        }

    }
}
