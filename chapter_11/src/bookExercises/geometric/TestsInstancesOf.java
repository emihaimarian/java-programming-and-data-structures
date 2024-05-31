package bookExercises.geometric;

public class TestsInstancesOf {

	public static void main(String[] args) {

		Circle circle = new Circle(1);
		GeometricObject object1 = new GeometricObject();

		if (circle instanceof GeometricObject) {
			System.out.println("circle is a instanceof GeometricObject");
		}
		if (object1 instanceof GeometricObject) {
			System.out.println("object1 is a instanceof GeometricObject");
		}

		if (circle instanceof Circle) {
			System.out.println("circle is a instanceof Circle");
		}

		if (object1 instanceof Circle) {
			System.out.println("object1 is a instanceof Circle");
		}

		Circle circle2 = new Circle(5);
		GeometricObject object2 = circle;

		//ClassCastException 
		GeometricObject object3 = new GeometricObject();
		Circle circle3 = (Circle) object3;

		
		ClassCastException cce = new ClassCastException();
	}
}
