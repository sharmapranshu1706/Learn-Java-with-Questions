public class ArrayQuestions {
    public static void main(String[] args){
        int[] numbers={45,22,89,16,90,33};
        int smallest=numbers[0];
        int largest= numbers[0];
        for(int num:numbers){
            //For-Each loop Traverse in numbers[] to check the smallest digit less than [0]
            if(num<smallest){
                smallest=num;
            }
            if(num>largest){
                largest=num;
            }
        }
        System.out.println("smallest: " + smallest);
        System.out.println("largest: " + largest);
    }
}