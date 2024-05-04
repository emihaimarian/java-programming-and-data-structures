package exercises.exercise3;

public class Main {

	public static void main(String[] args) {

		Rational rational = new Rational(4, 6);

		Rational normalize = rational.normalize();

		System.out.println("Rational initial: " + rational.getNumerator() + "/" + rational.getDenominator());
		System.out.println("Rational normalizat: " + normalize.getNumerator() + "/"
				+ normalize.getDenominator());
		
		System.out.println(rational.equals(normalize));
		System.out.println(rational.equals(2, 3));
		
		
		
	}
}
