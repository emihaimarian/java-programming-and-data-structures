/**
 * (Integers x that divide a^x-1 - 1) Write a program that finds all integers x that 
 * divide a^x-1 - 1 where a = 5 and x … 100 
 * and displays the output as shown below 
 * (Hint: You have to use BigInteger to store the number because it is too big to be stored in a long.)
 */
package exercises.exercise19;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		BigInteger a = BigInteger.valueOf(5);

		for (int x = 2; x <= 100; x++) {
			
			BigInteger expression = a.pow(x - 1).subtract(BigInteger.ONE);
			
			if (expression.remainder(BigInteger.valueOf(x)).equals(BigInteger.ZERO)) {
				System.out.println(x + "\t" + expression);
			}
		}
	}

}
