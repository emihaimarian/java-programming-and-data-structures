/**
 * Two int data fields that represent the numerator and denominator. 
 * A constructor that constructs a Rational object for the specified numerator and denominator. 
 * Getter methods that respectively return the numerator and denominator. 
 * The method normalize() that returns a new Rational object that has the same decimal value as the this Rational object,  
 * but where the numerator is not divisible by the denominator. 
 * (Formally, it converts a value p1/q1 to the equivalent value p2/q2 so p2 is not divisible by q2. 
 * Hint: you need to find the greatest common divisor of the numerator and denominator fields of the current Rational to implement this.) 
 * The methods isWhole() and isDecimal() that return true that check whether the rational is a whole number or has decimals, respectively.
 * The methods equals(int numerator, int denominator) and equals(Rational r) that return true if the numerator and denominator 
 * values are equal after normalizing.
 * A static method parseRational(char[], char[]) that converts two arrays of numeric characters to a Rational object. 
 * A static method parseRational(String) that convert a string containing numeric characters separated by ‘/’ to a Rational object.
 */
package exercises.exercise3;

public class Rational {

	private int numerator;
	private int denominator;

	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public Rational normalize() {

		int gcd = findGcd(Math.abs(numerator), Math.abs(denominator));

		return new Rational(numerator / gcd, denominator / gcd);
	}

	/** Euclid algorithm using recursion to find the Greatest Common Divisor */
	private int findGcd(int a, int b) {

		if (b == 0)
			return a;

		return findGcd(b, a % b);
	}

	public boolean isWhole() {
		return numerator % denominator == 0;
	}

	public boolean isDecimal() {
		return !isWhole();
	}

	public boolean equals(Rational obj) {

		Rational normalizedRational = this.normalize();
		Rational rational = obj.normalize();

		return normalizedRational.getNumerator() == rational.getNumerator()
				&& normalizedRational.getDenominator() == rational.getDenominator();
	}

	public boolean equals(int numerator, int denominator) {
		return equals(new Rational(numerator, denominator));
	}

	public static Rational parseRational(char[] numeratorChars, char[] denominatorChars) {
		// Parse char array to string and then to int
		int numerator = Integer.parseInt(new String(numeratorChars));
		int denominator = Integer.parseInt(new String(denominatorChars));

		return new Rational(numerator, denominator);
	}

	public static Rational parseRational(String string) {

		String[] str = string.split("/");

		int numerator = Integer.parseInt(str[0]);
		int denominator = Integer.parseInt(str[1]);

		return new Rational(numerator, denominator);
	}
}