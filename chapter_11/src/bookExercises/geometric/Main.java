package bookExercises.geometric;

public class Main {

	public static void main(String[] args) {

		GeometricObject go = new GeometricObject("blue", false);
		System.out.println(go.toString());

		System.out.println();

		Circle circle = new Circle();
		System.out.println("Circle: " + circle.getDateCreated());

		System.out.println();

		Circle circle2 = new Circle(51.5, "yellow", true);
		System.out.println("Circle2: " + circle2.toString());

		System.out.println();

		Circle circle3 = new Circle(1);
		System.out.println("A circle " + circle3.toString());
		System.out.println("The color is " + circle3.getColor());
		System.out.println("The radius is " + circle3.getRadius());
		System.out.println("The area is " + circle3.getArea());
		System.out.println("The diameter is " + circle3.getDiameter());

		System.out.println();
		
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("A rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
	}
}
