public class smallestNum {
    public static int smallNum(int[] numbers) {
        int minNum = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (i< minNum) {
                minNum = i;
            }
        }
        return minNum;
    }

    public static void main(String[] a) {
        int[] numbers = {2, 4, 3, 7, 5};
        System.out.println("Smallest No. is: "+smallNum(numbers));
    }
}
