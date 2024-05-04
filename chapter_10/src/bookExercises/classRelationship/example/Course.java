package bookExercises.classRelationship.example;

public class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public void setStudents(String[] students) {
		this.students = students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public void dropStudent(String student) {

		for (int i = 0; i < numberOfStudents; i++) {

			if (students[i].equals(student)) {

				for (int j = i; j < numberOfStudents - 1; j++) {
					students[j] = students[j + 1];
				}

				students[numberOfStudents - 1] = null;
				numberOfStudents--;
				return;
			}
		}
	}
}
