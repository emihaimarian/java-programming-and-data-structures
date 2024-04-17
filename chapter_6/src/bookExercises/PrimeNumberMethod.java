package bookExercises;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);

	}

	public static void printPrimeNumbers(int numberOfPrimes) {

		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;

		while (count < numberOfPrimes) {

			if (isPrime(number)) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}

			number++;
		}
	}

	public static boolean isPrime(int number) {

		for (int divisior = 2; divisior <= number / 2; divisior++) {

			if (number % divisior == 0) // If true number is not prime
				return false;
		}

		return true;
	}
}