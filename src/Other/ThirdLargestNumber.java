package Other;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdLargestNumber {

    public static void main(String[] args) {

        //3rd or 4th Highest number
//    List<Integer> numbers = Arrays.asList(10, 20, 4, 45, 99, 54);
//        System.out.println( numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
//        // skip 2 means first 2
//        System.out.println(" ======== SKIP Operation ============== ");
//        Stream<Integer> skip = numbers.stream().sorted(Collections.reverseOrder()).skip(2);
//        skip.forEach(e-> System.out.println(e));
//        System.out.println(" ======== LIMIT Operation ============== ");
//        Stream<Integer> limit = numbers.stream().sorted(Collections.reverseOrder()).skip(3).limit(1);
//        limit.forEach(e-> System.out.println(e));

        List<Integer> numbers=Arrays.asList(1,4,6,10);
        Optional reduce = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(reduce.get());

        System.out.println(numbers.stream().mapToInt(e->e).average().getAsDouble());

        List<Integer> numbers2=Arrays.asList(-11,-4,-6,-10-100);
        //List<Integer> numbers2=Arrays.asList(11,4,-6,12,-10,13);
        int max=Integer.MIN_VALUE;
        System.out.println(max);
        for (int i=0;i<numbers2.size();i++){

            //max = Math.max(numbers2.get(i), numbers2.get(i+1));
            max = Math.max(max, numbers2.get(i));
            //System.out.println(numbers2.get(i) + " AND " + numbers2.get(i+1) + "max = " + max);
        }
        System.out.println("=========== " + max);
    }

}
