import java.util.*;
public class Main {
    public static int largestNumber(int[]numbers){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (largest < number) {
                largest = number;
            }
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("The Smallest number is " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        System.out.println("The largest number is : " + largestNumber(numbers));
    }
}