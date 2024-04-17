package bookExercises;

public class DeckOfCards {

	public static void main(String[] args) {

		/**
		 * cardNumber / 13 determines the suit of the card -> 0 - Spades, 1 - Hearts, 2
		 * - Diamonds, 3 - Clubs cardNumber % 13 determines the rank of the card -> 0 -
		 * Ace, 1 - 2, .... , 10 - Jack, 11 - Queen, 12 - King
		 */
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		int[] deck = new int[52];
		
		/** Initialize the deck of cards */
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;

		/** Shuffle the cards */
		for (int i = 0; i < deck.length; i++) {
			int randomIndex = (int) (Math.random() * deck.length);

			int tempIndex = deck[i];
			deck[i] = deck[randomIndex];
			deck[randomIndex] = tempIndex;
		}

		/** Display the first four cards */
		for (int i = 0; i < deck.length; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];

			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}
