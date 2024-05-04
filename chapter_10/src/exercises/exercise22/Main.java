package exercises.exercise22;

public class Main {

	public static void main(String[] args) {
		
		MyString s = new MyString(new char[] { 'a', 'b', 'c' });
		
		System.out.println(s.lenght());
		System.out.println(s.charAt(1));
		
		System.out.println(s.equals(new MyString(new char[] { 'a', 'b', 'c' })));

		char[] chars = MyString.valueOf(345).toChars();
		
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}
}
