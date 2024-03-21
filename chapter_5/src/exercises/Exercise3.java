/**
 * (Conversion from C° to F°) Write a program that displays the following table
 * (note that Fahrenheit = Celsius * 9/5 + 32):
 * Celsius      Fahrenheit
 * 0        32.0
 * 2        35.6
 * .         .
 * 98       208.4
 * 100      212.0
 */
package src.exercises;

public class Exercise3 {

    public static void main(String[] args) {

        System.out.println("Celsius" + "\t\tFahrenheit");

        for (int celsius = 0; celsius < 100; celsius += 2) {

            double fahrenheit = celsius * 9.0 / 5 + 32;
            System.out.println(celsius + "\t\t\t\t" + fahrenheit);
        }
    }
}
