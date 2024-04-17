/**
 * (Generate random characters) Use the methods in RandomCharacter in Listing 6.10 
 * to print 200 uppercase letters and then 200 single digits, printing ten 
 * per line.
 */
package exercises;

public class Exercise38 {

	public static void main(String[] args) {

		final int NUMBER_OF_CHARS = 200;
		final int NUMBER_OF_DIGITS = 200;
		final int CHARS_PER_LINE = 10;

		for (int i = 0; i < NUMBER_OF_CHARS; i++) {

			char ch = getRandomUpperCaseLetter();

			if ((i + 1) % CHARS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch);
		}

		for (int i = 1; i <= NUMBER_OF_DIGITS; i++) {
			char digit = getRandomDigitCharacter();

			if ((i + 1) % CHARS_PER_LINE == 0)
				System.out.println(digit);
			else
				System.out.print(digit);
		}
	}

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

}
