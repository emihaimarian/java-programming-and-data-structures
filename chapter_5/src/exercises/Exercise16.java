/**
 * (Find the factors of an integer) Write a program that reads an integer and displays
 * all its smallest factors in an increasing order. For example, if the input
 * integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();

        int index = 2;

        while (integer != index){

            if (integer % index == 0){
                System.out.print(index + ", ");
                integer /= index;
            }else
                index++;
        }
        System.out.println(integer);
    }
}
