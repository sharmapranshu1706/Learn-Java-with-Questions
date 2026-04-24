public class subArrSumII {
    public static void maxArrSumII(int[] numbers){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int[] prefix =new int [numbers.length];
        prefix[0] = numbers[0];
        for(int i =1; i< numbers.length; i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int start=0;start< numbers.length;start++){
            for(int end=start; end< numbers.length; end++){
                currSum= start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum<currSum){
                    maxSum =currSum;
                }
            }
        }
        System.out.println("Max sum of sub array is: "+maxSum);
    }
    public static void main(String[] args) {
        int[] numbers ={1,-2,6,-1,3};
        maxArrSumII(numbers);
    }
}
