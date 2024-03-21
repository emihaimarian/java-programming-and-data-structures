package src.bookExamples;

import java.util.Scanner;

public class ComputeAngles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        //Compute the sides
        double a = calculateSide(x2, x3, y2, y3);
        double b = calculateSide(x1, x3, y1, y3);
        double c = calculateSide(x1, x2, y1, y2);

        //Compute the angles
        double A = calculateAngle(a, b, c);
        double B = calculateAngle(b, a, c);
        double C = calculateAngle(c, b, a);

        System.out.println("The three angles are " + roundAngle(A) + " " + roundAngle(B) + " " + roundAngle(C));
    }

    public static double calculateSide(double x, double x1, double y, double y1) {
        return Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2));
    }

    public static double calculateAngle(double firstAngle, double secondAngle, double thirdAngle) {
        return Math.toDegrees(Math.acos((Math.pow(firstAngle, 2) - Math.pow(secondAngle, 2) - Math.pow(thirdAngle, 2)) / (-2 * secondAngle * thirdAngle)));
    }

    public static double roundAngle(double angle) {
        return Math.round(angle * 100) / 100.0;
    }
}
