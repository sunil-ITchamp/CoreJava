package codility2.lesson5_prefix_sums;

//Concept
//Always smaller slices will return MINIMAL avg
// ======= Samples ============
// slice {0,1} = 4 + 2 /2  = 3
// slice {1,2} = 2 + 2 /2  = 2
// slice {1,4} = 2+2+5+1/4 = 2.5
// slice {0,4} = 4+2+2+5+1 = 2.8

import java.sql.SQLOutput;

//Logic to take avg of slices upto N-2 elements i.e. A.length-2
public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] A1 = {4,2,2,5,1,5,8};
        int[] A2 = {1,1,2,2,3,3};

        System.out.println("Result =" +  solution(A1));
    }

    public static int solution(int[] A){
        double maxAvg = Double.MAX_VALUE;
        int minIndex =0;

        for (int i=0;i<A.length-2;i++) {
            double avg1 = (double) (A[i] + A[i + 1]) / 2;
            double avg2 = (double) (A[i] + A[i + 1] + A[i + 2]) / 3;
            if (maxAvg > avg1 || maxAvg > avg2) {
                maxAvg = Math.min(avg1, avg2);
                minIndex = i;
            }
        }
        //Edge case - The Last 2 elements are NOT checked by above loop
        //As the loop runs until A.length-2
        // Chck the avg for last 2 indexes A.length-2 and A.length-1
            if ( maxAvg > (A[A.length-1] + A[A.length-2])/2 )
                return A.length-2;

        return minIndex;

    }
}
