package codility.lesson6;

import codility.lesson7.Brackets_Solution;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class Distinct_Solution {

    public static void main(String[] args) {
       int[] A1 = {2,1,1,2,3,1};
        int[] A2 = {2,1,1,2,3,1,4,4,5,5,5,6,6,6,6,6,8,7,9,8,9};

        System.out.println("\n  Result = " + new Distinct_Solution().solution(A1));
        System.out.println("\n Result = " + new Distinct_Solution().solution(A2));
    }

    public int solution(int[] A) {

        Set<Integer> collect = Arrays.stream(A).boxed().collect(Collectors.toSet());
        System.out.println(collect.size());
        return collect.size();

        //Manual approch using sort algo
//        Arrays.sort(A);
//        int counter=0;
//        if (A.length>0) {
//            counter++;
//            for (int i = 0; i < A.length-1; i++) {
//                if (A[i] != A[i + 1])
//                    counter++;
//            }
//        }
//        return counter;


//        //2nd Approach
//        Map<Integer, Long> map = Arrays.stream(A).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
//        System.out.println("========= " + map + map.size());
//
//        //3rd Approach
//        Arrays.stream(A).distinct().forEach(System.out::print);
//        int i = (int) Arrays.stream(A).distinct().count();
//        return i;

    }

}
