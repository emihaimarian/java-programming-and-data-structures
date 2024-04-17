/**
 * (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number n is prime by checking 
 * whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. 
 * If a divisor is found, n is not prime. 
 * A more efficient approach is to check whether any of the prime numbers less than or equal to sqrt(n) can divide n evenly. 
 * If not, n is prime. 
 * Rewrite Listing 5.15 to display the first 50 prime numbers using this approach. 
 * You need to use an array to store the prime numbers, and later use them to check whether they are possible divisors for n.
 */
package exercises;

import java.util.Arrays;

public class Exercise6 {

	public static void main(String[] args) {

		final int NUMBER_OF_PRIMES = 50;

		int[] primes = new int[NUMBER_OF_PRIMES];
		primes[0] = 2;
		
		int count = 0;
		int number = 2;

        while (count < NUMBER_OF_PRIMES) {
            
        	boolean isPrime = true;

            for (int i = 0; primes[i] <= Math.sqrt(number); i++) {
                
            	if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count] = number;
                count++;
            }

            number++;
        }
		
		System.out.println(Arrays.toString(primes));
	}

}
