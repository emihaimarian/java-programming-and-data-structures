/**
 * (Display prime numbers between 2 and 1,200) Modify Listing 5.15 to display all
 * the prime numbers between 2 and 1,200, inclusive. Display eight prime numbers
 * per line. Numbers are separated by exactly one space.
 */
package src.exercises;

public class Exercise20 {

    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 1200;
        final int NUMBER_OF_PRIMES_PER_LINE = 8;

        int count = 0;
        int initialNumber = 2;

        while (count < NUMBER_OF_PRIMES) {

            boolean isPrime = true;

            for (int divisor = 2; divisor <= initialNumber / 2; divisor++) {

                if (initialNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(initialNumber);
                } else {
                    System.out.print(initialNumber + " ");
                }
            }

            initialNumber++;
        }
    }
}
