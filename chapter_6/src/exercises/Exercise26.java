/**
 * (Palindromic prime) A palindromic prime is a prime number and also palindromic.
 * For example, 131 is a prime and also a palindromic prime, as are 313 and 757. 
 * Write a program that displays the first 120 palindromic prime numbers.
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 */
package exercises;

public class Exercise26 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		displayPalindromicPrime(1000, NUMBER_OF_PRIMES_PER_LINE);
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

	public static void displayPalindromicPrime(int numbers, int numbersPerLine) {

		int countPalindromicPrimes = 0;
		int startFrom = 2;

		while (startFrom < numbers) {

			if (isPrime(startFrom) && isPalindrome(startFrom)) {
				countPalindromicPrimes++;

				if (countPalindromicPrimes % numbersPerLine == 0)
					System.out.println(startFrom);
				else
					System.out.print(startFrom + " ");
			}
			startFrom++;
		}
	}
}
