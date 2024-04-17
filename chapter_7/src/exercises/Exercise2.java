/**
 * (Reverse the numbers entered) Write a program that reads 10 integers then displays 
 * them in the reverse of the order in which they were read.
 */

package exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] array = new int[10];

		fillArray(array, scanner);

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	public static void fillArray(int array[], Scanner scanner) {

		System.out.print("Insert numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
	}
}
