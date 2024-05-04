/**
 * (Large prime numbers) Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 */
package exercises.exercise18;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		BigInteger startFrom = BigInteger.valueOf(Long.MAX_VALUE);

		int count = 0;

		while (count < 5) {

			if (startFrom.isProbablePrime(100)) {
				System.out.println(startFrom);
				count++;
			}
			startFrom = startFrom.add(BigInteger.ONE);
		}
	}
}