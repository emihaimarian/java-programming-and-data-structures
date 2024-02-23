/**
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three digit number.
 * The program prompts the user to enter a three-digit number and determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $12,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award
 * is $5,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award
 * is $2,000.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lottery = (int) (Math.random() * 1000);
        System.out.println(lottery);

        System.out.println("Enter your lottery pick (three digits): ");
        int guess = scanner.nextInt();

        int lotteryDigit1 = lottery / 100;
        int remainingLotteryDigits = lottery % 100;

        int lotteryDigit2 = remainingLotteryDigits / 10;
        remainingLotteryDigits %= 10;

        int lotteryDigit3 = remainingLotteryDigits;

        int guessDigit1 = guess / 100;
        int remainingGuessDigits = guess % 100;

        int guessDigit2 = remainingGuessDigits / 10;
        remainingGuessDigits %= 10;

        int guessDigit3 = remainingGuessDigits;

        boolean checkFirstGuessDigitAgainstFirstLotteryDigit = checkBoolean(guessDigit1, lotteryDigit1);
        boolean checkFirstGuessDigitAgainstSecondLotteryDigit = checkBoolean(guessDigit1, lotteryDigit2);
        boolean checkFirstGuessDigitAgainstThirdLotteryDigit = checkBoolean(guessDigit1, lotteryDigit3);

        boolean checkSecondGuessDigitAgainstFirstLotteryDigit = checkBoolean(guessDigit2, lotteryDigit1);
        boolean checkSecondGuessDigitAgainstSecondLotteryDigit = checkBoolean(guessDigit2, lotteryDigit2);
        boolean checkSecondGuessDigitAgainstThirdLotteryDigit = checkBoolean(guessDigit2, lotteryDigit3);

        boolean checkThirdGuessDigitAgainstFirstLotteryDigit = checkBoolean(guessDigit3, lotteryDigit1);
        boolean checkThirdGuessDigitAgainstSecondLotteryDigit = checkBoolean(guessDigit3, lotteryDigit2);
        boolean checkThirdGuessDigitAgainstThirdLotteryDigit = checkBoolean(guessDigit3, lotteryDigit3);

        boolean checkFirstGuessDigitWithLotteryDigit = checkFirstGuessDigitAgainstFirstLotteryDigit || checkFirstGuessDigitAgainstSecondLotteryDigit || checkFirstGuessDigitAgainstThirdLotteryDigit;
        boolean checkSecondGuessDigitWithLotteryDigit = checkSecondGuessDigitAgainstFirstLotteryDigit || checkSecondGuessDigitAgainstSecondLotteryDigit || checkSecondGuessDigitAgainstThirdLotteryDigit;
        boolean checkThirdGuessDigitWithLotteryDigit = checkThirdGuessDigitAgainstFirstLotteryDigit || checkThirdGuessDigitAgainstSecondLotteryDigit || checkThirdGuessDigitAgainstThirdLotteryDigit;

        if (guess == lottery)
            System.out.println("Exact match: you win $12.000");
        else if (checkFirstGuessDigitWithLotteryDigit && checkSecondGuessDigitWithLotteryDigit && checkThirdGuessDigitWithLotteryDigit)
            System.out.println("Match all digits: you win $5,000");
        else if (checkFirstGuessDigitAgainstFirstLotteryDigit ||
                checkFirstGuessDigitAgainstSecondLotteryDigit ||
                checkFirstGuessDigitAgainstThirdLotteryDigit ||
                checkSecondGuessDigitAgainstFirstLotteryDigit ||
                checkSecondGuessDigitAgainstSecondLotteryDigit ||
                checkSecondGuessDigitAgainstThirdLotteryDigit ||
                checkThirdGuessDigitAgainstFirstLotteryDigit ||
                checkThirdGuessDigitAgainstSecondLotteryDigit ||
                checkThirdGuessDigitAgainstThirdLotteryDigit)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }

    public static boolean checkBoolean(int guessDigit, int lotteryDigit) {
        return guessDigit == lotteryDigit;
    }
}