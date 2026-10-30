package model;

public class Member {
    private static final int MAX_BOOKS = 3;

    private int id;
    private String name;
    private int[] borrowedBookIds = new int[MAX_BOOKS];
    private int borrowedCount = 0;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getBorrowedCount() { return borrowedCount; }
    public static int getMaxBooks() { return MAX_BOOKS; }

    public boolean canBorrow() {
        return borrowedCount < MAX_BOOKS;
    }

    public void addBook(int bookId) {
        borrowedBookIds[borrowedCount] = bookId;
        borrowedCount++;
    }

    public void removeBook(int bookId) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBookIds[i] == bookId) {
                // baaki elements ko left shift karo
                for (int j = i; j < borrowedCount - 1; j++) {
                    borrowedBookIds[j] = borrowedBookIds[j + 1];
                }
                borrowedCount--;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%-4d %-20s Books borrowed: %d", id, name, borrowedCount);
    }
}
