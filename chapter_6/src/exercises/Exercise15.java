/**
 * (Financial application: print a tax table) Listing 3.5 gives a program to compute tax. 
 * Write a method for computing tax using the following header: public static double computeTax(int status, double taxableIncome)
 * Use this method to write a program that prints a tax table for taxable income 
 * from $50,000 to $70,000 with intervals of $100 for all the following statuses:
 * Taxable Income | Single | Married Joint or Qualifying Widow(er) | Married Separate | Head of a House
 * Hint: round the tax into integers using Math.round (i.e., Math.round(computeTax(status, taxableIncome))).
 * 
 */
package exercises;

public class Exercise15 {

	public static void main(String[] args) {
		
		double from = 50000;
		double to = 60000;
		double interval = 50;
		
		System.out.println(
				"\nTaxable      Single      Married Joint       Married        Head of\n" +
				"Income                   or Qualifying       Separate       a House\n" +
				"                         Widow(er)\n" +
				"---------------------------------------------------------------------");
		
		for (double taxableIncome = from; 
				  taxableIncome <= to; taxableIncome += interval) {
				System.out.printf("%-13.0f", taxableIncome);
				System.out.printf("%-12d", Math.round(computeTax(0, taxableIncome)));
				System.out.printf("%-20d", Math.round(computeTax(1, taxableIncome)));
				System.out.printf("%-15d", Math.round(computeTax(2, taxableIncome)));
				System.out.printf("%-10d\n", Math.round(computeTax(3, taxableIncome)));
			}

	}

	public static double computeTax(int status, double taxableIncome) {

		double tax = 0;

		if (status == 0)
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
		else if (status == 1)
			tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
		else if (status == 2)
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
		else if (status == 3)
			tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;

		return tax;
	}

}
