
public class Book {

    private final int bookId;
    private final String title;
    private final String author;
    private boolean isAvailable;

    // Constructor
    public Book(int bookId, String title,
                String author, boolean isAvailable) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Issue a book
    public boolean issueBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    // Return a book
    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }

    // Display book details
    public void displayBooks() {
        System.out.println("--------------------");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

        if (isAvailable) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Issued");
        }
    }
}
