/**
 * (ArrayIndexOutOfBoundsException) Using the two arrays shown below,
 * write a program that prompts the user to enter an integer between 1 and 12 and
 * then displays the months and its number of days corresponding to the integer
 * entered. Your program should display “wrong number” if the user enters a
 * wrong number by catching ArrayIndexOutOfBoundsException.
 * String[ ] months = {"January", "February", "March", "April",
 * "May", "June","July", "August", "September", "October",
 * "November", "December"};
 * int[ ] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 */
package exercises.exercise2;

import java.util.Scanner;

public class Exercise2 {

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
        }
    }
}
