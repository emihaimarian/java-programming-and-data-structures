package bookExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		System.out.print("Enter integers (input ends with 0): ");

		int value;

		do {
			value = scanner.nextInt();

			if (!list.contains(value) && value != 0) {
				list.add(value);
			}
		} while (value != 0);

		System.out.println("The distinct integers are: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		

	}
}
