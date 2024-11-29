package codility2.lesson8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EquiLeader {
    public static void main(String[] args) {
        int[] A1={4,3,4,4,4,2};
        System.out.println("Result of Equi-leader = "+ solution(A1));
    }

    public static int solution(int[] A){
        int consecutiveElement=0;
        int candidate=0;

        for (int i=0;i<A.length;i++){
            if (consecutiveElement==0){
                candidate=A[i];
                consecutiveElement++;
            }
            else if (A[i] == candidate){
                consecutiveElement++;
            }
            else
                consecutiveElement--;
        }
        System.out.println(" candidate = " + candidate);

        //2nd part of LOGIC - find occurences or n
        final int leader = candidate; //needed to run filter in Stream
        int n =0;
        n = Arrays.stream(A).filter(i-> i==leader).boxed().collect(Collectors.toList()).size();
        System.out.println(" Leader occurrences = " + n);

        //3rd part of LOGIC
        int c =0, equiLeader =0;
        for (int i=0; i<A.length ;i++) {
            if (A[i] == candidate) c++; // c is no of occurences of Leader until i
            if ( i+1<2*c &&  A.length - i -1 < 2 * (n-c) ) equiLeader++;
        }
        return equiLeader;
    }

}
