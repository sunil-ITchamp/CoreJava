import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerToBinary {
    public static void main(String[] args) {
//        int i = 1041;
//        String str = Integer.toBinaryString(i);
//        System.out.println("Integer " + i + " :Binary " + str + " Tot-elements = " + str.length() + "\n");

        System.out.println(solutionBinaryGap2(1041)); // r =5
        System.out.println(solutionBinaryGap2(529)); // r=4
        System.out.println(solutionBinaryGap2(9)); // r=2
        System.out.println(solutionBinaryGap2(20)); // r=1

        System.out.println(solutionBinaryGap2(15)); // r = 0
        System.out.println(solutionBinaryGap2(32)); // r = 0
        int[] A = {3, 8, 9, 7, 6};
        int[] A2 = {7,2,8,3,5};
        int[] A3 ={1,2,3,4};
        //solutionCyclicRotation(A, 3);
        //solutionCyclicRotation(A2, 2);
        //solutionCyclicRotation(A3, 4);

        //Test-data for OddOccurencesInArray
        //int[] A = {13, 13, 9, 3, 9, 3, 9, 7, 9, 7, 10, 10, 11, 11, 12};
        //System.out.println("\n Result = " + solutionOddOccurrencesInArray(A));
        //System.out.println(" Jumps ="+  solutionFrogJump2(10, 85, 30));
        //System.out.println( " anser = " + solutionPermMissingElement(new int[]{1,2,3,6,4}));
    }

    public static int solutionBinaryGap(int N) {
        if (N >= 1 && N <= Integer.MAX_VALUE) {
            String binaryStr = Integer.toBinaryString(N);
            System.out.println("Binary rep = " + binaryStr);
            char c = '1';
            int[] arr = IntStream.range(0, binaryStr.length())
                    .filter(index -> binaryStr.charAt(index) == c).toArray();

            Arrays.stream(arr).forEach(System.out::print);
            System.out.println(" ---------   ");
            int max = 0;
            //if 0 or 1 presence of 1 is found then return 0 - NO binary gaps
            if (arr.length <= 1)
                return 0;
            else if (arr.length > 1) {
                for (int i = 0; i < arr.length - 1; i++) {
                    System.out.println("For i = " + i + " " + (arr[i + 1] - arr[i] - 1));
                    max = Math.max(max, (arr[i + 1] - arr[i] - 1));
                }
            }
            return max;
        }
        return -1;
    }

    public static int solutionBinaryGap2(int N) {
        List<String> result = Arrays.asList(Integer.toBinaryString(N).replace("0"," ").strip().split("1"));
        System.out.println("====== " + result);
        if(!result.isEmpty()){
            return Collections.max(result.stream().map(String::length).collect(Collectors.toList()));
        }
        return 0;
    }

    public static int solutionBinaryGap3(int N) {
        // System.out.println( " === "+   "1000010001".replaceAll("0+$",""));
        // will cut any 000 towards end. In above string there are NO zeros in end so same string will be returned.
        // In case of 10000 - above function will return just 1
        //this will bring no of 0000 b/w 1
        String binaryNumber = Integer.toBinaryString(N);
        System.out.println("Number = " + N + " :Binary = " + binaryNumber);
        String[] gaps = binaryNumber.replaceAll("0+$", "").split("1");

//        for (String s:gaps){
//            System.out.println(" == " + s);
//        }
        int maxLength = 0;
        for (String gap: gaps) {
//            if (gap.length() > 0 && gap.length() > maxLength) {
//                maxLength = gap.length();
//            }
            maxLength = Math.max(maxLength, gap.length());
        }

        return maxLength;
    }
    // END OF BINARY GAP SOLUTION's

    public static int[] solutionCyclicRotation(int[] A, int K) {
        Arrays.stream(A).forEach(System.out::print);
        int[] result = new int[A.length];
        int size = A.length;

        for (int i = 0; i < A.length; i++) {
            System.out.println(" Element = " + ((i + K) % size));
            result[(i + K) % size] = A[i];
        }
        Arrays.stream(result).forEach(System.out::print);
        return A;
    }

    public static int solutionOddOccurrencesInArray(int[] A) {
        Arrays.sort(A);
        Arrays.stream(A).forEach(System.out::print);

        for (int i = 0; i < A.length; ) {
            //System.out.println("i = "+ i + " Element A[i]= " + A[i] + " : " + A[i+1]);
            if (i == A.length - 1)
                return A[i];
            if (A[i] == A[i + 1])
                i += 2;
            else if (A[i] != A[i + 1])
                return A[i];

        }
        return 0;
    }

    public static int solutionFrogJump1(int X, int Y, int D) {
        int distanceToJump = Y - X;
        int jumpsRequired = distanceToJump / D;
        if(distanceToJump % D != 0) {
            jumpsRequired++; //only add extra jump if remainder exists
        }
        return jumpsRequired;
    }

    public static int solutionFrogJump2(int X, int Y, int D) {
        System.out.println((float)(Y -X)/D);
        return (int) Math.ceil((float)(Y -X)/D);
    }

    public static int solutionPermMissingElement(int[] A) {
        Arrays.sort(A);
        int missingElement=1;
        for (int i=0;i<A.length;i++){
            if (A[i]==missingElement)
                missingElement++;
        }
        return missingElement;
    }
}