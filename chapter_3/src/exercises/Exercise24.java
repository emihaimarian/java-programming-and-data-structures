/**
 * (Game: pick a card) Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * Here is a sample run of the program:
 */
package src.exercises;

public class Exercise24 {

    public static void main(String[] args) {

        int randomCard = (int) (Math.random() * 13 + 1);
        int randomSuit = (int) (Math.random() * 4 + 1);

        if (randomCard == 11 || randomCard == 12 || randomCard == 13 || randomCard == 14) {
            //extract last digit to get the mapCardRank
            int extractDigit = randomCard % 10;
            System.out.println("The card you picked is " + mapCardRank(extractDigit) + " of " + mapCardSuit(randomSuit));
        } else {
            System.out.println("The card you picked is " + randomCard + " of " + mapCardSuit(randomSuit));
        }

    }

    public static String mapCardRank(int number) {

        return switch (number) {
            case 1 -> "Ace";
            case 2 -> "Jack";
            case 3 -> "Queen";
            case 4 -> "King";
            default -> "";
        };
    }

    public static String mapCardSuit(int number) {

        return switch (number) {
            case 1 -> "Clubs";
            case 2 -> "Diamonds";
            case 3 -> "Hearts";
            case 4 -> "Spades";
            default -> "";
        };
    }
}
