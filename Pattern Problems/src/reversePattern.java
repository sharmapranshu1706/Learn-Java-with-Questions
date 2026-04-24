import java.util.Scanner;
public class reversePattern {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter a Random Number: ");
        int number = getInput.nextInt();

        for (int i=number; i>=0; i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
