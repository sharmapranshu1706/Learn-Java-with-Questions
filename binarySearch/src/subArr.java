public class subArr {
    public static void subArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                int sum =0;
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " ");
                    sum+=numbers[k];
                }
                System.out.println(" = "+ sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[] numbers = {2,4,6,8,10,12};
        subArray(numbers);
    }
}