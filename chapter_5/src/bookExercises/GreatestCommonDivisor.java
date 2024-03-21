package src.bookExercises;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = scanner.nextInt();

        //Initial gcd is 1
        int gcd = 1;

        // Possible gcd
        int k = 2;

        while (k <= n1 && k <= n2){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
