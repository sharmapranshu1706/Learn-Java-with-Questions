public class jaggedArray {
    public static void main(String[]a){
        //Initialize a columns and No.of elements as Per Requirement
        int[] [] nums= new int[3][];
        nums[0]= new int[3];
        nums[1]=new int [4];
        nums[2]=new int [5];
        for(int i=0;i<nums.length;i++) {
            //nums[i]=is used for map a length of [0] Index is[3]
            for (int j = 0; j < nums[i].length; j++) {
                    nums[i][j] = (int) (Math.random() * 10);
                }
            }
        //Enhance loop is used for printing the values
        for(int[] m:nums){
            for (int n:m){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        }
    }
