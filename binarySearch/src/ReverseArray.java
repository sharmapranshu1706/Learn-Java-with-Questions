public class ReverseArray {
    public static void reverseArray(int []arr){
        int first =0, last=arr.length -1;
        while(first<last){
            int temp= arr[last];
            arr[last]=arr[first];
            arr[first] =temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int []arr = {4,6,8,10,12};
        reverseArray(arr);
        for(int num : arr){
            System.out.print( "  " + num);
}
        System.out.println();
    }
}
