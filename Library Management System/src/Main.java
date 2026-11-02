
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Library library = new Library();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("0. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    int id = readInt("Enter Book ID: ");

                    if (id <= 0) {
                        System.out.println("ID must be positive!");
                        break;
                    }

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    if (title.trim().isEmpty() ||
                            author.trim().isEmpty()) {
                        System.out.println(
                                "Title and author cannot be empty!"
                        );
                        break;
                    }

                    Book book = new Book(
                            id, title, author, true
                    );

                    library.addBook(book);
                    break;

                case 2:
                    library.displayAllBooks();
                    break;

                case 3:
                    int searchId = readInt("Enter Book ID: ");
                    library.searchBook(searchId);
                    break;

                case 4:
                    int issueId = readInt("Enter Book ID: ");
                    library.issueBook(issueId);
                    break;

                case 5:
                    int returnId = readInt("Enter Book ID: ");
                    library.returnBook(returnId);
                    break;

                case 0:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Read integer safely
    public static int readInt(String message) {

        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(
                        "Please enter a valid number!"
                );
            }
        }
    }
}
