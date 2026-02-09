import java.util.Scanner;

public class Main {
    public static void fullPyramid(int n) {

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }

            // Print same number in a row
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fullPyramid(n);
        sc.close();
    }
}

