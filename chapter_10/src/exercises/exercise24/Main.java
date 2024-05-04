package exercises.exercise24;

public class Main {

	public static void main(String[] args) {

		MyCharacter c = new MyCharacter('A');

		System.out.println(c.isDigit());
		System.out.println(MyCharacter.isDigit('t'));
	}
}
