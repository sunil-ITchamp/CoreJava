package codility2;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A1={3,8,9,7,6};
        int[] A2={0,0,0};
        int[] A3={1,2,3,4};

        int[] result = new CyclicRotation().solution(A3, 4);
        Arrays.stream(result).forEach(System.out::print);
    }
    public int[] solution(int[] A, int K){
        int size = A.length;
        int[] result= new int[A.length];
        for (int i=0;i<A.length;i++){
            result[(i+K)%size] = A[i];
        }
        return result;
    }

}
