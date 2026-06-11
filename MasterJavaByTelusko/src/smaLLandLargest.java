public class smaLLandLargest {
    public static void SmallLargest(int[] numbers) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num < minNum) {
                minNum = num;
            }
            if(num>maxNum){
                maxNum=num;
            }
        }
        System.out.println("Smallest number is: " + minNum);
        System.out.println("Largest number is: " + maxNum);
    }
    public static void main(String[] a) {
        int[] numbers = { 2, 4, 3, 7, 5 };
        SmallLargest(numbers);
    }
}
