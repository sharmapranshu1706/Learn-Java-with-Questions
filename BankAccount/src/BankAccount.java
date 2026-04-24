public class BankAccount {
    private String owner;
    private double balance;

    public static int deposit(double balance, double amount) {
        balance += amount;
        return (int) balance;
    }
}
