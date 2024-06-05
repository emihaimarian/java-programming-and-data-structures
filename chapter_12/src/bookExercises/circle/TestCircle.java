package bookExercises.circle;

public class TestCircle {

    public static void main(String[] args) {

        try{
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(-5);
            Circle c3 = new Circle(0);
        } catch (InvalidRadiusException e) {
            System.out.println(e);
        }

        System.out.println("Number of objects created: " + Circle.getNumberOfObjects());
    }
}
