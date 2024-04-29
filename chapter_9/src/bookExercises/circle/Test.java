package bookExercises.circle;

public class Test {

	public static void main(String[] args) {

		Circle1 circle1 = new Circle1(1);
		Circle1 circle2 = new Circle1(2);

		swap1(circle1, circle2);
		System.out.println("After swap1: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);

		swap2(circle1, circle2);
		System.out.println("After swap2: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
	}

	public static void swap1(Circle1 x, Circle1 y) {
		Circle1 temp = x;
		x = y;
		y = temp;
	}

	public static void swap2(Circle1 x, Circle1 y) {
		double temp = x.radius;
		x.radius = y.radius;
		y.radius = temp;
	}
}

class Circle1 {
	double radius;

	Circle1(double newRadius) {
		radius = newRadius;
	}
}