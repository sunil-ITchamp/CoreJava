package codility2.lesson15;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    public static void main(String[] args) {
            int[] A1 = {1,4,-3};
            int[] A2 = {-8,4,5,-10,3};
            //System.out.println("result = " + solution(A1));
            System.out.println("result = " + solution(A2));
    }

    public static int solution(int[] A){
        Arrays.sort(A);
        Arrays.stream(A).forEach(System.out::print);
        System.out.println("");
        int tail =0;
        int head = A.length-1;
        int minAbsSum = Integer.MAX_VALUE;

        // -3, 1 ,4
//                   -3+4 = 1
//                   -3+1 = 2
//                   1+1
        while ( tail <= head){
            System.out.println("tail = " + tail + " :head =" + head + " :abs " + Math.abs ( A[tail] + A[head] )) ;
            minAbsSum = Math.min (minAbsSum, Math.abs ( A[tail] + A[head] ) );
            if (A[tail] + A[head] > 0) head--;
            else
                tail++;
        }
        return  minAbsSum;
    }
}
