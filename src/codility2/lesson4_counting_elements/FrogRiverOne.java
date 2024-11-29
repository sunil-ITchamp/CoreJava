package codility2.lesson4_counting_elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) throws InterruptedException {
        int[] A1 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A2 = {1, 1, 1};
        int[] A3 = {1, 2, 1}; //
        int[] A4 = {2,4,3,3,4,5,5,1};
        System.out.println(solutionBasedOnArray(5, A1)); //5th position is filled in 6 sec
        System.out.println(solutionBasedOnArray(1, A2)); //1st position is filled in 0 sec
        System.out.println(solutionBasedOnArray(3, A3)); //3rd leaf is never filled
        System.out.println(solutionBasedOnArray(5, A4)); //last leaf 1 is filled in 7 sec
    }


    //solution based on Set
    public static int solutionBasedOnHashSet(int X, int[] A) throws InterruptedException {
        Set<Integer> filled = new HashSet<>();
        filled.add(100);
        System.out.println(filled);

        int timeCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (!filled.contains(Integer.valueOf(A[i]))) {
                filled.add(Integer.valueOf(A[i]));
                X--;
                System.out.println("i = " + i + " X= " + X);
            }
            if (X == 0)
                return i;
            Thread.sleep(1000);
        }
        return -1;
    }


    //solution based on Array
    public static int solutionBasedOnArray(int X, int[] A) {
        boolean[] filled = new boolean[X + 1];
        Arrays.fill(filled, false);

        for (int i = 0; i < A.length; i++) {
            int position = A[i];

            if (!filled[position]) {
                filled[position] = true;
                X--;
            }

            if (X == 0)
                return i;

        }
        return -1;
    }
}
