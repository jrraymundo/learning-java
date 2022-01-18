package fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> books = new ArrayList<>(
            Arrays.asList(
                "Harry Potter",
                "Lord of the Rings",
                "The 48 Laws of Power",
                "Norwegian Wood"
            )
    );

    public static void main(String[] args) {
        System.out.print("Type a book keyword: ");
        String keyword = scanner.nextLine();

        ArrayList<String> results = new ArrayList<>();
        for (String book: books) {
            if (book.toLowerCase().contains(keyword.toLowerCase())) {
                results.add(book);
            }
        }

        if (results.size() > 0) {
            System.out.println("\nSearch results:");
            for (String book: results) {
                System.out.println(book);
            }
        }
        else {
            System.out.println("No books found");
        }
    }
}
