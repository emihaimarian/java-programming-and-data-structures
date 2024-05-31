package exercises.exercise2;

public class Student extends Person {

	private String classStatus;

	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;

	public Student(String name) {
		super(name);
	}

	public Student(String name, String classStatus) {
		super(name);
		this.classStatus = classStatus;
	}

	public String getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}

	@Override
	public String toString() {
		return "Student: " + getName();
	}
}
