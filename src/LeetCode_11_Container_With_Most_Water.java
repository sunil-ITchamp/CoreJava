import javax.swing.*;

public class LeetCode_11_Container_With_Most_Water {

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int[] height2={1,1};
        int[] height3={4,2,6,8};
        int[] height4={1,2};
        int[] height5={4,2,6};
        System.out.println(maxArea_Optimized_20_Nov(height));
    }

    //Brute-force approach
    public static int maxArea(int[] height) {
        int width=0;
        int area=0;
        int maxWater=0;
        for (int i=0;i<= height.length-1; i++){
            for (int j=i+1;j<= height.length-1; j++){
                width = j-i;
                int h = Math.min(height[i],height[j]);
                int currentWaterArea = width * h;
                maxWater = Math.max(maxWater, currentWaterArea);
            }

        }
        return maxWater;
    }

    //Two-pointer approach
    public static int maxAreaOptimized(int[] height) {
        int width=0;
        int area=0;
        int maxWater=0;
        int lp = 0;
        int rp = height.length-1;

        while ( lp < rp){

                width = rp-lp;
                int h = Math.min(height[lp],height[rp]);
                int currentWaterArea = width * h;
                maxWater = Math.max(maxWater, currentWaterArea);
            if (lp < rp)
                    lp++;
                else
                    rp--;
            }
        return maxWater;
    }













    public static int maxArea_20_Nov(int[] height) {
        int width = 0;
        int maxArea = 0;
        int minHeight = 0;
        System.out.println("soze = " + height.length);
        for (int i = 0; i < height.length-1; i++) {
            System.out.println("Outside i = " + i);
            for (int j = i + 1; j < height.length; j++) {

                width = j - i;
                minHeight = Math.min(height[i], height[j]);
                System.out.println("width= " + width + " minHeight= "+ minHeight);
                maxArea = Math.max(maxArea, (width * minHeight));
            }
            System.out.println(i);
        }
        return maxArea;
    }

    public static int maxArea_Optimized_20_Nov(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int width=0;
        int minHeight =0;
        int maxArea = 0;
        while (lp < rp){
            minHeight = Math.min(height[lp],height[rp]);
            width=rp-lp;
            maxArea  = Math.max(maxArea, (minHeight*width));

            if (lp<rp)
                lp++;
            else
                rp--;
        }
        return maxArea;
    }







}
