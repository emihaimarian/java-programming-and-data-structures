/**
 * (The Person, Student, Employee, Faculty, and Staff classes) 
 * Design a class named Person and its two subclasses named Student and Employee. 
 * Make Faculty and Staff subclasses of Employee. 
 * A person has a name, address, phone number, and e-mail address. 
 * A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. 
 * An employee has an office, salary, and date hired. 
 * Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
 * A faculty member has office hours and a rank. 
 * A staff member has a title. Override the toString method in each class to display the class name and the person’s name.
 * Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
 */
package exercises.exercise2;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("person");
		Student student = new Student("student");
		Employee employee = new Employee("employee");
		Faculty faculty = new Faculty("faculty");
		Staff staff = new Staff("staff");

		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
	}

}
