/**
 * (Conversion from inch to centimeter) Write a program that displays the following
 * table (note that 1 inch is 2.54 centimeters):
 * Inches Centimetres
 *  1     2.54
 *  2     5.08
 *  .....
 *  9     22.86
 *  10    25.4
 */
package src.exercises;

public class Exercise4 {

    public static void main(String[] args) {

        System.out.println("Inches" + "\t\tCentimetres");

        for(int inch = 1; inch <= 10; inch++){

            double calculateCentimetre = inch * 2.54;

            System.out.println(inch + "\t\t\t\t" + calculateCentimetre);
        }
    }
}
