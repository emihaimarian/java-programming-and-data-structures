/**
 * (Divisible by 2 or 3) Find the first 10 numbers with 50 decimal digits that are divisible by 2 or 3.
 */
package exercises.exercise16;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		BigInteger bigInteger = BigInteger.valueOf(10).pow(50);
		bigInteger.add(BigInteger.ONE);

		int count = 1;

		while (count <= 10) {
			
			if (bigInteger.remainder(new BigInteger("2")).equals(BigInteger.ZERO)
					|| bigInteger.divide(new BigInteger("3")).equals(BigInteger.ZERO)) {
				System.out.println(bigInteger);
				count++;
			}

			bigInteger = bigInteger.add(BigInteger.ONE);
		}

	}
}
