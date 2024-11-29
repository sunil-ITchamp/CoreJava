package codility2.lesson15;

import java.util.Arrays;

public class CountDistinctSlices_ReviewOnce {
    public static void main(String[] args) {
        int[] A1={3,4,5,5,2};
        int[] A2={2,4,1,7,4,9,7,3,5,5,8,7,1};

        System.out.println("result = " + solution(5,A1));
        System.out.println("result = " + solution(9,A2));
    }

    public static int solution(int M, int[] A){
        //Array to mark duplicates OR element which are procesed as slices should be UNIQUE/DISTINCT
        boolean[] seen = new boolean[M+1];
        Arrays.fill(seen, false);

        int countOfDistinctSlices = 0; // result of the function

        int head =0;

        //pointer for TAIL
        for (int tail=0;tail<A.length-1;tail++) {

            //pointer for HEAD
            while (head < A.length && !seen[A[head]]){ // !seen[ A[head] ] == This element is NOT procesed as part of curretn slice
                countOfDistinctSlices += (head-tail)+1;
                seen[ A[head] ] = true;
                head+=1;        //IMPORTANT
                //edge case
                if (countOfDistinctSlices > 1000000000) return 1000000000;
            }
            // Using FOR loop - tail counter will move, hence this element can be used for fresh slice
            seen[ A[tail] ] = false;
        }

        return countOfDistinctSlices;
    }
}
