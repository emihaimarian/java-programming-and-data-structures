/**
 * Define the MyRectangle2D class that contains: 
 * Two double data fields named x and y that specify the center of the rectangle with getter and setter methods. 
 * (Assume the rectangle sides are parallel to x- or y-axis.)
 * The data fields width and height with getter and setter methods.
 * A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and 1 for both width and height.
 * A constructor that creates a rectangle with the specified x, y, width, and height.
 * A method getArea() that returns the area of the rectangle.
 * A method getPerimeter() that returns the perimeter of the rectangle.
 * A method contains(double x, double y) that returns true if the specified point (x, y) is inside this rectangle.
 * A method contains(MyRectangle2D r) that returns true if the specified rectangle is inside this rectangle.
 * A method overlaps(MyRectangle2D r) that returns true if the specified rectangle overlaps with this rectangle.
 */
package exercises.exercise13;

public class MyRectangle2D {

	private double x;
	private double y;
	private double width;
	private double height;

	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public MyRectangle2D() {
		this(0, 0, 1, 1);
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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {

		return getWidth() * getHeight();
	}

	public double getPerimeter() {
		return 2 * (getWidth() * getHeight());
	}

	public boolean contains(double x, double y) {

		return x > getX() - getWidth() / 2 && x < getX() + getWidth() / 2 && y > getY() - getHeight() / 2
				&& y < getY() + getHeight() / 2;
	}

	public boolean contains(MyRectangle2D r) {
		return contains(r.getX(), r.getY());
	}

	public boolean overlaps(MyRectangle2D r) {

		boolean overlapsX = Math.abs(getX() - r.getX()) * 2 < (getWidth() + r.getWidth());
		boolean overlapsY = Math.abs(getY() - r.getY()) * 2 < (getHeight() + r.getHeight());

		return overlapsX && overlapsY;
	}

	public static MyRectangle2D getRectangle(double[][] points) {

		double minX = points[0][0];
		double maxX = points[0][0];
		double minY = points[0][1];
		double maxY = points[0][1];

		for (double[] point : points) {
			minX = Math.min(minX, point[0]);
			maxX = Math.max(maxX, point[0]);
			minY = Math.min(minY, point[1]);
			maxY = Math.max(maxY, point[1]);
		}

		double centerX = (minX + maxX) / 2;
		double centerY = (minY + maxY) / 2;
		double width = maxX - minX;
		double height = maxY - minY;

		return new MyRectangle2D(centerX, centerY, width, height);
	}
}