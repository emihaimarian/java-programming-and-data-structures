/**
 * (Random point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centred at (0, 0) with width 50 and height 150.
 */
package src.exercises;

public class Exercise16 {

    public static void main(String[] args) {

        int width = (int) ((Math.random() * (50 + 50)) - 50);
        int height = (int) ((Math.random() * (150 + 150)) - 100);

        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println("with width 50 and height 150: (" + width + ", " + height + ")");
    }
}
