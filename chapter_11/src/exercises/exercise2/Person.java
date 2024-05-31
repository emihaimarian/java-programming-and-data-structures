package exercises.exercise2;

public class Person {

	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String emailAddress;

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String address, String phoneNumber, String emailADdress) {
		this(name);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailADdress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Person: " + getName();
	}
}
