/**
 * 5.19 (Display numbers in a pyramid pattern) Write a nested for loop that prints the
 * following output:
 *                          1
 *                    1     3    1
 *                  1   3   9   3   1
 *              1   3   9   27  9   3   1
 *          1   3   9   27  81  27  9   3   1
 *      1   3   9   27  81  243 81  27  9   3   1
 *  1   3   9   27  81  243 729 243 81  27  9   3   1
 *1 3   9   27  81  243 729 2187 729 243 81  27  9   3   1
 */
package src.exercises;

public class Exercise19 {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            // Print leading spaces
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("\t");
            }

            // Print numbers in increasing order
            for (int k = 0; k < i; k++) {
                System.out.print((int)Math.pow(3, k) + "\t");
            }

            // Print numbers in decreasing order
            for (int k = i - 2; k >= 0; k--) {
                System.out.print((int)Math.pow(3, k) + "\t");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
