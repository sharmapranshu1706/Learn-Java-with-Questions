public class ThreeDimensionsArray {
    public static void main(String[]a){
        int[][][] nums=new int[5][2][3];
//        -------------------------
        //First Dimension Rows
        //Second Dimension Columns
        //Third Dimension Depth
        for(int i=0;i<nums.length;i++){
            System.out.println("Dimension"+ i);
            for(int j=0;j<nums[i].length;j++){
                for(int k=0;k<nums[i][j].length;k++){
                    nums[i][j][k]=i+j+k;
                    System.out.print(nums[i][j][k]+ " ");
                }
                System.out.println();
            }
        }
        
    }
}
