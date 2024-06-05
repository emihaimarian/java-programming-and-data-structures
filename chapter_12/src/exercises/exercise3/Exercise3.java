/**
 * (InputMismatchException) The previous program works well as long
 * as the user enters an integer. Otherwise, you may get another kind of exception.
 * For instance, if you use nextInt() of Scanner, you could have an
 * InputMismatchException.
 * Modify it to prevent users entering anything other than an integer.
 */
package exercises.exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[ ] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};

        int[ ] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter an integer between 1 and 12: ");
        int number = scanner.nextInt();

        try{
            System.out.println("Month " + months[number - 1] + " has " + dom[number - 1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong number");
        }catch (InputMismatchException e){
            System.out.println("insert only integers");
        }
    }
}
