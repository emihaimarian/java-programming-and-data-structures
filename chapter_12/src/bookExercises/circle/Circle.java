package bookExercises.circle;

public class Circle {

    private static int numberOfObjects = 0;

    private double radius;

    public Circle(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public Circle() throws InvalidRadiusException {
        this(1.0);
    }

    public void setRadius(double radius) throws InvalidRadiusException {

        if (radius >= 0)
            this.radius = radius;
        else
            throw new InvalidRadiusException(radius);
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
