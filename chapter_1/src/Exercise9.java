/**
 * 1.9 (Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a rectangle with the width of 5.3 and height of 8.6 using the
 * following formula:
 * area = width * height
 * perimeter = 2 * (width + height)
 */

public class Exercise9 {
    public static void main(String[] args) {

        double width = 5.3;
        double height = 8.6;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
