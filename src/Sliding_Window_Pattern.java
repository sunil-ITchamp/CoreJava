public class Sliding_Window_Pattern {

    private static int[] arr = {11,9,10,4,5,6,7}; //,8,9,9};




    public static void main(String[] args) {
        //System.out.println(approach1(arr, 4));

        //Dataset for leetCode_643_Maximum_Avg_Subarray
        int[] nums = {1,12,-5,-6,50,3};
        int[] nums2 = {5,2,4,4,7};
        System.out.println(leetCode_643_Maximum_Avg_Subarray(nums2,2));
    }

    public static int approach1(int[] arr, int windowSize){
        int maxSum =0;
        int windowSum=0;
        for (int i=0; i < windowSize; i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;
        System.out.println("initial maxsum or windowSum of [size = " + windowSize + "]" + " = " + maxSum);
        for (int j=windowSize;j<arr.length;j++){

            windowSum = windowSum + arr[j] - arr[j-windowSize];
            maxSum = Math.max(windowSum, maxSum);
            System.out.println("next element in window = " + j + "windowSum = " + windowSum + " BUT maxSum = " + maxSum);
        }
        return maxSum;
    }

    public static double leetCode_643_Maximum_Avg_Subarray(int[] arr, int k){
        double max_avg_wind = 0;
        double sum =0;
        for (int i=0;i<k;i++){
            sum += arr[i];
        }
        max_avg_wind = sum/k;
        System.out.println("initial avg = " + max_avg_wind);

        for (int j=k;j<arr.length;j++){
            sum+= arr[j] - arr[j-k];
            max_avg_wind = Math.max(max_avg_wind, (sum/k));
            System.out.println(" Iteration " + j + " sum = " + sum + " avg = " + (sum/k) );
        }

        return max_avg_wind;
    }

    //Leetcode problem -- 3. Longest Substring Without Repeating Characters
    public static int longest_Substring_Without_Repeating_Characters(String s){
        char[] arr = "abcabcbb".toCharArray();
        int window = 0;
        for (int i=0; i < arr.length; i++){

            if ( arr[i] != arr[i+1]){
                window += 1;
            }

        }

        return 0;
    }
}
