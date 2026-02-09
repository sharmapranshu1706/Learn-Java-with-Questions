import java.util.Scanner;
public class calcIncomeTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Annual Income: ");
        double income = input.nextDouble();
        double tax;
        if(income <=350000){
            tax=0;
        }
        else if(income > 350000 && income <= 500000){
            tax = (income - 350000) * 0.05;
        }
        else if(income > 500000 && income <= 750000){
            tax = (income - 500000) * 0.1 + 7500;
        }
        else if(income > 750000 && income <= 1000000){
            tax = (income - 750000) * 0.15 + 32500;
        }
        else if(income > 1000000 && income <= 2000000){
            tax = (income - 1000000) * 0.2 + 70000;
        }
        else{
            tax = (income - 2000000) * 0.3 + 270000;
        }
        System.out.println("Your Income Tax is: " + tax);

    }
}
