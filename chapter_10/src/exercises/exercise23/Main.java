package exercises.exercise23;

public class Main {

	public static void main(String[] args) {

		Name name = new Name("Enache Mihai");

		System.out.println(name.capitalize());
		System.out.println(name.getFirstName());
		System.out.println(name.getLastName());
		System.out.println(name.toInitials());
	}
}
