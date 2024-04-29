package bookExercises.circle;

public class Circle {

	double radius = 1;
	static int numberOfObjects = 0;

	Circle() {
		radius = 1;
		numberOfObjects++;
	}

	Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the perimeter of this circle */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Set a new radius for this circle */
	void setRadius(double newRadius) {
		radius = newRadius;
	}

	static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public static void main(String[] args) {

		Circle myCircle = new Circle();
		System.out.println(myCircle.radius);
	}
}