package bookExercises;

public class SwapingObjects {

	public static void main(String[] args) {

		T t = new T();
		swap(t);
		System.out.println("e1 = " + t.e1 + " e2 = " + t.e2);

		T1 t1 = new T1();
		T1 t2 = new T1();
		System.out.println("t1's i = " + t1.i + " and j = " + t1.j);
		System.out.println("t2's i = " + t2.i + " and j = " + t2.j);
	}

	// Swap the atributes inside T class
	public static void swap(T t) {

		int temp = t.e1;
		t.e1 = t.e2;
		t.e2 = temp;
	}
}

class T {
	int e1 = 1;
	int e2 = 2;
}

class T1 {
	static int i = 0;
	int j = 0;

	T1() {
		i++;
		j = 1;
	}
}