package exercises.exercise7;

public class Fraction {

    private double denominator, numerator;

    public Fraction(double denominator, double numerator) throws NullDenominatorException {

        if (denominator == 0)
            throw new NullDenominatorException();
    }
}
