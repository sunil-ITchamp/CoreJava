package codility2.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        int[]A1 = new int[0];
        int[] A2 = {2,1,1,2,3,1};
        int[] A3 = {5,5,2,1,1,2,3,1,4,4,5};
//        System.out.println( "Result = " + solution(A1));
//        System.out.println( "Result = " + solution(A2));
//        System.out.println( "Result = " + solution(A3));
        //2nd Approach
        System.out.println( "Result = " + solutionWithStream(A1));
        System.out.println( "Result = " + solutionWithStream(A2));
        System.out.println( "Result = " + solutionWithStream(A3));
    }
    public static int solution(int[] A){
        if (A.length==0) return -1;
        Arrays.sort(A);
        Collections.sort(new ArrayList<Integer>());
        Arrays.stream(A).forEach(System.out::print);
        int result=1;
        for(int i=0;i<A.length-1;i++){
            if (A[i] != A[i+1])
                result++;
        }

        return result;
    }

    public static int solutionWithStream(int[] A){
       Long  count = (Arrays.stream(A).boxed().collect(Collectors.toSet())).stream().count();
       return count.intValue();
    }
}
