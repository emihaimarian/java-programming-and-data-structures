package exercises.exercise12;

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