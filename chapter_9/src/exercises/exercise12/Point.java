/**
 * (Geometry: intersecting point) Suppose two line segments intersect. 
 * The two endpoints for the first line segment are (x1, y1) and (x2, y2) 
 * and for the second line segment are (x3, y3) and (x4, y4). 
 */

package exercises.exercise12;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}