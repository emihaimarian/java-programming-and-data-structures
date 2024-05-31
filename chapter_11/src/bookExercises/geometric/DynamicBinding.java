package bookExercises.geometric;

public class DynamicBinding {

	public static void main(String[] args) {

		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}

	public static void m(Object obj) {

		System.out.println(obj.toString());
	}
}

class GraduateStudent extends Student {

}

class Student extends Person {

	@Override
	public String toString() {
		return "Sunt in clasa Student";
	}
}

class Person extends Object {

	@Override
	public String toString() {
		return "Sunt in clasa Person";
	}
}
