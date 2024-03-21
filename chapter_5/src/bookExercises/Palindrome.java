package src.bookExercises;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        int firstIndexInTheString = 0;
        int lastIndexInTheString = string.length() - 1;

        boolean isPalindrome = true;

        while (firstIndexInTheString < lastIndexInTheString) {

            if (string.charAt(firstIndexInTheString) != string.charAt(lastIndexInTheString)) {
                isPalindrome = false;
                break;
            }
            firstIndexInTheString++;
            lastIndexInTheString--;
        }

        if (isPalindrome)
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}
