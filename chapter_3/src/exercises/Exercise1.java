/**
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax2 + bx + c = 0 can be obtained using the following formula:
 *  r1 = -b + sqrt(b^2 - 4ac) / 2a & r1 = -b - sqrt(b^2 - 4ac) / 2a
 *  b^2 - 4ac is called the discriminant of the quadratic equation.
 *  If it is positive the equation has two real roots.
 *  If it is zero the equation has one root.
 *  If it is negative the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots.”
 */
package src.exercises;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0){
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }else if(discriminant == 0){
            double root = -b / (2 * a);
            System.out.println("The equation has one root " + root);
        }else {
            System.out.println("The equation has no real roots.");
        }
    }
}
