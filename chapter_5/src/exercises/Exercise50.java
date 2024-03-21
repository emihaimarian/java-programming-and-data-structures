/**
 * (Print multiplication table) Write a program that uses for, while, and do-while
 * loop statements to display the multiplication table
 */
package src.exercises;

public class Exercise50 {

    public static void main(String[] args) {

        for(int i = 1; i <= 9; i++){

            for (int j = 1; j <= 9; j++){
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }

            System.out.println();
        }

        int size = 9;
        int i = 1;

        System.out.println("----------------------------------------------------------------------------------------------------------");
        while (i <= size){

            int j = 1;

            while (j <= size) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
