/**
 * (Display the ASCII character table) Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
 * table is given in Appendix B. Characters are separated by exactly one space.
 */
package src.exercises;

public class Exercise15 {

    public static void main(String[] args) {

        final int NUMBERS_PER_LINE = 10;
        int count = 0;

        for (int startFrom = '!'; startFrom <= '~' + 1; startFrom++) {

            char toBePrinter = (char) startFrom;
            count++;

            if (count % NUMBERS_PER_LINE == 0)
                System.out.println(toBePrinter);
            else
                System.out.print(toBePrinter + " ");
        }


    }
}
