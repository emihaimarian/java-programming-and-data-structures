package exercises.exercise2;

public class Staff extends Employee {

	protected String title;

	public Staff(String name) {
		super(name);
	}

	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff: " + getName();
	}
}
