/**
 * (Find the largest n such that n^2 < 12,000) Use a while loop to find the largest
 * integer n such that n^2 is less than 12,000.
 */
package src.exercises;

public class Exercise13 {

    public static void main(String[] args) {

        int counter = 0;

        while (Math.pow(counter, 2) < 12000){
            counter++;
        }

        counter--;

        System.out.println("The largest n such that n^2 < 12000 is: " + counter);
    }
}
