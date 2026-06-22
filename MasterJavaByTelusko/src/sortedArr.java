import java.util.Arrays;
public class sortedArr {
    public static void main(String[] a){
        int[] aRR={2,4,5,3,7,6};
        System.out.print("Before Sorting: ");
        for (int i : aRR) {
            System.out.print(i + " ");
        }
        Arrays.sort(aRR);
        System.out.print("| After Sorting: ");
        for (int i : aRR) {
            System.out.print(i + " ");
        }
    }
}
