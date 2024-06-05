package exercises.exercise5;

public class Main {

    public static void main(String[] args) {

        try {
            Triangle triangle = new Triangle(1, 2, 3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
