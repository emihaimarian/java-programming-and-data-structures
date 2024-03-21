/**
 * (Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It
 * uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
 * which is calculated from the other digits using the following formula:
 * 10 - (d1 + 3 * d2 + d3 + 3 * d4 + d5 + 3 * d6 + d7 + 3 * d8 + d9 + 3 * d10 + d11 + 3 * d12) % 10
 * If the checksum is 10, replace it with 0. Your program should read the input as a
 * string. Display “invalid input” if the input is invalid.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise47 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String ISBN = scanner.nextLine();

        //Regex -> nu trebuie sa contina litere si caractere speciale.
        String regex = "[a-zA-Z\\-!@#$%^&*()_+={}\\[\\]|\\\\:;\"'<>,.?/]";

        //Daca lungimea ISBN ului nu este 12 sau contine caractere speciale/litere printeza invalid input
        if (ISBN.length() != 12 || ISBN.matches(regex)) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        int sum = 0;
        int lastCharacter = 0;

        for (int i = 0; i < ISBN.length(); i++){

            //Ia fiecare caracter din Stringul ISBN
            char ch = ISBN.charAt(i);
            int number = 0;

            //Verifica daca caracterul este digit si asigneaza-l pe un int si transforma-l din ASCII in decimal
            if (Character.isDigit(ch)){
                number = Character.getNumericValue(ch);
            }

            //Daca i este numar par inmulteste-l cu 3 -> (d1 + 3 * d2 + d3 + 3 * d4 + d5 + 3 * d6 + d7 + 3 * d8 + d9 + 3 * d10 + d11 + 3 * d12)
            // dupa cum se vede in formula inmultirea se face din 2 in 2;
            if (i % 2 == 0)
                sum += 3 * number;
            else
                sum += number;
        }

        sum = 10 - sum % 10;

        if (sum != 10)
            lastCharacter = sum;

        System.out.println("The ISBN-13 number is " + ISBN + lastCharacter);
    }
}
