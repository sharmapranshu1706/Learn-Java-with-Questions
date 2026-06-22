import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args){
        int[] marks =new int[3];
        System.out.print("Enter marks of Physics, Chemistry and Maths:");
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics marks:" + marks[0]);
        System.out.println("Chemistry marks:" + marks[1]);
        System.out.println("Maths marks:" + marks[2]);
        int maxMarks = 100;
        float Percentage = (float)(marks[0] + marks[1] + marks[2]) / (marks.length * maxMarks) * 100;
        System.out.println("Percentage:" + Percentage + "%");
    }
}
