/**
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary. The
 * faculty member’s first name and last name for the ith line are FirstNamei and
 * LastNamei. The rank is randomly generated as assistant, associate, and full.
 * The salary is randomly generated as a number with two digits after the decimal
 * point. The salary for an assistant professor should be in the range from 50,000
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 * FirstName1 LastName1 assistant 60055.95
 * FirstName2 LastName2 associate 81112.45
 * . . .
 * FirstName1000 LastName1000 full 92255.21
 */
package exercises.exercise24;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercise24 {

    public static void main(String[] args) {

        try (PrintWriter printWriter = new PrintWriter("Salary.txt")) {

            int totalNumberOfLinesToWrite = 1000;

            for (int i = 0; i < totalNumberOfLinesToWrite; i++) {

                Member member = new Member();

                member.setFirstName("FirstName");
                member.setLastName("LastName");

                printWriter.print(member.getFirstName() + i + " " + member.getLastName() + i + " ");

                int rank = (int) (Math.random() * 3);

                switch (rank) {
                    case 0:
                        member.setSalary(50000 + Math.random() * 30000);
                        member.setRank("assistant");
                        printWriter.printf("%s %.2f%n", member.getRank(), member.getSalary());
                        break;
                    case 1:
                        member.setSalary(60000 + Math.random() * 50000);
                        member.setRank("associate");
                        printWriter.printf("%s %.2f%n", member.getRank(), member.getSalary());
                        break;
                    case 2:
                        member.setSalary(75000 + Math.random() * 55000);
                        member.setRank("full");
                        printWriter.printf("%s %.2f%n", member.getRank(), member.getSalary());
                        break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
