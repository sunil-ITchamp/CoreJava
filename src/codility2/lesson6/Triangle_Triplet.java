package codility2.lesson6;

import java.util.Arrays;
//SORT
//check A[i] + A[i+1] > A[i+2]
// OR
// check A[i] =  A[i+2] - A[i+1]
public class Triangle_Triplet {

    public static void main(String[] args) {
        int[] A1={10,2,5,1,8,20};
        int[] A2={10,50,5,1};
        int[] A3={-3,-2,-1};
        int[] A4={1,2,3};
        System.out.println("\n Result of check if exists a Triangular Triplet  = " + solution(A1));
    }

    public static int solution(int[] A){
        if (A.length<3)
            return 0;
        Arrays.sort(A);
        Arrays.stream(A).forEach(System.out::print);
        for (int i=0;i<A.length-2;i++){
            if (A[i]+A[i+1] > A[i+2])
                return 1;
        }
        return 0;
    }

    public static int solution2(int[] A){
        if (A.length<3)
            return 0;
        Arrays.sort(A);

        for (int i=0;i<A.length-2;i++){
            if (A[i] > A[i+2]-A[i+1])
                return 1;
        }
        return 0;
    }
}
