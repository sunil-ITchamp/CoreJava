package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LeaderAndDominator {
    public static void main(String[] args) {
        //TEst data for Leader-In-Array
        int[] A1={3,4,2,3,3,2,3};
        int[] A2={5,1,5,3,1,5,4};
        int[] A3 ={2,2,2,4,2,5,3,2};
        System.out.println("\n ++++ Result = " + solutionLeaderInArray2(A3));

    }

    public static int solutionLeaderInArrayBruteForce(int[] arr) {
        int maxCount=0;
        int currentCount = 0;
        int pivot = arr.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            currentCount = 1;

            //IF i==0, then nothing is processed OR Is the element already processed or counted - check in map
            if (i == 0 || map.get(arr[i]) == null ) {
                    for (int j = i + 1; j < arr.length; j++) {
                        System.out.println(" i=" + i + " j=" + j + " ele = " + arr[i] + " ele = " + arr[j]);
                        if (arr[i] == arr[j])
                            currentCount++;
                    }
                    map.put(arr[i], currentCount);
                    System.out.println( "For element " + arr[i] + " :currentcount= " + currentCount);
                    maxCount = Math.max(maxCount, currentCount);
                    System.out.println(" ========== i ========== " + i + maxCount);
                    System.out.println(map);
            }
        }
        return maxCount;
    }
    public static int solutionLeaderInArray(int[] arr){
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::print);
        int index = arr.length/2;
        System.out.println("Middle index = " + index + " Value = " + arr[index]);
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == arr[index])
                count++;
            System.out.println(" i = " + i + " :count = " + count );

            if (i == arr.length-1 && count>=index)
                return arr[index];
        }
        return -1;
    }

    public static int solutionLeaderInArray2(int[] arr) {
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(collect);

        int pivot = arr.length/2;
        System.out.println("Pivot of htis array = " + pivot);

        for (Map.Entry<Integer, Long> entry : collect.entrySet()){
            if (entry.getValue()>pivot)
                return entry.getKey();
        }

        return -1;
    }

}
