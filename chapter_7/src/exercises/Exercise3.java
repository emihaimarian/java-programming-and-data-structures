/**
 * Count occurrence of numbers) Write a program that reads the integers between 1 and 50 and counts 
 * the occurrences of each. Assume the input ends with 0.
 */
package exercises;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] array = new int[50];
		int number;

		System.out.print("Enter the integers between 1 and 50: ");

		do {
			number = scanner.nextInt();

			if (number > 0 && number < 51) {
				/**
				 * Numara de cate ori valoarea a fost introdusa de la tastatura. De exemplu,
				 * daca numarul 50 este introdus de la tastatura de 7 ori in indexul cu pozitia
				 * 49 va fi 7
				 */
				array[number - 1]++;
			}

		} while (number != 0);

		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0)
				System.out.println((i + 1) + " occurs " + array[i] + " time" + (array[i] > 1 ? "s" : ""));
		}
	}
}
