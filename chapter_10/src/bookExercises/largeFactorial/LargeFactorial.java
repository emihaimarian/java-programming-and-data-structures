package bookExercises.largeFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = scanner.nextInt();

		System.out.println(n + "! is \n" + factorial(n));
	}

	public static BigInteger factorial(long n) {

		BigInteger result = BigInteger.ONE;

		for (int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(i + ""));

		return result;
	}
}
