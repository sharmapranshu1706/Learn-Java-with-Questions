public class largeNumber {
    public static int largestNumber(int[] numbers){
        int maxNum=Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxNum) {
                maxNum = number;
            }
        }
        return maxNum;
    }
    public static void main(String[] a){
        int[] numbers={2,4,3,7,5};
        System.out.println("Largest No. is: "+largestNumber(numbers));
    }
}
