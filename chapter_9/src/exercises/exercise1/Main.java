package exercises.exercise1;

public class Main {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		System.out.println("First rectangle height: " + rectangle1.height);
		System.out.println("First rectangle width: " + rectangle1.width);
		System.out.println("First rectangle area is " + rectangle1.getArea() + " and the perimeter is "
				+ rectangle1.getPerimeter());

		System.out.println("\nSecond rectangle height: " + rectangle2.height);
		System.out.println("Second rectangle width: " + rectangle2.width);
		System.out.println("Second rectangle area is " + rectangle2.getArea() + " and the perimeter is "
				+ rectangle2.getPerimeter());
	}

}
