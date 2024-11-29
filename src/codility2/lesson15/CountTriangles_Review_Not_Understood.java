package codility2.lesson15;

import java.util.Arrays;

public class CountTriangles_Review_Not_Understood {

    public static void main(String[] args) {
        int[] A = {10, 2, 5, 1, 8, 12};
        System.out.println("result = " + solution(A));
    }

    //{10, 2, 5, 1, 8, 12};
    public static int solution(int[] A){
        int triangles=0;
        //int catFront=0;
        Arrays.sort(A);
        for (int catBack=0; catBack< A.length-2; catBack++) {
            int catFront = catBack + 2;
                for (int m = catBack + 1; m < A.length - 1; m++) {
                    System.out.println("===== starting catFront ====" + catFront + " :middle = " + m);
                    while (catFront<A.length && A[catBack] + A[m] > A[catFront]){
                        catFront++;

                    }
                    System.out.println(" ========== ending catFront = " + catFront);
                    triangles += catFront-m-1;
                    //triangles += catFront-2;
                }
        }
        return triangles;
    }
}


