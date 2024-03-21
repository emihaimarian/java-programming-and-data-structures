/**
 * (Random points on a circle) Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
 * formed by these three points, as shown in Figure 4.4a. Display the angles in
 * degrees.
 * (Hint: Generate a random angle a in radians between 0 and 2*PI, as shown
 * in Figure 4.4b and the point determined by this angle is r^x * cos (a), r^x * sin (a).)
 * (a) A triangle is formed from three random points on the circle.
 * (b) A random point on the circle can be generated using a random angle a.
 * (c) A pentagon is centered at (0, 0) with one point at the 0 o’  clock position.
 * x = r*cos(a) and y = r x sin(a)
 */

package src.exercises;

public class Exercise6 {

    public static void main(String[] args) {

        final int RADIUS = 40;

        double firstRandomAngle = generateRandomAngle();
        double secondRandomAngle = generateRandomAngle();
        double thirdRandomAngle = generateRandomAngle();

        double x1 = RADIUS * Math.cos(firstRandomAngle);
        double y1 = RADIUS * Math.sin(firstRandomAngle);

        double x2 = RADIUS * Math.cos(secondRandomAngle);
        double y2 = RADIUS * Math.sin(secondRandomAngle);

        double x3 = RADIUS * Math.cos(thirdRandomAngle);
        double y3 = RADIUS * Math.sin(thirdRandomAngle);

        //Calculate the three sides
        double a = calculateSide(x2, y2, x3, y3);
        double b = calculateSide(x1, y1, x3, y3);
        double c = calculateSide(x1, y1, x2, y2);

        //Calculate the three angles to degrees
        double angleA = calculateAngleToDegrees(a, b, c);
        double angleB = calculateAngleToDegrees(b, a, c);
        double angleC = calculateAngleToDegrees(c, b, a);

        System.out.println("The three points are " +
                "(" + x1 + ", " + y1 + "), " +
                "(" + x2 + ", " + y2 + "), " +
                "(" + x3 + ", " + y3 + "), ");
        // Display angles
        System.out.println("The three angles are " +
                Math.round(angleA * 100) / 100.0 + " " +
                Math.round(angleB * 100) / 100.0 + " " +
                Math.round(angleC * 100) / 100.0);
    }

    public static double calculateSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }

    public static double calculateAngleToDegrees(double sideA, double sideB, double sideC) {
        return Math.toDegrees(Math.acos((Math.pow(sideA, 2) - Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (-2 * sideB * sideC)));
    }

    public static double generateRandomAngle(){
        return (Math.random() * (2 * Math.PI));
    }
}
