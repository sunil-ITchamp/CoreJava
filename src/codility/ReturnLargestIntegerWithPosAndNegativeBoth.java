package codility;

import java.util.Arrays;

public class ReturnLargestIntegerWithPosAndNegativeBoth {

    public static void main(String[] args) {
        int[] A = {4,3,2,-2,5,-3,-4};
        int[] A2 = {-7,-8,0,1,4,3,2,5,6,7};
        System.out.println(new ReturnLargestIntegerWithPosAndNegativeBoth().solution(A2));
    }


    public int solution(int[] A) {
        int notFound = 0;
        Arrays.sort(A);
        Arrays.stream(A).forEach(System.out::print);
        System.out.println(" _________________  ");
        if (A[0]>=0)
                return notFound;

        for (int i=0;i<A.length-1;i++){
            for (int j=i+1;j<A.length;j++)
                if (Math.abs(A[i]) == A[j])
                    return A[j];
        }
        return notFound;

    }
}