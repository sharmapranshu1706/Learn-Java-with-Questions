import java.util.Scanner;
public class arrayPassingSecond {
    public static void arrayPassing(int[]marks){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i] + 1;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int []marks = new int[4];
        System.out.println("Enter 4 marks");
        for(int i =0; i<marks.length;i++) {
            marks[i] = sc.nextInt();
        }
        arrayPassing(marks);
        for (int mark:marks ) {
            System.out.print(mark + ",");
        }
        System.out.println();
        sc.close();
    }
}
