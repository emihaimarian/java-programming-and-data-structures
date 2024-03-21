/**
 * (Find the smallest n such that n^3 > 12,000) Use a while loop to find the smallest
 * integer n such that n^3 is greater than 12,000.
 */
package src.exercises;

public class Exercise12 {

    public static void main(String[] args) {

        int counter = 0;

        while (Math.pow(counter, 3) < 12000) {
            counter++;
        }
        System.out.println("The smallest n such that n^3 > 12000 is: " + counter);
    }
}
