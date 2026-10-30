package service;

import exception.LibraryException;
import model.Book;
import model.Member;

public interface LibraryService {
    Book addBook(String title, String author) throws LibraryException;
    Member addMember(String name) throws LibraryException;
    void removeBook(int bookId) throws LibraryException;

    Book[] getAllBooks();
    Member[] getAllMembers();
    Book[] searchBooks(String keyword);

    void issueBook(int bookId, int memberId) throws LibraryException;

    // fine return karta hai (Rs)
    int returnBook(int bookId, int daysKept) throws LibraryException;
}
