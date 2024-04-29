package bookExercises.count;

public class Test {

	public static void main(String[] args) {

		Count count = new Count();

		int times = 0;

		for (int i = 0; i < 100; i++) {
			increment(count, times);
		}

		System.out.println("count is " + count.count);
		System.out.println("times is " + times);
	}

	public static void increment(Count c, int times) {
		c.count++;
		times++;
		System.out.println("times in method " + times);
	}
}
