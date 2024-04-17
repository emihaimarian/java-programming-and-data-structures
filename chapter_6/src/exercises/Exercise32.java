/**
 * (Game: chance of winning at craps) Revise Exercise 6.30 to run it 15,000 times and display the number of winning games.
 */
package exercises;

public class Exercise32 {

	public static void main(String[] args) {

		int wins = 0;

		for (int i = 0; i < 15000; i++) {

			int temporary = 0;

			while (true) {
				int sumOfBothDices = sumOfBothDices();

				if (sumOfBothDices == temporary)
					sumOfBothDices = 7;
				else if (temporary != 0)
					sumOfBothDices = 2;

				if (sumOfBothDices == 2 || sumOfBothDices == 3 || sumOfBothDices == 12)
					break;
				else if (sumOfBothDices == 7 || sumOfBothDices == 11) {
					wins++;
					break;
				}
				temporary = sumOfBothDices;
			}
		}
		System.out.println("chance to win is " + ((wins / 15_000.0)) * 100 + "%");
	}

	public static int rollDice() {
		return (int) (1 + Math.random() * 6);
	}

	public static int sumOfBothDices() {

		int firstDice = rollDice();
		int secondDice = rollDice();

		return firstDice + secondDice;
	}
}
