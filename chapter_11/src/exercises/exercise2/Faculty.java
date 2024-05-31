package exercises.exercise2;

public class Faculty extends Employee {

	protected String officeHours;
	protected int rank;

	public final static int LECTURER = 1;
	public final static int ASSISTANT_PROFESSOR = 2;
	public final static int ASSOCIATE_PROFESSOR = 3;
	public final static int PROFESSOR = 4;

	public Faculty(String name) {
		super(name);
	}

	public Faculty(String name, String officeHours, int rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty: " + getName();
	}
}
