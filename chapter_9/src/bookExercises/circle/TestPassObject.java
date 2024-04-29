package bookExercises.circle;

public class TestPassObject {

	public static void main(String[] args) {

		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

		int n = 5;
		printAreas(myCircle, n);
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);

	}

	public static void printAreas(CircleWithPrivateDataFields cirlce, int times) {

		System.out.println("Radius \t\tArea");

		while (times >= 1) {
			System.out.println(cirlce.getRadius() + "\t\t" + cirlce.getArea());
			cirlce.setRadius(cirlce.getRadius() + 1);
			times--;
		}
	}
}
       