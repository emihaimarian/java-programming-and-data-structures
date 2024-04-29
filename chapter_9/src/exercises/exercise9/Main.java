/**
 * Write a test program that creates three RegularPolygon objects, created using the no-arg constructor
 * using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area.
 */
package exercises.exercise9;

public class Main {

	public static void main(String[] args) {

		RegularPolygon regularPolygon1 = new RegularPolygon();

		System.out.println(regularPolygon1.getN() + " " + regularPolygon1.getSide() + " " + regularPolygon1.getX() + " "
				+ regularPolygon1.getY());
		System.out.println("Regular Polygon no-args constructor perimeter: " + regularPolygon1.getPerimeter()
				+ " and area: " + regularPolygon1.getArea());

		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);

		System.out.println(regularPolygon2.getN() + " " + regularPolygon2.getSide() + " " + regularPolygon2.getX() + " "
				+ regularPolygon2.getY());
		System.out.println("Regular Polygon constructor with number of sides and length of the side has perimeter: "
				+ regularPolygon2.getPerimeter() + " and area: " + regularPolygon2.getArea());

		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println(regularPolygon3.getN() + " " + regularPolygon3.getSide() + " " + regularPolygon3.getX() + " "
				+ regularPolygon3.getY());
		System.out
				.println("Regular Polygon constructor with number of sides, length of the side, x and y has perimeter: "
						+ regularPolygon3.getPerimeter() + " and area: " + regularPolygon3.getArea());
	}

}
