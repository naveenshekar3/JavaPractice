package javaPrograms;

public class TrappingRainWater {

    public static int trap(int[] heights){
        int left=0, right= heights.length-1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left<right){
            if (heights[left]<heights[right]){
                if (heights[left]>=leftMax)
                    leftMax = heights[left];
                else water+= leftMax - heights[left];
                left++;
            }else {
                if (heights[right]>=rightMax)
                    rightMax = heights[right];
                else water+= rightMax - heights[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        // Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        //Output: 6
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(heights));
    }
}
