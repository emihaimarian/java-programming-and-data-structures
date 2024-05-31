package exercises.exercise5;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("DSA");
		Course course2 = new Course("Algorithms");

		course1.addStudent("Mihai");
		course1.addStudent("Marian");
		course1.addStudent("Alex");

		course2.addStudent("Victor");
		course2.addStudent("Razvan");

		System.out.println(
				"Number of students in the " + course1.getCourseName() + " class is " + course1.getNumberOfStudents());

		for (String student : course1.getStudents()) {
			System.out.println("Students: " + student);
		}

		System.out.println(
				"Number of students in the " + course2.getCourseName() + " class is " + course2.getNumberOfStudents());

		for (String student : course2.getStudents()) {
			System.out.println("Students: " + student);
		}
	}
}
