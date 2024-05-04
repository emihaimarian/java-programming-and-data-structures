/**
 * (Cube numbers) Find the first ten cube numbers that are greater than Long.MAX_VALUE. 
 * A cube number is a number of the form n3. For example, 8, 27 and 64 are cube numbers. 
 * Find an efficient way to run your program fast.
 */
package exercises.exercise17;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {

		BigDecimal longMaxValueToBigDecimal = new BigDecimal(Long.MAX_VALUE);
		BigDecimal squareRootOfMaxLong = new BigDecimal(Math.sqrt(Long.MAX_VALUE)).setScale(0, RoundingMode.DOWN);

		int count = 1;

		while (count <= 10) {

			BigDecimal squared = squareRootOfMaxLong.multiply(squareRootOfMaxLong);

			if (squared.compareTo(longMaxValueToBigDecimal) > 0) {
				System.out.println(squared);
				count++;
			}

			squareRootOfMaxLong = squareRootOfMaxLong.add(BigDecimal.ONE);
		}

	}
}
