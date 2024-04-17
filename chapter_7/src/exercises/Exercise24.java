/**
 * (Simulation: coupon collector’s problem) Coupon collector is a classic statistics problem with many practical applications. 
 * The problem is to repeatedly pick objects from a set of objects and find out how many picks are needed for all the
 * objects to be picked at least once. A variation of the problem is to pick cards from a shuffled deck of 52 cards repeatedly, 
 * and find out how many picks are needed before you see one of each suit. 
 * Assume a picked card is placed back in the deck before picking another. 
 * Write a program to simulate the number of picks needed to get four cards from each suit and display the four cards picked 
 *(it is possible a card may be picked twice). Here is a sample run of the program:
 */
package exercises;

public class Exercise24 {

	public static void main(String[] args) {

		int[] deck = new int[52];
		int[] picks = new int[4];

		initDeckOfCards(deck);
		shuffleDeck(deck);

		int count = 0;

		do {
			randomPick(deck, deck);
			count++;
		} while (!isOneOFEachSuit(picks));

		printTheFirstFourPickedCards(picks);
		System.out.println("Number of picks: " + count);
	}

	private static void initDeckOfCards(int[] deck) {
		/** Initialize the deck of cards */
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
	}

	private static int randomCard(int[] deck) {
		return (int) (Math.random() * deck.length);
	}

	private static void randomPick(int[] deck, int[] picks) {

		for (int i = 0; i < picks.length; i++) {
			picks[i] = deck[randomCard(deck)];
		}
	}

	private static void shuffleDeck(int[] deck) {
		/** Shuffle the cards */
		for (int i = 0; i < deck.length; i++) {

			int randomCard = randomCard(deck);
			int tempIndex = deck[i];
			deck[i] = deck[randomCard];
			deck[randomCard] = tempIndex;
		}
	}

	private static void printTheFirstFourPickedCards(int[] picks) {
		/** Display the first four cards */

		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		for (int i = 0; i < picks.length; i++) {
			System.out.println(ranks[picks[i] % 13] + " of " + suits[picks[i] / 13]);
		}
	}

	public static boolean isOneOFEachSuit(int[] picks) {
		/** isOneOFEachSuit tests if one card of each suit was picked */

		for (int i = 0; i < picks.length; i++) {
			for (int j = 0; j < picks.length; j++) {
				if (i != j && (picks[i] / 13 == picks[j] / 13))
					return false;
			}
		}
		return true;
	}

}
