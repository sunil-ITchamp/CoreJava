package codility2.lesson6;
import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] A1 = {-3,1,2,-2,5,6};
        int[] A2 = {-3,-1,2,-2,5,6,3,4};
        int[] A3 = {-3,-1,-2,-2,4,4};
        int[] A4 = {-3,-1,-2,-4,5,6};
        System.out.println("\n Result = " + solution(A1));
    }

    public static int solution(int[] A){
        int result=0;
        Arrays.sort(A);
        Arrays.stream(A).forEach(System.out::print);
        int N = A.length;
        result = Math.max( (A[N-1]*A[0]*A[1]), (A[N-1]*A[N-2]*A[N-3]));
        return result;
    }
}
