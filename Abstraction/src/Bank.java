
abstract class Onlinebanking {
    abstract void internetBanking(String userID, String passWord);
    abstract void upiService(int amount);
}
class Banking extends Onlinebanking{

    @Override
    void internetBanking(String userID, String passWord) {
        System.out.println("User ID: "+userID);
        System.out.println("Password: "+ passWord);
    }

    @Override
    void upiService(int amount) {
        System.out.println("Amount: "+ amount);
    }
}
public class Bank {
    public static void main(String[] args) {
        Onlinebanking bank = new Banking();
        bank.internetBanking("Sharma1706", "Sharma@1706");
        bank.upiService(100000);
        }
    }
