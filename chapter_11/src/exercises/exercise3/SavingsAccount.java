package exercises.exercise3;

public class SavingsAccount extends Account {

	protected boolean overdrawn;

	public SavingsAccount(boolean overdrawn) {
		super();
		this.overdrawn = overdrawn;
	}

	public SavingsAccount(boolean overdrawn, int accountNumber, double balance) {
		super(accountNumber, balance);
		this.overdrawn = overdrawn;
	}

	public boolean isOverdrawn() {
		return overdrawn;
	}

	public void setOverdrawn(boolean overdrawn) {
		this.overdrawn = overdrawn;
	}

	@Override
	public void withdraw(double amount) {

		if (amount < getBalance())
			setBalance(getBalance() - amount);
		else
			System.out.println("Error! Savings account overdrawn transtaction rejected");
	}
}
