package codility2.lesson16;

import java.util.Arrays;

public class MaxNonOverlappingSegments {
    public static void main(String[] args) {
        int[] A1={1,3,7,9,9};
        int[] B1={5,6,8,9,10};
        System.out.println("Result == " + solution2(A1, B1));
    }

    public static int solution(int[] A, int[] B){
        int end_of_last_segment_processed=-1;
        int count=0;
        //IMPORTANT -step # 1
        Arrays.sort(B);
        for  (int i=0;i<A.length;i++){
            // IMPORTANT - step # 2
            // if start of current segment > end of last chosen segment
                if (A[i] > end_of_last_segment_processed){
                    count+=1;
                    end_of_last_segment_processed=B[i];
                }
        }
        return count;
    }
























    public static int solution2(int[] A, int[] B) {
        int end_of_last_segment_processed = -1;
        int count = 0;
        //IMPORTANT -step # 1
        for (int i = 0; i < A.length; i++) {

            if (A[i] > end_of_last_segment_processed) {
                count++;
                end_of_last_segment_processed = B[i];
            }

        }
        return count;
    }






}
