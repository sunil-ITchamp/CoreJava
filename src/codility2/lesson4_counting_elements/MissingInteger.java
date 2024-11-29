package codility2.lesson4_counting_elements;

import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {
        int[] A1={1, 3, 6, 4, 1, 2};
        int[] A2={1, 3, 4, 1, 2,5,7,5,4,4,4,4,4};
        int[] A3={1, 1,1,1,1,2,2,2,3,3,3,3,3,3,3, 5, 4, 1, 2,6,7,9};
        int[] A4={1,2,3};
        int[] A5={-1,-3};
        System.out.println(" Result = "+ solution(A3));
    }
    public static int solution(int[] A){
        Arrays.sort(A);
            if (A[0] < 0) return 1;
            else {
                int missing = 1;
                for (int i=0;i<A.length;i++){
                    System.out.println("i= " + i + " A[i]= " + A[i] + " - missing = " + missing);
                    if (A[i] == missing){
                        missing++;
                    }
                }
                return missing;
            }
    }
}
