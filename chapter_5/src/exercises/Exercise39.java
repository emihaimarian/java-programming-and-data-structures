/**
 * (Financial application: find the sales amount) You have just started a sales job
 * in a department store. Your pay consists of a base salary and a commission. The
 * base salary is $5,000. The scheme shown below is used to determine the commission
 * rate.
 * Sales Amount         Commission Rate
 * $0.01–$5,000             6 percent
 * $5,000.01–$10,000        8 percent
 * $10,000.01 and above     10 percent
 * <p>
 * Note that this is a graduated rate. The rate for the first $5,000 is at 6%, the next
 * $5000 is at 8%, and the rest is at 10%. If your sales amounts to $25,000, the
 * commission is 5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200.
 * Your goal is to earn $30,000 a year. Write a program to find the minimum sales
 * you have to generate in order to make $30,000.
 */
package src.exercises;

public class Exercise39 {

    private static final double BASE_SALARY = 5000;

    public static void main(String[] args) {

        final double COMMISSION_TARGET = 30000;

        double salesAmount = 0;
        double commissionEarned = 0;

        while (commissionEarned < COMMISSION_TARGET) {
            salesAmount += 1;
            commissionEarned = calculateAmount(salesAmount);
        }

        System.out.println("Minimum sales amount needed to earn $30,000: $" + salesAmount);
    }

    public static double setCommissionRate(double salesAmount) {

        double commissionRate = 0;

        if (salesAmount <= 5000.0)
            commissionRate = 0.06;
        else if (salesAmount > 5000.0 && salesAmount <= 10000)
            commissionRate = 0.08;
        else if (salesAmount > 10000 && salesAmount <= 25000)
            commissionRate = 0.10;

        return commissionRate;
    }

    public static double calculateAmount(double salesAmount) {

        if (salesAmount <= 25000)
            return setCommissionRate(salesAmount) * salesAmount;
        else
            return BASE_SALARY * 0.06 + Math.min(BASE_SALARY, salesAmount - BASE_SALARY) * 0.08 + Math.max(0, salesAmount - 10000) * 0.10;
    }
}
