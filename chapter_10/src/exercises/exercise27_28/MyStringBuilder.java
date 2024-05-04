/**(Implement the StringBuilder class) Exercise 27 and 28 -> The StringBuilder class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyStringBuilder1): 
 * public MyStringBuilder(String s);
 * public MyStringBuilder append(MyStringBuilder1 s); 
 * public MyStringBuilder append(int i); 
 * public int length(); 
 * public char charAt(int index); 
 * public MyStringBuilder toLowerCase(); 
 * public MyStringBuilder substring(int begin, int end); 
 * public String toString(); 
 * public MyStringBuilder(); 
 * public MyStringBuilder(char[] chars); 
 * public MyStringBuilder(String s); 
 * public MyStringBuilder insert(int offset, MyStringBuilder2 s); 
 * public MyStringBuilder reverse(); 
 * public MyStringBuilder substring(int begin); 
 * public MyStringBuilder toUpperCase();
 */

package exercises.exercise27_28;

public class MyStringBuilder {

	private String string;

	public MyStringBuilder(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public MyStringBuilder append(MyStringBuilder sb) {
		return new MyStringBuilder(string += sb);
	}

	public MyStringBuilder append(int i) {
		return new MyStringBuilder(string += i + "");
	}

	public int length() {
		return getString().length();
	}

	public char charAt(int index) {
		return getString().charAt(index);
	}

	public MyStringBuilder toLowerCase() {
		return new MyStringBuilder(getString().toLowerCase());
	}

	public MyStringBuilder substring(int begin, int end) {
		return new MyStringBuilder("");
	}

	public String toString() {
		return getString();
	}
}
