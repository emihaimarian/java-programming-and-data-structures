/**
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 * throw IllegalArgumentException if the loan amount, interest rate, or
 * number of years is less than or equal to zero.
 */
package exercises.exercise4;

public class Exercise4 {

    public static void main(String[] args) {

        Loan loan = new Loan(-1, -1, -1);
    }
}
