package codility;

//Same as Maximum SubArray Problem
public class Lesson9_Maximum_Slice_Sum {
    public static void main(String[] args) {
        int[] A = {3,2,-6,4,0};
        int[] A2 = {3,2,-6,4,-9,9,2,-13};
        int[] A3 = {3,2,-6,4,1,3};
        int[] A4 = {3,2,-6,4,-2,8};
        int[] A5 = {-1,-2,-1,2};
        int[] A6 = {7,-8,4,-1,6,-2,3,-6,5}; //sum (4,-1,6,-2,3) = 10
        int[] A7 = {5,-7,3,5,-2,4,-1}; // sum (3,5,-2,4) = 10
        System.out.println(solution(A));
//        System.out.println(solution(A2));
//        System.out.println(solution(A3));
//        System.out.println(solution(A4));
//        System.out.println(solution(A6));
//        System.out.println(" A7 = " + solution(A7));

    }

    public static int solution(int[] A){
        int maxSum=0;
        int currentSum=0;
        for (int i=0;i<A.length;i++){
            currentSum = currentSum + A[i];
            if (currentSum<0)
                currentSum=0;
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }


}
