/**
 * (The Course class) Revise the Course class as follows: 
 * Revise the getStudents() method to return an array whose length is the same as the number of students in the course. 
 * (Hint: create a new array and copy students to it.)
 * The array size is fixed in Listing 10.6. Revise the addStudent method to automatically 
 * increase the array size if there is no room to add more students. 
 * This is done by creating a new larger array and copying the contents of the current array to it.
 * Implement the dropStudent method.
 * Add a new method named clear() that removes all students from the course.
 */
package exercises.exercise9;

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