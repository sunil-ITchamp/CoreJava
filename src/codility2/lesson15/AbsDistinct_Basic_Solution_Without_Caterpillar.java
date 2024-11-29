package codility2.lesson15;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbsDistinct_Basic_Solution_Without_Caterpillar {
    public static void main(String[] args) {
        int[] A ={-5,-3,-1,0,3,6};
        int[] A2 ={-5,-3,-1,0,3,6,-6};
        int[] A3 ={-5,-3,-1,0,3,6,7,-7};
        System.out.println(" Result = " + solutionB(A3));
    }

    public static int solution(int[] A){
        int[] absA = Arrays.stream(A).map(i-> Math.abs(i)).toArray();

        Arrays.sort(absA);
        int absDistinctcount = 1;
        for (int i=0;i<absA.length-1;i++){
            if ( absA[i] != absA[i+1] ) absDistinctcount++;
        }
        return absDistinctcount;
    }

    public static int solutionB(int[] A){
        int[] absA = Arrays.stream(A).map(i-> Math.abs(i)).toArray();
        int i = Arrays.stream(absA).boxed().collect(Collectors.toSet()).size();
        System.out.println("Size = " + i);
        return i;
    }

}
