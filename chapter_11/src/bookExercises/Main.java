package bookExercises;

public class Main {

	public static void main(String[] args) {

		Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();

		if (fruit instanceof Fruit)
			System.out.println("fruit is instanceof Fruit");
		else
			System.out.println("No, fruit is not instanceof Fruit");

		if (fruit instanceof Orange)
			System.out.println("fruit is instanceof Orange");
		else
			System.out.println("No, fruit is not instanceof Orange");

		if (fruit instanceof Apple)
			System.out.println("fruit is instanceof Apple");
		else
			System.out.println("No, fruit is not instanceof Apple");

		if (fruit instanceof GoldenDelicious)
			System.out.println("fruit is instanceof GoldenDelicious");
		else
			System.out.println("No, fruit is not instanceof GoldenDelicious");

		if (fruit instanceof McIntosh)
			System.out.println("fruit is instanceof MacIntosh");
		else
			System.out.println("No, fruit is not instanceof Macintosh");

		if (orange instanceof Orange)
			System.out.println("orange is instanceof Orange");
		else
			System.out.println("No, orange is not instanceof Orange");

		if (orange instanceof Fruit)
			System.out.println("orange is instanceof Fruit");
		else
			System.out.println("No, orange is not instanceof Fruit");

		/** not if (orange instanceof Apple) */

	}
}

class Fruit {

	public Fruit() {

	}
}

class Orange extends Fruit {

	public Orange() {
	}

	public void makeOrangeJuice() {
	}
}

class Apple extends Fruit {

	public Apple() {

	}

	public void makeAppleCider() {
	}
}

class GoldenDelicious extends Apple {

	public GoldenDelicious() {

	}
}

class McIntosh extends Apple {

	public McIntosh() {

	}
}