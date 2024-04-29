/**
 * (The Rectangle class) Following the example of the Circle class in Section 9.2,
* design a class named Rectangle to represent a rectangle. The class contains: 
* Two double data fields named width and height that specify the width and height of the rectangle. 
* The default values are 1 for both width and height.
* A no-arg constructor that creates a default rectangle.
* A constructor that creates a rectangle with the specified width and height.
* A method named getArea() that returns the area of this rectangle.
* A method named getPerimeter() that returns the perimeter.
 */
package exercises.exercise1;

public class Rectangle {

	double width = 1;
	double height = 1;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * width + 2 * height;
	}
}
