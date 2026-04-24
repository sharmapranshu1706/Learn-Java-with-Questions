import java.util.Scanner;
public class ternarySecond {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = number.nextInt();
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + type);
    }
}
