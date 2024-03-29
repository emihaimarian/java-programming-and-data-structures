/**
 * (Demonstrate cancellation errors) A cancellation error occurs when you are
 * manipulating a very large number with a very small number. The large number
 * may cancel out the smaller number. For example, the result of 100000000.0
 * + 0.000000001 is equal to 100000000.0. To avoid cancellation errors and
 * obtain more accurate results, carefully select the order of computation.
 * For example, in computing the following summation, you will obtain more accurate
 * results by computing from right to left rather than from left to right: 1 + 1/2 + 1/3 + ... + 1/n
 * Write a program that compares the results of the summation of the preceding
 * series, computing from left to right and from right to left with n = 50000.
 */
package src.exercises;

public class Exercise23 {

    public static void main(String[] args) {

        double rightToLeft = 1.0;
        double leftToRight = 1.0;

        double counter = 1.0;

        for (int n = 50000; n > 0; n--){

            rightToLeft += 1.0/n;
            leftToRight += 1.0/counter;
        }

        System.out.println("From right to left: " + rightToLeft);
        System.out.println("From left to right: " + leftToRight);
    }
}
