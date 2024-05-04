/**
 * Define the Circle2D class that contains:
 * Two double data fields named x and y that specify the center of the circle with getter methods.
 * A data field radius with a getter method.
 * A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius. 
 * A constructor that creates a circle with the specified x, y, and radius.
 * A method getArea() that returns the area of the circle.
 * A method getPerimeter() that returns the perimeter of the circle.
 * A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle (see Figure 10.21a).
 * A method contains(Circle2D circle) that returns true if the specified circle is inside this circle (see Figure 10.21b).
 * A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle (see Figure 10.21c).
 */
package exercises.exercise11;

public class Circle2D {

	private double x;
	private double y;
	private double radius;

	public Circle2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public Circle2D() {
		this(0, 0);
		this.radius = 1;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}

	private double getDistance(double x, double y) {
		return Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2));
	}

	public boolean contains(double x, double y) {

		return getDistance(x, y) < getRadius();
	}

	public boolean contains(Circle2D circle) {

		return getDistance(circle.getX(), circle.getY()) + circle.getRadius() < getRadius();
	}

	public boolean overlaps(Circle2D circle) {

		return getDistance(circle.getX(), circle.getY()) - circle.getRadius() < getRadius() + circle.getRadius();
	}

}
