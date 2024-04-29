package bookExercises.circle;

public class TestCircle {

	public static void main(String[] args) {

		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + Circle.numberOfObjects);

		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		System.out.println("After creating c1");
		System.out.println(
				"c1: radius (" + circle1.radius + ") and number of Circle objects (" + Circle.numberOfObjects + ")");

		Circle circle2 = new Circle();
		System.out.println("The area of the circle of radius " + circle2.radius + " is" + circle2.getArea());

		circle1.radius = 9;

		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println(
				"c1: radius (" + circle1.radius + ") and number of Circle objects (" + Circle.numberOfObjects + ")");
		System.out.println(
				"c2: radius (" + circle2.radius + ") and number of Circle objects (" + Circle.numberOfObjects + ")");

		Circle circle3 = new Circle();
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
}