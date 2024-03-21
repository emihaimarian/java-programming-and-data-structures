/**
 * (Generate vehicle plate numbers) Assume that a vehicle plate number consists
 * of three uppercase letters followed by four digits. Write a program to generate a
 * plate number.
 */
package src.exercises;

public class Exercise24 {

    public static void main(String[] args) {

        char c1 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        char c2 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        char c3 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));

        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        int n3 = (int) (Math.random() * 10);
        int n4 = (int) (Math.random() * 10);

        System.out.println("Plate number: " + c1 + c2 + c3 + "-" + n1 + n2 + n3 + n4);
    }
}
