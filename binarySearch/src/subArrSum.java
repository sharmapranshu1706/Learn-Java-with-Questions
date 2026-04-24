//Brute Force Approach
// Time Complexity: O(n^3) because of three nested loops
//Space Complexity: O(1) because we are not using any extra space

public class subArrSum {
    public static void maxSubArrSum(int [] numbers){
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length; i++){
            for(int j=i; j< numbers.length; j++){
                int currSum = 0;
                for(int k=i; k<= j; k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum is "+maxSum);
    }
    public static void main(String [] args){
        int [] numbers= {2,-4,-5,6,8,-10};
        maxSubArrSum(numbers);
    }
}
