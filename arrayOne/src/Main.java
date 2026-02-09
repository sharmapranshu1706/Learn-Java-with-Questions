import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] marks = new int[10];
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] moreNumbers = {11, 12, 13, 14, 15};
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
    }
}
