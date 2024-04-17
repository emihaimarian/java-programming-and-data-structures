
/**
 * (Display patterns) Write a method to display a pattern as follows:
 * 				1
 * 		  	  1 2
 * 			1 2 3
 * n n-1..1 2 3 4
 * 
 * The method header is public static void displayPattern(int n)
 */
package exercises;

public class Exercise6 {

	public static void main(String[] args) {
		displayPattern(10);
	}

	public static void displayPattern(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print(k + 1 + " ");
			}

			System.out.println();
		}
	}
}
