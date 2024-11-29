package codility2.lesson5_prefix_sums;

import java.util.Arrays;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        String str = "CAGCCTA";
        int[] P = {2,5,0,4};
        int[] Q = {4,5,6,5};
//        int[] finalResult = bruteForceSolution(str, P,Q);
//        System.out.println(" FINAL - result : ");
//        Arrays.stream(finalResult).forEach(System.out::print);
        solution(str,P,Q);
    }

    public static int[] bruteForceSolution(String S, int[] P, int[] Q) {
        int[] impactFactor = new int[S.length()];
        int[] result= new int[P.length];

        for (int i=0;i<S.length();i++){
            if (S.charAt(i) == 'A') impactFactor[i]=1;
            if (S.charAt(i) == 'C') impactFactor[i]=2;
            if (S.charAt(i) == 'G') impactFactor[i]=3;
            if (S.charAt(i) == 'T') impactFactor[i]=4;
        }

        System.out.println(" ======== ImpactFactor ============ ");
        Arrays.stream(impactFactor).forEach(System.out::print);

        for (int j=0;j<P.length;j++){
            int start = P[j];
            int end = Q[j];
            result[j] = Math.min(impactFactor[start],impactFactor[end]);
         }
        return result;
    }

    public static int[] solution(String S, int[] P, int[] Q){
            int[] result = new int[P.length];

            int[] A = new int[S.length()];
            int[] C = new int[S.length()];
            int[] G = new int[S.length()];
            int[] T = new int[S.length()];

            // variable to hold cumulative count of chars - A, C, G and T
            int a=0, c=0, g=0, t=0;

            for (int i=0;i<S.length();i++){

                if (S.charAt(i) == 'A') a++;
                if (S.charAt(i) == 'C') c++;
                if (S.charAt(i) == 'G') g++;
                if (S.charAt(i) == 'T') t++;

                A[i] = a;
                C[i] = c;
                G[i] = g;
                T[i] = t;
            }

            // Loop through the sample range
            for (int i=0;i<P.length;i++){

                //edge case when start and end is same index
                if (P[i] == Q[i]){
                    if (S.charAt(P[i]) == 'A') result[i]=1;
                    if (S.charAt(P[i]) == 'C') result[i]=2;
                    if (S.charAt(P[i]) == 'G') result[i]=3;
                    if (S.charAt(P[i]) == 'T') result[i]=4;
                }
                // first check the range in P,C,G,T arrays having prefix sums OR if the 1st element in given String is
                else if ( (A[P[i]] < A[Q[i]]) || S.charAt(P[i])=='A') result[i]=1;
                else if ( (C[P[i]] < C[Q[i]]) || S.charAt(P[i])=='C') result[i]=2;
                else if ( (G[P[i]] < G[Q[i]]) || S.charAt(P[i])=='G') result[i]=3;
                else if ( (T[P[i]] < T[Q[i]]) || S.charAt(P[i])=='T') result[i]=4;
            }
            System.out.println(" Final Result from Optimized solution");
            Arrays.stream(result).forEach(System.out::print);
            return result;
    }
}

