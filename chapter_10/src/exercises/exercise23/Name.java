/**
 * (Implement a Name class) Assume a name consists of first and last name separated by a space. 
 * Implement a Name class with the following methods:
 * public Name ( String name );
 * public Name toInitials ();
 * public Name capitalize ();
 * public String getFirstName ();
 * public String getLastName ();
 * public static Name fromFirstLast ( String first , String last ); -> I don`t understand what should I implement here
 */
package exercises.exercise23;

public class Name {

	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Name toInitials() {

		char firstNameInitial = getFirstName().charAt(0);
		char lastNameInitial = getLastName().charAt(0);

		return new Name(String.valueOf(firstNameInitial) + String.valueOf(lastNameInitial));
	}

	public Name capitalize() {
		return new Name(getName().toUpperCase());
	}

	public String getFirstName() {
		return getName().substring(0, getName().indexOf(' '));
	}

	public String getLastName() {
		return getName().substring(getName().indexOf(' ') + 1);
	}

	public String toString() {
		return getName();
	}
}
