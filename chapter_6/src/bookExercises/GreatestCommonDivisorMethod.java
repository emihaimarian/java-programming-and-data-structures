package bookExercises;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int n1 = scanner.nextInt();

		System.out.print("Enter second integer: ");
		int n2 = scanner.nextInt();

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));

	}

	public static int gcd(int n1, int n2) {

		int initialGcd = 1;
		int possibleGcd = 2;

		while (possibleGcd <= n1 && possibleGcd <= n2) {

			if (n1 % possibleGcd == 0 && n2 % possibleGcd == 0)
				initialGcd = possibleGcd;
			possibleGcd++;
		}
		return initialGcd;
	}
}