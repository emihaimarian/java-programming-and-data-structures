/**
 * (Approximate e) Programming Exercise 5.26 approximates e using the following series:
 * e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4! + ... 1 / i!
 * In order to get better precision, use BigDecimal with 25 digits of precision 
 * in the computation. Write a program that displays the e value for i = 100, 200, . . . , and 1000.
 */
package exercises.exercise20;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {

		for (int i = 100; i <= 1000; i += 100) {
			BigDecimal sum = BigDecimal.ZERO;

			for (int j = 0; j <= i; j++) {
				sum = sum.add(BigDecimal.ONE.divide(factorial(j), new MathContext(25, RoundingMode.HALF_UP)));
			}
			System.out.println("e pentru i = " + i + " este: " + sum);
		}

	}

	public static BigDecimal factorial(int n) {

		if (n == 0 || n == 1) {
			return BigDecimal.ONE;
		} else {
			return BigDecimal.valueOf(n).multiply(factorial(n - 1));
		}
	}
}
