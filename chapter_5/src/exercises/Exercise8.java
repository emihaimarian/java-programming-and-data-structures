/**
 * (Find the highest score) Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the name
 * of the student with the highest score. Use the next() method in the Scanner
 * class to read a name, rather than using the nextLine() method. Assume that the
 * number of students is at least 1.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number of Students: ");
        int numberOfStudents = scanner.nextInt();

        int counter = 0;
        String studentWithMaxScore = "";
        int highestScore = 0;


        //It`s better with a for loop //for (int i = 0; i < numberOfStudents; i++){ **insert logic here, delete int counter;}
        while (counter < numberOfStudents) {

            System.out.println("Insert student name: ");
            String studentName = scanner.next();

            System.out.println("Insert student score: ");
            int studentScore = scanner.nextInt();

            if (studentScore > highestScore) {
                studentWithMaxScore = studentName;
                highestScore = studentScore;
            }

            counter++;

        }
        System.out.println(studentWithMaxScore + " have the highest score : " + highestScore);
    }
}
