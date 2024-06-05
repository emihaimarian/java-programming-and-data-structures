/**
 * (Fraction) Create a class Fraction with two integer final fields: numerator and denominator.
 * Its constructor creates fractions when given values
 * for both, but it has to avoid fractions with null denominators by throwing a NullDenominatorException
 * of Programming Exercise 12.7.
 */
package exercises.exercise10;

public class Exercise10 {

    public static void main(String[] args) throws NullDenominatorException {
        Fraction f1 = new Fraction(0, 1); // will throw exception
        Fraction f2 = new Fraction(1, 1);
    }
}
