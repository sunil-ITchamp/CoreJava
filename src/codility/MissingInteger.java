package codility;

import java.util.Arrays;

//class Solution { public int solution(int[] A); }
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//Given A = [1, 2, 3], the function should return 4.
//Given A = [−1, −3], the function should return 1.
//Write an efficient algorithm for the following assumptions:
//        * N is an integer within the range [1..100,000];
//        * each element of array A is an integer within the range [−1,000,000..1,000,000].


public class MissingInteger {

    public static void main(String[] args) {
        //int[] A1={1, 3, 6, 4, 1, 2};

//        int[] A1={ 2, 3,4};
//        int[] A1={-1, -3};
//        int[] A1={1,2,3, 7, 6, 5, 4};
        int[] A1={-1,1,2,3,7,6,5,4,8};
//
        System.out.println(new MissingInteger().solution(A1));
    }

    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);

//        if (A[A.length-1] < 0)
//            return 1;

        int smallest =1;
        for (int i=0;i < A.length; i++){
            System.out.println(i + "th element = " + A[i] + " AND smallest " + smallest);
            if (A[i]==smallest)
                smallest++;
        }
        return smallest;
    }
}
