class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message){
        super(message);
    }
}
public class fourth{
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException(" Insufficient Balance! Available Balance is "+balance);
        }
        System.out.println("Withdrawal successful. Remaining balance:" + (balance-amount));
    }

    public static void main(String[] args)  {
        try {
            withdraw(1000,600);
        }catch (InsufficientBalanceException e){
            System.out.println("Error"+ e.getMessage());
        }
    }
}
