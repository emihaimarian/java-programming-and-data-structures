/**
 * (The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates. 
 * The class contains: 
 * 	The data fields x and y that represent the coordinates with getter methods.
 *  A no-arg constructor that creates a point (0, 0). 
 *  A constructor that constructs a point with specified coordinates. 
 *  A method named distance that returns the distance from this point to a specified point of the MyPoint type.
 *  A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
 *  A static method named distance that returns the distance from two MyPoint objects.
 */
package exercises.exercise4;

public class MyPoint {

	private double x;
	private double y;

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public MyPoint() {
		this(0, 0);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public static double distance(MyPoint p1, MyPoint p2) {
		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	}

	public double distance(MyPoint otherPoint) {
		return distance(this, otherPoint);
	}
}
