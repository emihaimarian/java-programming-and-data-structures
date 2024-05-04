/**
 * (BigRational) Re-implement the Rational class from Exercise 10.3 using BigInteger instead of int.
 */
package exercises.exercise21;

import java.math.BigInteger;

public class BigRational {

	private BigInteger numerator;
	private BigInteger denominator;

	public BigRational(BigInteger numerator, BigInteger denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public BigInteger getNumerator() {
		return numerator;
	}

	public void setNumerator(BigInteger numerator) {
		this.numerator = numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	public void setDenominator(BigInteger denominator) {
		this.denominator = denominator;
	}

	public BigRational normalize() {
		BigInteger gcd = getNumerator().gcd(getDenominator());

		return new BigRational(getNumerator().divide(gcd), denominator.divide(gcd));
	}

	public boolean isWhole() {
		return getNumerator().remainder(getDenominator()).equals(BigInteger.ZERO);
	}

	public boolean isDecimal() {
		return !isWhole();
	}

	public boolean equals(BigRational obj) {

		BigRational normalizedRational = this.normalize();
		BigRational rational = obj.normalize();

		return normalizedRational.getNumerator() == rational.getNumerator()
				&& normalizedRational.getDenominator() == rational.getDenominator();
	}

	public boolean equals(BigInteger numerator, BigInteger denominator) {
		return equals(new BigRational(numerator, denominator));
	}

	public static BigRational parseRational(char[] numeratorChars, char[] denominatorChars) {

		BigInteger numerator = new BigInteger(new String(numeratorChars));
		BigInteger denominator = new BigInteger(new String(denominatorChars));

		return new BigRational(numerator, denominator);
	}

	public static BigRational parseRational(String string) {

		String[] str = string.split("/");
		BigInteger numerator = new BigInteger(str[0]);
		BigInteger denominator = new BigInteger(str[1]);

		return new BigRational(numerator, denominator);
	}
}
