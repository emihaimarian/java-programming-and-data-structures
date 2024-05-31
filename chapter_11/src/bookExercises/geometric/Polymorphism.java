package bookExercises.geometric;

public class Polymorphism {

	public static void main(String[] args) {

		displayObject(new Circle(1, "red", false));
		displayObject(new Rectangle(1, 1, "black", true));
		System.out.println();

	}

	public static void displayObject(GeometricObject geometricObject) {
		System.out
				.println("Created on " + geometricObject.getDateCreated() + ". Color is " + geometricObject.getColor());
	}

}