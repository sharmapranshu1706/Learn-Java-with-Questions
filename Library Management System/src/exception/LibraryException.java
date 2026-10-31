package exception;

import java.io.Serial;

// Custom checked exception
public class LibraryException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public LibraryException(String message) {
        super(message);
    }
}
