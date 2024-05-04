/**
 * Write a test program that creates a MyRectangle2D object r1 (new MyRectangle2D (2, 2, 5.5, 4.9))
 * displays its area and perimeter, and displays the result of r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2))
 * and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
 */
package exercises.exercise13;

public class Main {

	public static void main(String[] args) {

		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println("Area of r1: " + r1.getArea() + "and perimeter of r1: " + r1.getPerimeter());

		System.out.println(r1.contains(3, 3));
		System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}
}
