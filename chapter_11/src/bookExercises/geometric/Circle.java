package bookExercises.geometric;

import java.util.Objects;

public class Circle extends GeometricObject {

	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.pow(getRadius(), 2) * Math.PI;
	}

	public double getDiameter() {
		return 2 * getRadius();
	}

	public double getPerimeter() {
		return 2 * getRadius() * Math.PI;
	}

	@Override
	public String toString() {
		return super.toString() + "\nradius is " + radius;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Circle)
			return getRadius() == ((Circle) obj).getRadius();
		else
			return false;
	}

}