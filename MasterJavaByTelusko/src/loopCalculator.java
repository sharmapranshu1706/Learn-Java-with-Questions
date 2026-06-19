import java.util.Scanner;
public class loopCalculator {
    public static void main(String[]args){
        double num1=7;
        double num2;
        char operator;
        double result;
        String again="y";
        while(again.equals("y")){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the second number:");
            operator=sc.next().charAt(0);
            System.out.println("Enter the first number:");
            num2=sc.nextInt();
            if(operator=='+'){
                result=num1+num2;
                System.out.println("Result"+result);
            }
            else if(operator=='-'){
                result=num1-num2;
                System.out.println("Result"+result);
            }
            else if (operator=='*'){
                result=num1*num2;
                System.out.println("Result"+result);
            }
            else if(operator=='/'){
                if(num2==0){
                    System.out.println("Cannot divide by zero.");
                }
                else{
                    result=num1/num2;
                    System.out.println("Result"+result);
                }
            }
            else {
                System.out.println("Invalid operator.");
            }
            System.out.println("Do you want to perform another calculation? (y/n)");
            again=sc.next();

        }
        System.out.println("Thank you for using the calculator.");
    }
}
