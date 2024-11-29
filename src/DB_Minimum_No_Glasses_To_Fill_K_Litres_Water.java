import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class DB_Minimum_No_Glasses_To_Fill_K_Litres_Water {

    public static void main(String[] args) {

        //Input for largest pos and negative numbers
        //int[] N = {3,2,-2,5,-3};
        int[] N2 = {1,1,2,-1,2,-1};
        int[] N3 = {1,2,3,-4};
        int[] N4 = {-9,8,7,-7,-8,2};

        int[] N = {1,2,3,4,5};
//        int capacity_K = 8;


//        int[] N = {1,2,3,4,5,6,7,8,9,10};
//        int capacity_K = 27;
        System.out.println(solution(N, 5));

        int[] myArray={-1,-2,-3,-4,-5};
        int[] myArray2={-5,-4,-3,-2,-1};
        int[] myArray3={5,4,3,2,1};
        int[] myArray4={-3,-2,-1,2,3,5};
       //System.out.println("OUTPUT = " + Arrays.binarySearch(myArray4,-1));
        //System.out.println(solution_For_Largest_Int_Both_Plus_Minus(N4));
        //System.out.println(solution(5,8));
        //System.out.println(solution_20_Nov(4,10));
        //System.out.println(solution_20_Nov(1,2));
    }

    public static int solution(int[] N, int K) {
        int minNoOfGlasses=0;
        Integer[] arr = Arrays.stream(N).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder());
        int[] newArray = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        Arrays.stream(newArray).forEach(System.out::print);

        for (int i=0; i<newArray.length; i++){
            System.out.println("i = " + i +" : " + K );
            if ( newArray[i]<= K ){
                K = K-newArray[i];
                minNoOfGlasses+=1;
            }
        }
        if (K == 0)
            return minNoOfGlasses;
        return -1;
    }

    public static int solution_For_Largest_Int_Both_Plus_Minus(int[] N){
        int largestInteger = 0;
        Integer[] arr = Arrays.stream(N).boxed().toArray(Integer[]::new);
        //Sort in Ascending order
        Arrays.sort(arr);
        int[] sortedArray = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        Arrays.stream(sortedArray).forEach(System.out::print);

        for (int i = N.length-1; i>=0;i--){

            System.out.println("\n CHECK - index i = " + i + " : element = " + sortedArray[i]);
            if (sortedArray[i]<0)
                return 0;
            else if (sortedArray[i]>0)
            {

                int toFind = -sortedArray[i];
                int value = Arrays.binarySearch(sortedArray, toFind);
                System.out.println("INSIDE ELSE - index " + i + " = " + sortedArray[i] + " ----------- Search for " + toFind + " Search-result = "+ value);
                if (value>=0){
                    return sortedArray[i];
                }
            }

        }
        return largestInteger;
    }























    public static int solution_20_Nov(int N, int K){
        int noOfGlasses = 0;
        int waterFilled =0;
        int count=0;
        for (int i=N; i>=1;i--){

            if (i <= K){
                K = K -i;
                noOfGlasses+=1;
            }
            System.out.println(i+  " : K =" + K + " noOfGlasses = " +noOfGlasses );
            if (K==0)
                return noOfGlasses;
        }
        return -1;
    }
}