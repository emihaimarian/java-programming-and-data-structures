/**
 * 1.8 (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 6.5 using the following formula:
 * pi = 3.14159
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 */
public class Exercise8 {
    public static void main(String[] args) {

        double radius = 6.5;
        double PI =  3.14159;

        System.out.println((double) 2 * radius * PI);
        System.out.println(radius * radius * PI);
    }
}
