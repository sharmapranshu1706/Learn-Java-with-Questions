package service;

import exception.LibraryException;
import model.Book;
import model.BookStatus;
import model.Member;
import java.util.Locale;

public class LibraryServiceImpl implements LibraryService {
    private static final int CAPACITY = 100;
    private static final int LOAN_DAYS = 14;
    private static final int FINE_PER_DAY = 2;

    // Arrays heap pe banenge, reference variables stack pe
    private Book[] books = new Book[CAPACITY];
    private Member[] members = new Member[CAPACITY];
    private int bookCount = 0;
    private int memberCount = 0;
    private int nextBookId = 1;
    private int nextMemberId = 1;

    @Override
    public Book addBook(String title, String author) throws LibraryException {
        if (title == null || title.isBlank() || author == null || author.isBlank()) {
            throw new LibraryException("Title aur author empty nahi ho sakte.");
        }
        if (bookCount == CAPACITY) {
            throw new LibraryException("Library full hai, aur books add nahi ho sakti.");
        }
        Book book = new Book(nextBookId++, title.trim(), author.trim());
        books[bookCount++] = book;
        return book;
    }

    @Override
    public Member addMember(String name) throws LibraryException {
        if (name == null || name.isBlank()) {
            throw new LibraryException("Name empty nahi ho sakta.");
        }
        if (memberCount == CAPACITY) {
            throw new LibraryException("Member limit reach ho gayi.");
        }
        Member member = new Member(nextMemberId++, name.trim());
        members[memberCount++] = member;
        return member;
    }

    @Override
    public void removeBook(int bookId) throws LibraryException {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == bookId) {
                if (books[i].getStatus() == BookStatus.ISSUED) {
                    throw new LibraryException("Issued book remove nahi kar sakte.");
                }
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                return;
            }
        }
        throw new LibraryException("Book ID " + bookId + " nahi mili.");
    }

    @Override
    public Book[] getAllBooks() {
        Book[] result = new Book[bookCount];
        for (int i = 0; i < bookCount; i++) {
            result[i] = books[i];
        }
        return result;
    }

    @Override
    public Member[] getAllMembers() {
        Member[] result = new Member[memberCount];
        for (int i = 0; i < memberCount; i++) {
            result[i] = members[i];
        }
        return result;
    }

    @Override
    public Book[] searchBooks(String keyword) {
        if (keyword == null) {
            return new Book[0];
        }
        String k = keyword.trim().toLowerCase(Locale.ROOT);
        Book[] temp = new Book[bookCount];
        int found = 0;
        for (int i = 0; i < bookCount; i++) {
            String title = books[i].getTitle().toLowerCase(Locale.ROOT);
            String author = books[i].getAuthor().toLowerCase(Locale.ROOT);
            if (title.contains(k) || author.contains(k)) {
                temp[found++] = books[i];
            }
        }
        Book[] result = new Book[found];
        for (int i = 0; i < found; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    @Override
    public void issueBook(int bookId, int memberId) throws LibraryException {
        Book book = findBook(bookId);
        Member member = findMember(memberId);

        if (book.getStatus() == BookStatus.ISSUED) {
            throw new LibraryException("Book already issued hai.");
        }
        if (!member.canBorrow()) {
            throw new LibraryException("Limit reached: max " + Member.getMaxBooks() + " books hi le sakte ho.");
        }
        book.issueTo(memberId);
        member.addBook(bookId);
    }

    @Override
    public int returnBook(int bookId, int daysKept) throws LibraryException {
        if (daysKept < 0) {
            throw new LibraryException("Days negative nahi ho sakte.");
        }
        long fine = Math.max(0L, (long) daysKept - LOAN_DAYS) * FINE_PER_DAY;
        if (fine > Integer.MAX_VALUE) {
            throw new LibraryException("Late fine bahut zyada hai. Valid days daalo.");
        }
        Book book = findBook(bookId);
        if (book.getStatus() == BookStatus.AVAILABLE) {
            throw new LibraryException("Ye book issue hi nahi thi.");
        }
        Member member = findMember(book.getIssuedToMemberId());
        member.removeBook(bookId);
        book.markReturned();

        return (int) fine;
    }

    // private helpers: bahar se access nahi honge
    private Book findBook(int bookId) throws LibraryException {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == bookId) {
                return books[i];
            }
        }
        throw new LibraryException("Book ID " + bookId + " nahi mili.");
    }

    private Member findMember(int memberId) throws LibraryException {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getId() == memberId) {
                return members[i];
            }
        }
        throw new LibraryException("Member ID " + memberId + " nahi mila.");
    }
}
