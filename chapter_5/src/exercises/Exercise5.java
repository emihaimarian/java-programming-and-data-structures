/**
 * (Conversion from C º to F º and F º to C º) Write a program that displays the following
 * two tables side by side:
 * <p>
 * Celsius 	Fahrenheit   | Fahrenheit 	Celsius
 * 0 		 32.000 	 |  20 			−6.667
 * 2 		 35.600 	 | 	25 			−3.889
 * . . .
 * 98 		 208.400     | 	265 		129.444
 * 100 		 212.000     | 	270 		132.222
 */
package src.exercises;

public class Exercise5 {

    public static void main(String[] args) {

        System.out.println("Celsius" + "\t\tFahrenheit" + "\t\t\t|\t\t" + "Fahrenheit" + "\t\t\tCelsius");

        int startFrom = 20;

        for (int celsius = 0; celsius <= 100; celsius += 2, startFrom += 5) {

            double calculateCToF = celsius * 9.0 / 5 + 32;
            double calculateFromFToC = (startFrom - 32) / (9.0 / 5);

            System.out.println(celsius + "\t\t\t\t" + calculateCToF  +"\t\t\t|\t\t\t" + startFrom + "\t\t\t\t" + String.format("%,.3f", calculateFromFToC));
        }
    }
}
