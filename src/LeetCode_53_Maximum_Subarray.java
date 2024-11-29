public class LeetCode_53_Maximum_Subarray {

    public static void main(String[] args) {
        int[] sourceArray={1,2,3,4,5};
        int[] sourceArray2={-2,1,-3,4};
        //,-1,2,1,-5,4};
        int[] sourceArray3={1};
        int[] sourceArray4={5,4,-1,7,8};
        int[] sourceArray5={5,-4,8,-10,-2,4,-3,2,7,-8,3,-5,3};

        //To TEST Kadane for Maxprofit
        int[] sourceArray6 = {1,2,3,4,5};
        int[] sourceArray7 = {23171,21011,21123,21366,21013,21367};
        int[] sourceArray8 = {7,1,5,3,6,4};
        int[] sourceArray9 = {7,6,4,3,1};
        int[] prices3 = {8, 5, 2, 3, 9, 7, 1};

        //System.out.println(bruteForce(sourceArray));
        int[] sourceArr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] sourceArr2 = {-2,1,4,-5,1,3,-2};
        int[] sourceArr3 = {5,4,-1,7,8};
        System.out.println(new LeetCode_53_Maximum_Subarray().solution_20_nov(sourceArr2));

    }

    public static int kadaneAlgo(int[] sourceArray){
        int currentSum=0;
        int maxSum=0;

        for (int i =0; i < sourceArray.length; i++){
            currentSum += sourceArray[i];
            if (currentSum<0)
                currentSum=0;
            maxSum = Math.max(maxSum, currentSum);
            System.out.println(i + " index = " + sourceArray[i] + " -maxSum=" + maxSum + " - currentSum:" + currentSum);
        }
        return maxSum;
    }

    public static int bruteForce(int[] sourceArray){
    int sum =0;
    int maxSum = 0;
        for (int start=0; start<sourceArray.length;start++){
            for (int end=start; end < sourceArray.length ; end++){
                for (int i=start; i<=end; i++){
                    System.out.print(sourceArray[i]);
                    sum += sourceArray[i];
                }
                System.out.print(" - ");
                maxSum = Math.max(sum, maxSum);
                sum=0;
            }
            System.out.println("\n");

        }
        return maxSum;
    }

    public static int kadaneAlgoForMaxPROFIT(int[] arr){
        int currentSum=0;
        int maxSum=0;

        //Major difference with NORM kadane algo impl is loop starts with 1 (ONE)
        for (int i =1; i < arr.length; i++){
            int d = arr[i]-arr[i-1];
            currentSum = Math.max(d, currentSum+d);
            maxSum = Math.max(maxSum, currentSum);
            System.out.println(i + " value= " + arr[i] + " d ="+ d + " -maxSum=" + maxSum + " - currentSum:" + currentSum);
        }
        return maxSum;
        }





















        public int solution_20_nov(int[] arr){

            int maxSubArrayResult = 0;
            int currentSum =0;
            if (arr.length==1) return 1;
            for (int i=0;i<arr.length;i++) {
                currentSum += arr[i];
                if (currentSum < 0) {
                    currentSum = 0;
                    System.out.print(" -- updated currentSum =  " + currentSum);
                }
                maxSubArrayResult = Math.max(maxSubArrayResult, currentSum);
                System.out.println("i = " + i + " : " + arr[i] + " : max = " + maxSubArrayResult);
            }
        return maxSubArrayResult;
        }

}
