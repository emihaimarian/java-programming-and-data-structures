/**
 * (Simulation: heads or tails) Write a program that simulates flipping a coin two
 * millions times and displays the number of heads and tails.
 */
package src.exercises;

public class Exercise40 {

    public static void main(String[] args) {

        final int LOOP_TIME = 2000000;

        int count = 0;
        int countTails = 0;
        int countHeads = 0;

        while (count <= LOOP_TIME) {

            int randomNumber = (int) (Math.random() * 2);

            if (randomNumber == 0)
                countTails++;
            else
                countHeads++;

            count++;
        }

        System.out.println("After " + LOOP_TIME + " millions loops the score is: " + countHeads + " for heads " + countTails + " for tails.");
        System.out.println((countHeads > countTails) ? "Head Wins" : "Tail Wins");
    }
}
