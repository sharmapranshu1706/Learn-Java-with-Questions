interface UpiPayment {
    void qr();
    void accountDetails();
    void personNumber();
}
interface CardPayment{
    void cardDetails();
}
interface NetBanking{
    void userDetails();
}
class Pay implements UpiPayment, CardPayment, NetBanking {
    @Override
    public void qr() {
        System.out.println("Upi via QR");
    }

    @Override
    public void accountDetails() {
        System.out.println("Payment via Bank Account Number");
    }

    @Override
    public void personNumber() {
        System.out.println("Upi Payement via Number");
    }

    @Override
    public void cardDetails() {
        System.out.println("Payment via Credit / Debit card");
    }

    @Override
    public void userDetails() {
        System.out.println("Payment via Net Banking");
    }
}

    public class Payment {
        public static void main(String[] args) {
            UpiPayment upi = new Pay();
            CardPayment cardPayment = new Pay();
            NetBanking netBanking = new Pay();

            upi.accountDetails();
            upi.personNumber();
            upi.qr();

            cardPayment.cardDetails();
            netBanking.userDetails();
        }
    }
