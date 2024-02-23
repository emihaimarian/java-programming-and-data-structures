/**
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of each package and displays the one with the
 * better price. Here is a sample run:
 */
package src.exercises;

import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: ");
        int weightFirstPackage = scanner.nextInt();
        double priceFirstPackage = scanner.nextDouble();

        System.out.println("Enter weight and price for package 2: ");
        int weightSecondPackage = scanner.nextInt();
        double priceSecondPackage = scanner.nextDouble();

        double firstPackagePrice = pricePerWeight(weightFirstPackage, priceFirstPackage);
        double secondPackagePrice = pricePerWeight(weightSecondPackage, priceSecondPackage);

        System.out.println("Package" + ((firstPackagePrice < secondPackagePrice) ? " 1" : " 2") + " has a better price");
    }

    public static double pricePerWeight(int weight, double price){
        return price / weight;
    }
}
