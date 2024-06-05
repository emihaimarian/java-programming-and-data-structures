package exercises.exercise19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the author: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter the title of the book: ");
        String bookName = scanner.nextLine();

        File authorFile = new File("D:\\Workspace\\chapter_12\\src\\exercises\\exercise19\\authors.txt");
        File bookFile = new File("D:\\Workspace\\chapter_12\\src\\exercises\\exercise19\\books.txt");

        if (!authorFile.exists() || !bookFile.exists()) {
            System.out.println("One or both files do not exist");
            System.exit(1);
        }

        int position = findAuthorPosition(authorName, authorFile);

        if (position == -1) {
            System.out.println("Author not found in the authors file");
            System.exit(1);
        }

        writeBookTitleWithPosition(bookName, position, bookFile);
    }

    /**
     * Read the file and return the position of the author
     */
    public static int findAuthorPosition(String authorName, File file) {
        List<String> lines = readInFile(file);

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).equals(authorName)) {
                return i + 1;
            }
        }
        return -1;
    }

    /**
     * Write the book title with the author's position
     */
    public static void writeBookTitleWithPosition(String bookTitle, int position, File file) {

        List<String> lines = readInFile(file);

        for (String line : lines) {
            if (line.equals(position + " " + bookTitle)) {
                System.out.println("The book title is already in the books file");
                return;
            }
        }

        lines.add(position + " " + bookTitle);
        writeFile(lines, file);
        System.out.println("Book title added successfully");
    }

    /**
     * Read the file and insert the lines into a list and return the list
     */
    public static List<String> readInFile(File file) {
        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        }

        return lines;
    }

    /**
     * Write the lines to the file
     */
    public static void writeFile(List<String> lines, File file) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (String line : lines) {
                printWriter.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        }
    }

    /**
     * Reads the file, finds the correct position to insert the name, insert the name, writes back the updated list and return the inserted position
     */
    public static int writeInFile(String name, File file) {
        List<String> lines = readInFile(file);

        int position = 0;
        for (String line : lines) {
            if (name.compareTo(line) > 0) {
                position++;
            } else {
                break;
            }
        }

        lines.add(position, name);
        writeFile(lines, file);

        return position;
    }
}