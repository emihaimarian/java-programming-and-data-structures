/**
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic equation ax^2 + bx + c = 0.  
 * The class contains: 
 * 	Private data fields a, b, and c that represent three coefficients.
 * 	A constructor with the arguments for a, b, and c.
 * 	Three getter methods for a, b, and c. 
 * 	A method named getDiscriminant() that returns the discriminant, which is b^2 - 4ac.
 * 	The methods named getRoot1() and getRoot2() for returning two roots of the equation
 * 	r1 = (-b + sqrt((b^2 - 4ac))) / 2a and r2 = (-b - sqrt((b^2 - 4ac))) / 2a
 * These methods are useful only if the discriminant is nonnegative. 
 * Let these methods return 0 if the discriminant is negative.
 */
package exercises.exercise10;

public class QuadraticEquation {

	private double a, b, c;

	public QuadraticEquation(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public double getRoot1() {

		if (getDiscriminant() < 0)
			return 0;
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}

	public double getRoot2() {

		if (getDiscriminant() < 0)
			return 0;
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}

	public String toString() {

		if (getDiscriminant() < 0)
			return "The equation have no roots";
		else if (getDiscriminant() == 0)
			return "getRoot2() = " + getRoot2() + "";
		return "getRoot1() = " + getRoot1() + ", getRoot2() = " + getRoot2();
	}
}
