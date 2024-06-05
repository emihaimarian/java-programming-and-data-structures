/**
 * (Process large dataset) A university posts its employees’ salaries at http://
 * liveexample.pearsoncmg.com/data/Salary.txt. Each line in the file consists of
 * a faculty member’s first name, last name, rank, and salary (see Programming
 * Exercise 12.24). Write a program to display the total salary for assistant professors,
 * associate professors, full professors, and faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,
 * and faculty, respectively.
 */
package exercises.exercise25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise25 {

    private static final String URL = "http://liveexample.pearsoncmg.com/data/Salary.txt";

    public static void main(String[] args) {

        try {
            URL url = new URL(URL);

            List<Member> memberList = getMemberList(url);
            List<Double> assistantSalaryList = new ArrayList<>();
            List<Double> associateSalaryList = new ArrayList<>();
            List<Double> fullSalaryList = new ArrayList<>();

            for (Member member : memberList) {

                switch (member.getRank()) {
                    case "assistant" -> assistantSalaryList.add(member.getSalary());
                    case "associate" -> associateSalaryList.add(member.getSalary());
                    case "full" -> fullSalaryList.add(member.getSalary());
                }
            }

            printSalaryInfo("assistant", assistantSalaryList);
            printSalaryInfo("associate", associateSalaryList);
            printSalaryInfo("full", fullSalaryList);

        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static List<Member> getMemberList(URL url) {

        List<Member> memberList = new ArrayList<>();

        try (Scanner scanner = new Scanner(url.openStream())) {

            while (scanner.hasNext()) {

                String lineFromFile = scanner.nextLine();
                String[] memberValues = lineFromFile.split(" ");

                Member member = new Member(memberValues[0], memberValues[1], memberValues[2], Double.parseDouble(memberValues[3]));

                memberList.add(member);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return memberList;
    }

    private static void printSalaryInfo(String rank, List<Double> salaryList) {

        if (salaryList.isEmpty()) {
            System.out.println("No data available for " + rank);
            return;
        }

        double totalSalary = salaryList.stream().mapToDouble(Double::doubleValue).sum();
        double averageSalary = totalSalary / salaryList.size();

        System.out.println("Total salary for " + rank + ": " + totalSalary);
        System.out.println("Average salary for " + rank + ": " + averageSalary);
    }
}
