package codility2.lesson8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;

//Hint-1 : if Array is sorted and 2 elements/Animals are NOT same they will kill each other
//Hint-2 : Using Stream collect to Map and then sort desc by values -->> TBD
public class Dominator {
  public static void main(String[] args) {
    int[] A1 = {3, 4, 3, 2, 3, -1, 3,5,3};
    int[] A2 = {1, 2,5,5,5,5};
    System.out.println("Result of dominator = " + solutionBasedOnSorting(A2));
  }

  //This is better approach
  public static int solution1(int[] A) {
    //return index of dominator element or -1

    int consecutiveElement = 0;
    int candidate = 0;
    //Arrays.sort(A);
//    for (int item:A) {
//        if (candidate == 0) {
//          candidate = item;
//          consecutiveElement += 1;
//        } else if (item == candidate) {
//          consecutiveElement += 1;
//        } else {
//          consecutiveElement -= 1; // When 2 Items/Animals are different
//        }
//    }

    //OR above is achieved by FOR loop
    for (int i = 0; i < A.length; i++) {
      if (candidate == 0) {
        candidate = A[i];
        consecutiveElement++;
      } else if (A[i] == candidate) {
        consecutiveElement++;
      } else { // A[i] is DIFFERNT from candidate
        consecutiveElement--;
      }
    }

    int occurence = 0;
    //Return this index if condition matches or else return -1
    int index = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == candidate) {
        occurence++;
        index = i;
      }
    }

    return (occurence > A.length / 2) ? index : -1;
  }

  public static int solutionBasedOnSorting(int[] A) {
    //TBD - TO LOOK INTO THIS
    //Cannot get index of that element by below approach;
    System.out.println("original array");
    Arrays.stream(A).forEach(System.out::print);
    int[] B = A;
    Arrays.sort(B);
    System.out.println(" == sorted array ==== \n ");
    Arrays.stream(B).forEach(System.out::print);
    int counter=1;
    for (int i =0; i <B.length-1 ; i++){
      //if (B[i] != B[i-1]) counter=1;
      if( B[i] != B[i+1]) counter=1;
      else
        counter++;
      System.out.println("i = " + i + " compare " + B[i] + " with " + B[i+1] + " == COUNTER == " + counter);
      if (counter>B.length/2) {
        System.out.println(" ----- condition true --------");
        //return Arrays.binarySearch(B, B[i]);
        // As input array - A is NOT sorted, we need to run a loop
            for (int j=0;j<A.length;j++){
              if (A[j] == B[i])
                return j;
            }
      }
    }
    return 0;
  }

}

