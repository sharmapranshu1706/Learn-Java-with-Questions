import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int [] sortArr, int reqNum){
        int Start =0,end =sortArr.length-1;
        while(Start<=end){
            int mid=(Start+end)/2;
            if(sortArr[mid]==reqNum){
                return reqNum;
            }
            if(sortArr[mid]<reqNum){
                Start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] sortArr = {2,14,16,18,20,22,24,26};
        Scanner arr = new Scanner(System.in);
        System.out.print("Enter a Ur Require No. : ");
        int reqNum = arr.nextInt();
        System.out.println("Your Require No. is Available in Array : "+binarySearch(sortArr,reqNum));
        arr.close();
    }
}
