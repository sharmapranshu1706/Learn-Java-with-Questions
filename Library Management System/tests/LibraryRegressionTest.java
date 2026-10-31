import exception.LibraryException;
import model.Book;
import model.BookStatus;
import model.Member;
import service.LibraryService;
import service.LibraryServiceImpl;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/** Dependency-free checks: compile with src, then run LibraryRegressionTest. */
public class LibraryRegressionTest {
    private static int checks;

    public static void main(String[] args) throws Exception {
        validationAndSearch();
        capacity();
        loans();
        console();
        System.out.println("Passed " + checks + " regression checks.");
    }

    private static void validationAndSearch() throws Exception {
        LibraryService service = new LibraryServiceImpl();
        for (String invalid : new String[]{null, "", " \t ", "\u2003"}) {
            expectError(() -> service.addBook(invalid, "Author"));
            expectError(() -> service.addBook("Title", invalid));
            expectError(() -> service.addMember(invalid));
        }
        check(service.getAllBooks().length == 0, "Invalid books are not stored");
        check(service.getAllMembers().length == 0, "Invalid members are not stored");
        Book book = service.addBook("  INSIDE Java  ", "  Writer  ");
        Member member = service.addMember("  Reader  ");
        check(book.getId() == 1 && member.getId() == 1, "Invalid additions do not consume IDs");
        check(book.getTitle().equals("INSIDE Java") && book.getAuthor().equals("Writer")
                && member.getName().equals("Reader"), "Accepted fields are trimmed");
        Locale previous = Locale.getDefault();
        try {
            Locale.setDefault(Locale.forLanguageTag("tr-TR"));
            check(service.searchBooks(" inside ").length == 1, "Title search is locale independent");
            check(service.searchBooks(" WRITER ").length == 1, "Author search is locale independent");
        } finally {
            Locale.setDefault(previous);
        }
        check(service.searchBooks(null).length == 0, "Null search has no matches");
        check(service.searchBooks("   ").length == 1, "Blank search returns all books");
        check(service.searchBooks("missing").length == 0, "Unmatched search is empty");
    }

    private static void capacity() throws Exception {
        LibraryService service = new LibraryServiceImpl();
        for (int i = 0; i < 100; i++) {
            service.addBook("Book " + i, "Author");
            service.addMember("Member " + i);
        }
        expectError(() -> service.addBook("Overflow", "Author"));
        expectError(() -> service.addMember("Overflow"));
        check(service.getAllBooks().length == 100 && service.getAllMembers().length == 100,
                "Capacity failures preserve counts");
        service.removeBook(50);
        Book replacement = service.addBook("Replacement", "Author");
        check(replacement.getId() == 101, "Capacity failure does not consume book ID");
        check(service.getAllBooks()[49].getId() == 51, "Removal compacts the book array");
    }

    private static void loans() throws Exception {
        LibraryService service = new LibraryServiceImpl();
        Member member = service.addMember("Reader");
        for (int i = 0; i < 4; i++) service.addBook("Book " + i, "Author");
        Book first = service.getAllBooks()[0];
        expectError(() -> service.issueBook(999, member.getId()));
        expectError(() -> service.issueBook(first.getId(), 999));
        expectError(() -> service.returnBook(999, 14));
        expectError(() -> service.removeBook(999));
        expectError(() -> service.returnBook(first.getId(), 14));
        check(first.getStatus() == BookStatus.AVAILABLE && member.getBorrowedCount() == 0,
                "Rejected operations preserve state");
        service.issueBook(1, member.getId());
        expectError(() -> service.issueBook(1, member.getId()));
        expectError(() -> service.removeBook(1));
        service.issueBook(2, member.getId());
        service.issueBook(3, member.getId());
        expectError(() -> service.issueBook(4, member.getId()));
        check(member.getBorrowedCount() == 3 && service.getAllBooks()[3].getStatus() == BookStatus.AVAILABLE,
                "Borrow limit leaves fourth book available");
        for (int invalidDays : new int[]{-1, Integer.MIN_VALUE, Integer.MAX_VALUE, 1_073_741_838}) {
            expectError(() -> service.returnBook(1, invalidDays));
            check(first.getStatus() == BookStatus.ISSUED && first.getIssuedToMemberId() == member.getId()
                    && member.getBorrowedCount() == 3, "Rejected return preserves loan");
        }
        check(service.returnBook(1, 0) == 0, "Same-day return has no fine");
        check(first.getStatus() == BookStatus.AVAILABLE && first.getIssuedToMemberId() == -1
                && member.getBorrowedCount() == 2, "Return clears loan state");
        check(service.returnBook(2, 14) == 0, "Day 14 has no fine");
        check(service.returnBook(3, 15) == 2, "Day 15 costs Rs 2");
        service.issueBook(4, member.getId());
        check(service.returnBook(4, 1_073_741_837) == 2_147_483_646, "Largest representable fine works");
        check(member.getBorrowedCount() == 0, "All loans cleared");
        service.removeBook(1);
        expectError(() -> service.issueBook(1, member.getId()));
    }

    private static void console() throws Exception {
        String workflow = runConsole("oops\n2147483648\n1\nNew Book\nNew Author\n2\nNew Reader\n"
                + "3\n4\n5\nnew book\n6\n4\n3\n7\n4\n-1\n7\n4\n15\n8\n4\n0\n");
        for (String expected : new String[]{"Valid number daalo.", "Book added, ID = 4",
                "Member added, ID = 3", "New Book", "New Reader", "Book issue ho gayi",
                "Error: Days negative", "Late fine: Rs 2", "Book remove ho gayi.", "Goodbye!"}) {
            check(workflow.contains(expected), "Console workflow: " + expected);
        }
        // End input at the menu and at every operation's prompt, including after a retry.
        for (String input : new String[]{"", "oops\n", "1\n", "1\nTitle\n", "2\n", "5\n",
                "6\n", "6\n1\n", "7\n", "7\n1\n", "8\n"}) {
            check(runConsole(input).contains("Goodbye!"), "EOF exits gracefully: " + input.replace('\n', '/'));
        }
    }

    private static String runConsole(String input) throws Exception {
        String java = Path.of(System.getProperty("java.home"), "bin", "java").toString();
        Process process = new ProcessBuilder(java, "-cp", System.getProperty("java.class.path"), "Main")
                .redirectErrorStream(true).start();
        try {
            try (var stdin = process.getOutputStream()) {
                stdin.write(input.getBytes(StandardCharsets.UTF_8));
            }
            if (!process.waitFor(5, TimeUnit.SECONDS)) {
                throw new AssertionError("Console did not terminate");
            }
            String output = new String(process.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
            check(process.exitValue() == 0 && !output.contains("Exception"), "Console exits without exception");
            return output;
        } finally {
            if (process.isAlive()) process.destroyForcibly();
        }
    }

    private static void expectError(CheckedAction action) throws Exception {
        try {
            action.run();
        } catch (LibraryException expected) {
            checks++;
            return;
        }
        throw new AssertionError("Expected LibraryException");
    }

    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
        checks++;
    }

    @FunctionalInterface
    private interface CheckedAction {
        void run() throws Exception;
    }
}
