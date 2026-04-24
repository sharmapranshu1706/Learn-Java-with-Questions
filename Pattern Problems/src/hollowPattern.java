import java.util.Scanner;

public class hollowPattern {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                if(i==1 || i==rows){
                    System.out.print("* ");
                }
                else if(j==1 || j==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
