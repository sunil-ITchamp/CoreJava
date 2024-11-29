package codility2.lesson5_prefix_sums;

import java.util.Arrays;

public class PassingCars {
    public static void main(String[] args) {
        int[] A ={0,1,0,1,1};
        int[] A2={0,1,0,1,0,1};
        System.out.println("\nResult = " + solution(A));
    }

    public static int solution(int[] A){
        int counterOfPairsOfPassingCars=0;
        int[] suffix_sums=new int[A.length+1];
        suffix_sums[A.length]=0;
        for(int i=A.length-1;i>=0;i--){
            suffix_sums[i] = suffix_sums[i+1] + A[i];
        }
        //to print the value of suffix_sums
        Arrays.stream(suffix_sums).forEach(System.out::print);
        for(int i=A.length-1;i>=0;i--){
            if (A[i] == 0) counterOfPairsOfPassingCars += suffix_sums[i];
            if (counterOfPairsOfPassingCars>1000000000) return -1;
        }
        return counterOfPairsOfPassingCars;
    }
}
