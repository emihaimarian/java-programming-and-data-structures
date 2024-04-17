/**
 * (Financial application: compute commissions) Write a method that computes the 
 * commission, using the scheme in Programming Exercise 5.39. 
 * The header of the method is as follows: public static double computeCommission(double salesAmount)
 */
package exercises;

public class Exercise11 {

	public static void main(String[] args) {

		System.out.println("\n SalesAmount     Commission");
		System.out.println("-----------------------------");

		for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf(" %-16.0f", salesAmount);
			System.out.printf("%8.1f\n", computeCommission(salesAmount));
		}
	}

	public static double computeCommission(double salesAmount) {

		double balance, commission;
		balance = commission = 0.0;

		if (salesAmount < 5000.01)
			commission += balance * 0.08;

		if (salesAmount > 5000.01 && salesAmount < 10000.01)
			commission += (balance -= balance - 5000) * 0.10;

		if (salesAmount > 10000.01)
			commission += (balance = salesAmount - 10000) * 0.12;

		return commission;
	}
}
