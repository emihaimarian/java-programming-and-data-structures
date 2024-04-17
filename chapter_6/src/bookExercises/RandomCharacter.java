package bookExercises;

public class RandomCharacter {

	public static void main(String[] args) {

		final int NUMBER_OF_CHARS = 12;
		final int CHARS_PER_LINE = 12;

		for (int i = 0; i < NUMBER_OF_CHARS; i++) {

			char ch = getRandomCharacterFrom();

			if ((i + 1) % CHARS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch);
		}
	}

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	public static char getAllRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
	
	public static char getRandomCharacterFrom() {
		return getRandomCharacter('\u0030', '\u005A');
	}
}
