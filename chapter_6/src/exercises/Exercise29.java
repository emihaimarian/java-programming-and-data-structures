/**
 * (Twin primes) Twin primes are a pair of prime numbers that differ by 2. 
 * For example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes. 
 * Write a program to find all twin primes less than 1,200. 
 * Display the output as follows: (3, 5) (5, 7)
 */
package exercises;

public class Exercise29 {

	public static void main(String[] args) {

		for (int p = 2; p < 1000; p++) {

			if (isTwinPrime(p))
				System.out.println("(" + p + ", " + (p + 2 + ")"));
		}
	}

	public static boolean isPrime(int number) {

		for (int divisior = 2; divisior <= number / 2; divisior++) {

			if (number % divisior == 0)
				return false;
		}

		return true;
	}

	public static boolean isTwinPrime(int number) {
		return isPrime(number) && isPrime(number + 2);
	}
}
