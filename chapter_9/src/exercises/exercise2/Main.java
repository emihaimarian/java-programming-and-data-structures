/**
 * Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation 
 * and the previous closing price of 34.5. Set a new current price to 34.35 and display the price-change percentage.
 */
package exercises.exercise2;

public class Main {

	public static void main(String[] args) {

		Stock orcl = new Stock("ORCL", "Oracle Corporation");

		orcl.setPreviousClosingPrice(34.5);
		orcl.setCurrentPrice(34.35);

		System.out.println(orcl.getChangePercent());
	}
}
