package bookExercises;

public class Test {

	public static void main(String[] args) {
		xM(10, 11);

		int max = 10;
		max(1, 2, max);
		System.out.println(max);

		int i = 1;
		while (i <= 6) {
			method1(i, 2);
			i++;
		}

	}

	public static void xM(double x, double y) {
		if (x != 10)
			return;
		System.out.println(x + y);
	}

	public static void max(int value1, int value2, int max) {

		if (value1 > value2)
			max = value1;
		else
			max = value2;
	}

	public static void method1(int i, int num) {

		for (int j = 1; j <= i; j++) {
			System.out.print(num + " ");
			num *= 2;
		}

		System.out.println();
	}
}