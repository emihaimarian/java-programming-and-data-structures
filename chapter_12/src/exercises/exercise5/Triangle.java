/**
 * (IllegalTriangleException) Programming Exercise 11.1 defined the Triangle
 * class with three sides. In a triangle, the sum of any two sides is
 * greater than the other side. The Triangle class must adhere to this rule.
 * Create the IllegalTriangleException class, and modify the constructor
 * of the Triangle class to throw an IllegalTriangleException object if a
 * triangle is created with sides that violate the rule, as follows:
 * public Triangle(double side1, double side2, double side3) throws IllegalTriangleException { }
 */
package exercises.exercise5;

class Triangle {

    private final double side1, side2, side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (isSideGreaterThanTwo(side1, side2, side3) || isSideGreaterThanTwo(side1, side3, side2) || isSideGreaterThanTwo(side2, side3, side1))
            throw new IllegalTriangleException();
    }

    private double sumOfTwoSides(double side1, double side2) {
        return side1 + side2;
    }

    private boolean isSideGreaterThanTwo(double side1, double side2, double side3) {
        return sumOfTwoSides(side1, side2) <= side3;
    }

    public double getArea() {

        double semiPerimeter = semiPerimeter();

        return Math.sqrt(semiPerimeter * (semiPerimeter - getSide1()) * (semiPerimeter - getSide2())
                * (semiPerimeter - getSide3()));
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    private double semiPerimeter() {
        return getPerimeter() / 2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}