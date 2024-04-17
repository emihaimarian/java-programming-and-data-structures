/**
 * (Game: craps) Craps is a popular dice game played in casinos. 
 * Write a program to play a variation of the game, as follows: 
 * Roll two dice. 
 * Each die has six faces representing values 1, 2, . . ., and 6, respectively. 
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you lose; 
 * if the sum is 7 or 11 (called natural), you win; 
 * if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. 
 * Continue to roll the dice until either a 7 or the same point value is rolled. 
 * If 7 is rolled, you lose. Otherwise, you win.
 */
package exercises;

public class Exercise30 {

	public static void main(String[] args) {

		int temporary = 0;
		
		do {
			int sumOfBothDices = sumOfBothDices();
			
			if (sumOfBothDices == temporary)
				sumOfBothDices = 7;
			else if (temporary != 0)
				sumOfBothDices = 2;
				
			if (sumOfBothDices == 2 || sumOfBothDices == 3 || sumOfBothDices == 12) {
				System.out.println("You lose");
				break;
			}else if (sumOfBothDices == 7 || sumOfBothDices == 11) {
				System.out.println("You win");
				break;
			}
			
            System.out.println("point is " + sumOfBothDices);
            temporary = sumOfBothDices;
				
		} while (true);

	}

	public static int rollDice() {
		return (int) (1 + Math.random() * 6);
	}

	public static int sumOfBothDices() {

		int firstDice = rollDice();
		int secondDice = rollDice();
		int sum = firstDice + secondDice;

		System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sum);

		return sum;
	}
}