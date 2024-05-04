/**
 * (Financial: the Tax class) Programming Exercise 8.12 writes a program for computing taxes using arrays. 
 * Design a class named Tax to contain the following instance data fields: 
 * int filingStatus: One of the four tax-filing statuses: 
 * 	0—single filer 
 *  1—married filing jointly or qualifying widow(er) 
 *  2—married filing separately
 *  3—head of household. 
 *  Use the public static constants 
 *  SINGLE_FILER(0) 
 *  MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1)
 *  MARRIED_SEPARATELY (2) 
 *  HEAD_OF_HOUSEHOLD (3) to represent the statuses.
 *  int[][] brackets: Stores the tax brackets for each filing status.
 *  double[] rates: Stores the tax rates for each bracket.
 *  double taxableIncome: Stores the taxable income. 
 *  Provide the getter and setter methods for each data field and the getTax() method that returns the tax. 
 *  Also, provide a no-arg constructor and the constructor Tax(filingStatus, brackets, rates, taxableIncome).
 */
package exercises.exercise8;

public class Tax {

	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;

	private int filingStatus = SINGLE_FILER;

	private int[][] brackets = { { 27050, 65550, 136750, 297350 }, // Single filer
			{ 45200, 109250, 166500, 297350 }, // married filing jointly
			{ 22600, 54625, 83250, 148675 }, // married filing separately
			{ 36250, 93650, 151650, 297350 } // head of household
	};

	private double[] rates = { 0.15, 0.275, 0.305, 0.355, 0.391 };

	private double taxableIncome = 100000;

	public Tax() {
	}

	public Tax(int fillingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = fillingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}

	public int getFilingStatus() {
		return filingStatus;
	}

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	public int[][] getBrackets() {
		return brackets;
	}

	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public double[] getRates() {
		return rates;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public double getTax() {

		double tax = 0;

		if (taxableIncome <= brackets[filingStatus][0])
			return tax = taxableIncome * rates[0];
		else
			tax = brackets[filingStatus][0] * rates[0];

		int i;

		for (i = 1; i < brackets[0].length; i++) {

			if (taxableIncome > brackets[filingStatus][i])
				tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1] * rates[i]);
			else {
				tax += (taxableIncome - brackets[filingStatus][i - 1] * rates[i]);
			}
		}

		if (i == brackets[0].length && taxableIncome > brackets[filingStatus][i - 1])
			tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
		
		return tax;
	}
}
