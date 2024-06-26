package bookExercises;

import java.util.Scanner;

public class InputMismatchException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;

        do{
            try{
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();

                System.out.println("The number entered is " + number);

                continueInput = false;
            }catch (java.util.InputMismatchException e){
                System.out.println("Try again. (Incorrect input: an integer is required)");
                scanner.nextLine();
            }
        }while(continueInput);
    }
}
