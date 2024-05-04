/**
 * (Geometry: the Triangle2D class) Define the Triangle2D class that contains:
 * Three points named p1, p2, and p3 of the type MyPoint with getter and setter methods. 
 * MyPoint is defined in Programming Exercise 10.4.
 * A no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
 * A constructor that creates a triangle with the specified points.
 * A method getArea() that returns the area of the triangle.
 * A method getPerimeter() that returns the perimeter of the triangle.
 * A method contains(MyPoint p) that returns true if the specified point p is inside this triangle.
 * A method contains(Triangle2D t) that returns true if the specified triangle is inside this triangle.
 * A method overlaps(Triangle2D t) that returns true if the specified triangle overlaps with this triangle.
 */
package exercises.exercise12;

public class Triangle2D {

	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle2D() {
		this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
	}

	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		this(new MyPoint(x1, y1), new MyPoint(x2, y2), new MyPoint(x3, y3));
	}

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	private double calculateLenghtOfASide(MyPoint p1, MyPoint p2) {
		return p1.distance(p2);
	}

	private double semiPerimeter() {

		return (calculateLenghtOfASide(getP1(), getP2()) + calculateLenghtOfASide(getP1(), getP3())
				+ calculateLenghtOfASide(getP2(), getP3())) / 2;
	}

	public double getArea() {

		return Math.sqrt(semiPerimeter() * (semiPerimeter() - calculateLenghtOfASide(getP1(), getP2()))
				* (semiPerimeter() - calculateLenghtOfASide(getP1(), getP3()))
				* (semiPerimeter() - calculateLenghtOfASide(getP2(), getP3())));
	}

	public double getPerimeter() {
		return calculateLenghtOfASide(getP1(), getP2()) + calculateLenghtOfASide(getP1(), getP3())
				+ calculateLenghtOfASide(getP2(), getP3());
	}

	/** Metoda coordonatelor baricentrice */
	public boolean contains(MyPoint p) {

		double x = p.getX();
		double y = p.getY();

		double x1 = getP1().getX();
		double y1 = getP1().getY();

		double x2 = getP2().getX();
		double y2 = getP2().getY();

		double x3 = getP3().getX();
		double y3 = getP3().getY();

		double u = ((y2 - y3) * (x - x3) + (x3 - x2) * (y - y3)) / ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));
		double v = ((y3 - y1) * (x - x3) + (x1 - x3) * (y - y3)) / ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));
		double w = 1.0 - u - v;

		return u > 0 && v > 0 && w > 0;
	}

	/**
	 * Verificam daca toate varfurile triunghiului dat ca parametru se afla in
	 * interiorul triunghiului
	 */
	public boolean contains(Triangle2D t) {
		return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
	}

	public boolean overlaps(Triangle2D t) {

		/** Exista varfuri ale lui t in interiorul triunghiului? */
		boolean tContainsP1 = contains(t.getP1());
		boolean tContainsP2 = contains(t.getP2());
		boolean tContainsP3 = contains(t.getP3());

		/** Există varfuri ale triunghiului curent în interiorul triunghiului t? */
		boolean thisContainsP1 = t.contains(getP1());
		boolean thisContainsP2 = t.contains(getP2());
		boolean thisContainsP3 = t.contains(getP3());

		return (tContainsP1 || tContainsP2 || tContainsP3) || (thisContainsP1 || thisContainsP2 || thisContainsP3);
	}

}
