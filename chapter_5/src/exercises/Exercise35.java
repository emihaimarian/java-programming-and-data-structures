/**
 * (Summation) Write a program to compute the following summation:
 * 1/1 + sqrt2 + 1/sqrt2 + sqrt3 + 1/srqt3 + sqrt4 + ... + 1/sqrt999 + 1/sqrt1000
 */
package src.exercises;

public class Exercise35 {

    public static void main(String[] args) {

        double total = 0;

        for (int i = 1; i <= 1000; i++) {

            total += 1 / Math.sqrt(i) + Math.sqrt(i + 1);
        }

        System.out.println(total);
    }
}
