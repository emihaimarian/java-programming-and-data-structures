/**
 * (Implement the String class) The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyString1):
 * public MyString1(char[] chars);
 * public char charAt(int index); 
 * public int length(); 
 * public MyString1 substring(int begin, int end); 
 * public MyString1 toLowerCase(); 
 * public boolean equals(MyString1 s); 
 * public static MyString1 valueOf(int i);
 */
package exercises.exercise22;

public class MyString {

	private char[] chars;

	public MyString(char[] chars) {
		this.chars = new char[chars.length];
		System.arraycopy(chars, 0, this.chars, 0, chars.length);
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int lenght() {
		return chars.length;
	}

	public MyString substring(int begin, int end) {

		char[] temp = new char[end - begin];

		for (int i = begin; i < end; i++) {
			temp[i - begin] = chars[i];
		}

		return new MyString(temp);
	}

	public MyString toLowerCase() {

		char[] temp = new char[lenght()];

		for (int i = 0; i < lenght(); i++) {
			temp[i] = Character.toLowerCase(chars[i]);
		}

		return new MyString(temp);
	}

	public static MyString valueOf(int i) {

		char[] temp = new char[40];
		int size = 0;

		while (i != 0) {

			int number = i % 10;
			i /= 10;
			temp[size] = (char) (number + '0');
			size++;
		}

		char[] temp2 = new char[size];

		for (int j = size - 1; j >= 0; j--) {
			temp2[j] = temp[size - j - 1];
		}

		return new MyString(temp);

	}

	public boolean equals(MyString s) {

		if (this == s)
			return true;

		if (s.lenght() != lenght())
			return false;

		for (int i = 0; i < lenght(); i++) {

			if (chars[i] != s.chars[i])
				return false;
		}

		return true;
	}

	public char[] toChars() {
		return chars;
	}
}
