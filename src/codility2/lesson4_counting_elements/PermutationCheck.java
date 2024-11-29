package codility2.lesson4_counting_elements;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//A permutation is a sequence containing each element from 1 to N once, and only once.
public class PermutationCheck {
    public static void main(String[] args) throws InterruptedException {
        int[] A1 = {4,1,3,2}; // Is a permutation
        int[] A2 = {4, 1, 3}; // NOT a permutation
        int[] A3 = {1,2,2,3}; // NOT a permutation
        int[] A4 = {4,1,2,3,5,7,6,9,8,10};
       System.out.println("\n Result = " + solution(A2));
//        System.out.println("\n Result = " + solution(A2));
        //System.out.println("\n Result = " + solution(A3));

        //ANOTHER Solution - To find duplicates in a given array
        int[] A10 = {4,1,3,2,5,6}; // SHOULD return false = 0;
        int[] A11 = {4,1,3,3,2,2}; // SHOULD return true = 1;
//        System.out.println("\n Result = " + findArrayHasDuplicates(A10));
//        System.out.println("\n Result = " + findArrayHasDuplicates(A11));
    }

    public static int solution(int[] A){
        Arrays.sort(A);
        Arrays.stream(A).forEach(System.out::print);

        //Step - 1 - MAKE checks efficient by skipping For loop - if 1st element and last element is not matching pattern
        //1,2,3,4 is matching
        //1,3,4 - last element is not matching
        // {1,2,3,4,4} - BELOW COVERS THIS VALIDATION ALSO HENCE DUPLICATE CHECKING NOT NEEDED --> A permutation is a sequence containing each element from 1 to N once, and only once.

        //Validations of range
        System.out.println(" Size of array should be less then " + (int)Math.pow(10,5));
        System.out.println(" Each element range = " + (int) Math.pow(10,9));
        if (A.length <= (int)Math.pow(10,5)){

                //IMPORTANT CHECK - FOR 1st and Last element
                if (A[0] != 1 || A[A.length-1] != A.length) {
                    System.out.println("Condition Failed - checking 1st = 1 and last element = " + A.length);
                    return 0;
                }

                //if above checks passed - THEN ONLY run for loop
                for (int i=0;i<A.length;i++){
                        if (A[i] != i+1){
                            System.out.println("i = " + i + " A[i] = " + A[i] + " compare with " + (i+1));
                            return 0;
                        }
                }
            return 1;
        }//Validation check
        return -1;
    }

    public static boolean findArrayHasDuplicates(int duplicates[]){

        int size = duplicates.length;
        Set<Integer> set = Arrays.stream(duplicates).boxed().collect(Collectors.toSet());
        int sizeofUniqueElements = set.size();
        System.out.println(" Array size = " + size);
        System.out.println(" Set size = " + sizeofUniqueElements);

        if (size != sizeofUniqueElements)
            return false;
        else
            return true;

        //Return 1 for true or 0 for false
//        Map<Integer,Long> map = Arrays.stream(duplicates).boxed().collect(Collectors.groupingBy(e->e, Collectors.counting()));
//        System.out.println(map);
//        if (map.containsValue(2)) {
//            System.out.println("Returning 0 as found mismatch");
//            return 0;
//        }
//        return 1;
    }
}
