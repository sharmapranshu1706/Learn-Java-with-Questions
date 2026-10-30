package model;

public class Book {
    private int id;
    private String title;
    private String author;
    private BookStatus status;
    private int issuedToMemberId; // -1 matlab kisi ko issue nahi hui

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = BookStatus.AVAILABLE;
        this.issuedToMemberId = -1;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public BookStatus getStatus() { return status; }
    public int getIssuedToMemberId() { return issuedToMemberId; }

    public void issueTo(int memberId) {
        this.status = BookStatus.ISSUED;
        this.issuedToMemberId = memberId;
    }

    public void markReturned() {
        this.status = BookStatus.AVAILABLE;
        this.issuedToMemberId = -1;
    }

    @Override
    public String toString() {
        return String.format("%-4d %-28s %-20s %s", id, title, author, status);
    }
}
