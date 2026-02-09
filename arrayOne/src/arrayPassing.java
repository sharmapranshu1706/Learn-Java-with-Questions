
public class arrayPassing {
    public static void arrayModify(int[]numbers){
        for(int i=0; i<numbers.length; i++){
            numbers[i] = numbers[i] + 2;
        }
    }
    public static void main(String[] args) {
        int[]numbers = {35, 45, 55, 65, 75};
        arrayModify(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();
    }
}
