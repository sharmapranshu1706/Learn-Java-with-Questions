interface PayAble {
    double pay(double amount);
}
enum PaymentMode implements PayAble{
    UPI{public double pay(double amount) {return amount;}},
    CARD{public double pay(double amount){ return amount+ amount *0.12;}},
    COD{public double pay(double amount){return  amount +50;}};
}
public class EnumWithInterface{
    public static void main(String[] args){
        System.out.println(PaymentMode.CARD.pay(1000));
    }
}
