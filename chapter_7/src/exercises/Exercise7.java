/**
 * (Count single digits) Write a program that generates 200 random integers between 
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers, 
 * say counts, to store the counts, for the number of 0s, 1s, . . . , 9s.)
 */
package exercises;

public class Exercise7 {

	public static void main(String[] args) {

		int[] counts = new int[10];

		int loopCounts = 0;

		while (loopCounts < 200) {
			counts[(int) (Math.random() * 10)]++;
			loopCounts++;
		}

		System.out.println("Count for each number between 0 and 9: ");
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + "s: " + counts[i]);
		}
	}
}
