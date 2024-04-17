/**
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 * isPrime(int number) method for testing whether a number is prime. 
 * Use this method to find the number of prime numbers less than 10000
 */
package exercises;

public class Exercise10 {

	public static void main(String[] args) {

		int primeCounts = 0;

		for (int i = 2; i < 10000; i++) {

			if (isPrime(i))
				primeCounts++;
		}
		
		System.out.println(primeCounts);
	}

	public static boolean isPrime(int number) {

		for (int divisior = 2; divisior <= number / 2; divisior++) {

			if (number % divisior == 0)
				return false;
		}

		return true;
	}
}
