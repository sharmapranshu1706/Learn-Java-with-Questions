
public class loopCalculator {
    public static void main(String[]args){
        double num1=7;
        double num2=3;
        char operator='*';
        double result=0;
        String again="y";
        while(again.equals("y")){
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
             again="n";

        }
        System.out.println("Thank you for using the calculator.");
    }
}
