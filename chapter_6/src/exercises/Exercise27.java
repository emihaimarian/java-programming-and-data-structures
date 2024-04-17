/**
 * (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number whose reversal is also a prime. 
 * For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps. 
 * Write a program that displays the first 120 emirps. 
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 13 17 31 37 71 73 79 97 107 113 
 * 149 157 167 179 199 311 337 347 359 389
 */
package exercises;

public class Exercise27 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		displayEmirp(1000, NUMBER_OF_PRIMES_PER_LINE);
	}

	public static boolean isPrime(int number) {

		for (int divisior = 2; divisior <= number / 2; divisior++) {

			if (number % divisior == 0) // If true number is not prime
				return false;
		}

		return true;
	}

	public static boolean isPalindrome(int number) {

		int originalNumber = number;
		int reversedNumber = 0;
		int remainder;

		while (number != 0) {

			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number /= 10;
		}

		return originalNumber == reversedNumber;
	}

	public static int reversedNumber(int number) {

		int reversedNumber = 0;
		int remainder;

		while (number != 0) {

			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number /= 10;
		}

		return reversedNumber;
	}

	public static void displayEmirp(int numbers, int numbersPerLine) {

		int emirp = 0;
		int startFrom = 2;

		while (startFrom < numbers) {

			if (isPrime(startFrom) && !isPalindrome(startFrom) && isPrime(reversedNumber(startFrom))) {
				emirp++;

				if (emirp % numbersPerLine == 0)
					System.out.println(startFrom);
				else
					System.out.print(startFrom + " ");
			}
			startFrom++;
		}
	}
}