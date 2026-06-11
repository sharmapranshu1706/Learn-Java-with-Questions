public class mostWaterContainer {
    public static int totalArea(int[] height){
        int maxArea=0;
        int width;
        //Brute Force Approach
        for(int i=0; i<height.length;i++){
            for(int j=i+1;j< height.length;j++){
                width=(j-i)*Math.min(height[i],height[j]);
                maxArea=Math.max(maxArea,width);
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.print(totalArea(height));
    }
}
