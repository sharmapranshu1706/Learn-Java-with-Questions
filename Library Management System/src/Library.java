import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> books = new ArrayList<>();

    // Add a new book
    public void addBook(Book book) {

        if (findBookById(book.getBookId()) != null) {
            System.out.println("Book ID already exists!");
            return;
        }

        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Display all books
    public void displayAllBooks() {

        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }

        for (Book book : books) {
            book.displayBooks();
        }
    }

    // Find book by ID
    private Book findBookById(int bookId) {

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    // Search a book
    public void searchBook(int bookId) {

        Book book = findBookById(bookId);

        if (book != null) {
            book.displayBooks();
        } else {
            System.out.println("Book not found!");
        }
    }

    // Issue a book
    public void issueBook(int bookId) {

        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found!");
        } else if (book.issueBook()) {
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book is already issued!");
        }
    }

    // Return a book
    public void returnBook(int bookId) {

        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found!");
        } else if (book.returnBook()) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book is already available!");
        }
    }
}
