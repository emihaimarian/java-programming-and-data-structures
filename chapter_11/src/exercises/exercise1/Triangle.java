/**
 * (The Triangle class) Design a class named Triangle that extends GeometricObject. 
 * The class contains: 
 * Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle.
 * A no-arg constructor that creates a default triangle.
 * A constructor that creates a triangle with the specified side1, side2, and side3.
 * The accessor methods for all three data fields.
 * A method named getArea() that returns the area of this triangle.
 * A method named getPerimeter() that returns the perimeter of this triangle.
 * A method named toString() that returns a string description for the triangle. 
 * For the formula to compute the area of a triangle, see Programming Exercise 2.19. 
 * The toString() method is implemented as follows: return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
 */
package exercises.exercise1;

public class Triangle extends GeometricObject {

	private double side1, side2, side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle() {
		this(1, 1, 1);
	}

	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getArea() {

		double semiPerimeter = semiPerimeter();

		return Math.sqrt(semiPerimeter * (semiPerimeter - getSide1()) * (semiPerimeter - getSide2())
				* (semiPerimeter - getSide3()));
	}

	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3();
	}

	private double semiPerimeter() {
		return getPerimeter() / 2;
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
