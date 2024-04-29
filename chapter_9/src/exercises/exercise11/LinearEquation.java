/**
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a 2 * 2 system of linear equations: 
 * a * x + b * y = e 
 * c * x + d * y = f 
 * x = e* d - b * f / a * d - b * c 
 * y = a * f - e * c / a * d - b * c 
 * The class contains: 
 * 	Private data fields a, b, c, d, e, and f. 
 * 	A constructor with the arguments for a, b, c, d, e, and f. 
 * 	Six getter methods for a, b, c, d, e, and f. 
 * 	A method named isSolvable() that returns true if ad - bc is not 0. 
 * 	Methods getX() and getY() that return the solution for the equation.

 */
package exercises.exercise11;

public class LinearEquation {

	private double a, b, c, d, e, f;

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		return a * d - b * c != 0;
	}

	public double getX() {

		if (isSolvable())
			return (e * d - b * f) / (a * d - b * c);
		return 0;
	}

	public double getY() {

		if (isSolvable())
			return (a * f - e * c) / (a * d - b * c);
		return 0;
	}

}
