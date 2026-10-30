import java.util.Scanner;
import java.util.NoSuchElementException;

import exception.LibraryException;
import model.Book;
import model.Member;
import service.LibraryService;
import service.LibraryServiceImpl;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static LibraryService library = new LibraryServiceImpl(); // interface reference

    public static void main(String[] args) {
        seedData();
        int choice = -1;

        while (choice != 0) {
            printMenu();
            try {
                choice = readInt("Enter choice: ");
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        addMember();
                        break;
                    case 3:
                        listBooks();
                        break;
                    case 4:
                        listMembers();
                        break;
                    case 5:
                        searchBooks();
                        break;
                    case 6:
                        issueBook();
                        break;
                    case 7:
                        returnBook();
                        break;
                    case 8:
                        removeBook();
                        break;
                    case 0:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice, dobara try karo.");
                }
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NoSuchElementException e) {
                System.out.println("\nGoodbye!");
                return;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Book");
        System.out.println("2. Add Member");
        System.out.println("3. List All Books");
        System.out.println("4. List All Members");
        System.out.println("5. Search Books");
        System.out.println("6. Issue Book");
        System.out.println("7. Return Book");
        System.out.println("8. Remove Book");
        System.out.println("0. Exit");
    }

    private static void addBook() throws LibraryException {
        String title = readLine("Title: ");
        String author = readLine("Author: ");
        if (title.isEmpty() || author.isEmpty()) {
            throw new LibraryException("Title aur author empty nahi ho sakte.");
        }
        Book b = library.addBook(title, author);
        System.out.println("Book added, ID = " + b.getId());
    }

    private static void addMember() throws LibraryException {
        String name = readLine("Member name: ");
        if (name.isEmpty()) {
            throw new LibraryException("Name empty nahi ho sakta.");
        }
        Member m = library.addMember(name);
        System.out.println("Member added, ID = " + m.getId());
    }

    private static void listBooks() {
        Book[] all = library.getAllBooks();
        if (all.length == 0) {
            System.out.println("Koi book nahi hai.");
            return;
        }
        System.out.printf("%-4s %-28s %-20s %s%n", "ID", "Title", "Author", "Status");
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }

    private static void listMembers() {
        Member[] all = library.getAllMembers();
        if (all.length == 0) {
            System.out.println("Koi member nahi hai.");
            return;
        }
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }

    private static void searchBooks() {
        String keyword = readLine("Search (title/author): ");
        Book[] results = library.searchBooks(keyword);
        if (results.length == 0) {
            System.out.println("Koi match nahi mila.");
            return;
        }
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }

    private static void issueBook() throws LibraryException {
        int bookId = readInt("Book ID: ");
        int memberId = readInt("Member ID: ");
        library.issueBook(bookId, memberId);
        System.out.println("Book issue ho gayi (14 din ke liye).");
    }

    private static void returnBook() throws LibraryException {
        int bookId = readInt("Book ID: ");
        int days = readInt("Kitne din rakhi thi? ");
        int fine = library.returnBook(bookId, days);
        if (fine > 0) {
            System.out.println("Book return hui. Late fine: Rs " + fine);
        } else {
            System.out.println("Book return hui. Koi fine nahi.");
        }
    }

    private static void removeBook() throws LibraryException {
        int id = readInt("Book ID to remove: ");
        library.removeBook(id);
        System.out.println("Book remove ho gayi.");
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readLine(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Valid number daalo.");
            }
        }
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        if (!sc.hasNextLine()) {
            throw new NoSuchElementException("End of input");
        }
        return sc.nextLine().trim();
    }

    private static void seedData() {
        try {
            library.addBook("Effective Java", "Joshua Bloch");
            library.addBook("Clean Code", "Robert C. Martin");
            library.addBook("Head First Java", "Kathy Sierra");
            library.addMember("Pranshu");
            library.addMember("Amit");
        } catch (LibraryException e) {
            System.out.println("Seed error: " + e.getMessage());
        }
    }
}
