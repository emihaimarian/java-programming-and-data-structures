/**
 * (Random Color) Write a program that randomly generates an integer between
 * 1 and 7 and displays the name of a color in the rainbow—violet, indigo, blue,
 * green, yellow, orange, and red—for numbers 1, 2, 3, . . . , 7 accordingly.
 */
package src.exercises;

public class Exercise4 {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 7);

        switch (randomNumber) {
            case 1:
                System.out.println("violet");
                break;
            case 2:
                System.out.println("indigo");
                break;
            case 3:
                System.out.println("blue");
                break;
            case 4:
                System.out.println("green");
                break;
            case 5:
                System.out.println("yellow");
                break;
            case 6:
                System.out.println("orange");
                break;
            case 7:
                System.out.println("red");
                break;
        }
    }
}
