package codility2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A={9,3,9,3,9,7,7,9,8};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){

        Arrays.sort(A);
        for (int i=0;i<A.length;){
            if (A[i] == A[i+1])
                i+=2;
            else
                return A[i];

        }
        return -1;
//            Map<Integer,Long> map = Arrays.stream(A).boxed().collect(Collectors.groupingBy(e-> e, Collectors.counting()));
//            System.out.println(map );
//        Stream<Map.Entry<Integer, Long>> entryStream = map.entrySet().stream().filter(e -> e.getValue() == 1);
//        //entryStream.mapToInt(value -> value.getKey()).;
//        return i.intValue();
    }
}
