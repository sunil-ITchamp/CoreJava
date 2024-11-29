package codility;

import java.util.Arrays;

public class PalindromeRelatedPuzzle {

    public static void main(String[] args) {
        System.out.println(" \n Result = " + new PalindromeRelatedPuzzle().solutionNew_20_Nov(7,3));
    }
    public String solutionNew_20_Nov(int N, int K) {
        StringBuilder palindrome = new StringBuilder();
        char[] letters = new char[K];

        for (int i = 0; i < K; i++) {
            letters[i] = (char) ('a' + i);
        }

        for (int i =0;i<letters.length;i++)
            System.out.print(letters[i]);

        int mid = N / 2;

        System.out.println(" \n Mid = " + mid);
        System.out.println(" ----------- First half -----------   ");
        for (int i = 0; i < mid; i++) {
            System.out.print(" :: i = " + i);
            palindrome.append(letters[i % K]);
        }

        //Check if N = size is odd number, then add an element in mid
        if (N%2 == 1)
        palindrome.append(letters[K - 1]);

        System.out.println(" \n ----------- Second half -----------   ");
        for (int i = mid-1 ; i >= 0 ; i--) {
            System.out.print(" ::i = " + i + " [i % K] =" + (i % K) );
            palindrome.append(letters[i % K]);
        }

        return palindrome.toString();
    }
}

