/**
 * (Compute p) You can approximate p by using the following summation:
 * π = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + [(-1^i+1) / (2i -1)]
 * Write a program that displays the p value for i = 10000, 20000, …, and 100000.
 */
package src.exercises;

public class Exercise25 {

    public static void main(String[] args) {

        double calculate = 0;

        for (int i = 1; i <= 100000; i++) {

            calculate += Math.pow(-1, i + 1) / ((2.0 * i) - 1.0);

            if (i % 10000 == 0) {
                System.out.println(4 * calculate);
            }
        }
    }
}
