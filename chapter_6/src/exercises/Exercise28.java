/**
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written in the form 2^p - 1 for some positive integer p. rite a program that finds all
 * Mersenne primes with p <= 31 and displays the output as follows:
 */
package exercises;

public class Exercise28 {

	public static void main(String[] args) {

		for (int i = 1; i < 31; i++) {

			if (isPrime(i) && isMersennePrime(i)) {

				System.out.println(i + " " + mersennePrime(i));
			}
		}
	}

	public static boolean isPrime(int number) {

		for (int divisior = 2; divisior <= number / 2; divisior++) {

			if (number % divisior == 0) {
				return false;
			}
		}

		return true;
	}

	public static boolean isMersennePrime(int number) {

		if (isPrime(number)) {

			int mersennePrime = mersennePrime(number);

			if (isPrime(mersennePrime))
				return true;
		}
		return false;
	}

	public static int mersennePrime(int number) {
		return (int) (Math.pow(2, number) - 1);
	}
}
