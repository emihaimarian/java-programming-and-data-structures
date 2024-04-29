/**
 * Write a test program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. 
 * If the discriminant is positive, display the two roots. 
 * If the discriminant is 0, display the one root. Otherwise, display “The equation has no roots.”
 */
package exercises.exercise10;

public class Main {

	public static void main(String[] args) {

		QuadraticEquation quadraticEquation = new QuadraticEquation(-2, 2, 1);
		System.out.println(quadraticEquation.toString());
	}
}