/**
 * (The Course class) Rewrite the Course class in Listing 10.6. 
 * Use an ArrayList to replace an array to store students. 
 * You should not change the original contract of the Course class 
 * (i.e., the definition of the constructors and methods should not be changed, but the private members may be changed.)
 */
package exercises.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Course {

	protected String courseName;
	protected List<String> students = new ArrayList<String>();;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public void addStudent(String student) {
		getStudents().add(student);
	}

	public void dropStudent(String student) {
		getStudents().remove(student);
	}
}
