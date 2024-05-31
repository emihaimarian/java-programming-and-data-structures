package exercises.exercise3;

public class CheckingAccount extends Account {

	protected double overdraftLimit;

	public CheckingAccount(double overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}

	public CheckingAccount(double overdraftLimit, int accountNumber, double balance) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {

		if (getBalance() - amount > getOverdraftLimit()) {
			setBalance(getBalance() - amount);
		} else
			System.out.println("Error! Amount exceeds overdraft limit.");
	}

	@Override
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + String.format("%.2f", overdraftLimit);
	}
}