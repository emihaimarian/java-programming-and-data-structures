/**
 * 1.4 (Print a table) Write a program that displays the following table:
 * a a^2 a^3
 * 1 1 1
 * 2 4 8
 * 3 9 27
 * 4 16 64
 */

public class Exercise4 {

    public static void main(String[] args) {

        int num = 4;

        System.out.println("a a^2 a^3 a^4");

        for (int row = 1; row <= num; row++) {
            System.out.println(row + " " + (int) Math.pow(row, 2) + " " + (int) Math.pow(row, 3) + " " + (int) Math.pow(row, 4));
        }
    }
}
