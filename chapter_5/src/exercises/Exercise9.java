/**
 * (Find the two lowest scores) Write a program that prompts the user to enter the
 * number of students and each student’s name and score, and finally displays the
 * names of the students with the lowest and second-lowest scores.
 */
package src.exercises;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number of Students: ");
        int numberOfStudents = scanner.nextInt();

        String lowestStudentName = "";
        int lowestStudentScore = 0;

        String secondLowestStudentName = "";
        int secondLowestStudentScore = 0;


        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("Insert student name: ");
            String studentName = scanner.next();

            System.out.println("Insert student score: ");
            int studentScore = scanner.nextInt();

            //Make the first student to be the one with the lowest score
            if (i == 0) {
                lowestStudentName = studentName;
                lowestStudentScore = studentScore;

                secondLowestStudentName = studentName;
                secondLowestStudentScore = studentScore;
            }

            if (studentScore < secondLowestStudentScore) {

                if (studentScore < lowestStudentScore) {

                    String tempName = lowestStudentName;
                    int tempScore = lowestStudentScore;

                    lowestStudentScore = studentScore;
                    lowestStudentName = studentName;

                    secondLowestStudentScore = tempScore;
                    secondLowestStudentName = tempName;
                } else {
                    secondLowestStudentScore = studentScore;
                    secondLowestStudentName = studentName;
                }
            }
        }
        System.out.println(lowestStudentName + " have the lowest score : " + lowestStudentScore);
        System.out.println(secondLowestStudentName + " have the second lowest score : " + secondLowestStudentScore);
    }
}
