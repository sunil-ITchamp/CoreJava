package codility;

//Same as Codility - Maximum_Slice_problem
public class LC_53_Maximum_SubArray_Problem {
    public static void main(String[] args) {

        int[] arr={7,-8,4,-1,6,-2,3,-6,5};
        int[] prices5={-1,3,-2,4,-5,6,2};

        //Just to test the max profit solution with Kadane algo
        int[] prices3_2 = {-3,-3,1,6,-2,-6};

        // apply substract to each value of prices3 - to check if kadane algo will work to give max profit
        int[] prices1_2 = {-6,4,-2,3,-2};

        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4}; //Answer 6
        int[] nums2 = {1}; //Answer 1
        int[] nums3 = {5,4,-1,7,8}; //Answer 23

        System.out.println("Result = " + solution1(nums1));
        System.out.println("Result = " + solution1(nums2));
        System.out.println("Result = " + solution1(nums3));
    }

    public static int solution1(int[] A){
    int maxSum=0;
    int currentSum=0;
        for (int i=0;i<A.length;i++){
            currentSum += A[i];
            maxSum=Math.max(maxSum,currentSum);

            if (currentSum <0 )
                currentSum=0;
            System.out.println(i + " maxSum = " + maxSum + " currentSum:" + currentSum);
        }
    return maxSum;
    }
}
