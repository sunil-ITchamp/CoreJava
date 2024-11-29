import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicOperations {

    public static void main(String[] args) {

        //Given a String - find all char occurences of specific char='x'
        String str = "10000010001001"; //Find '1'
        char c = '1';
        int[] arr = IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == c)
                .toArray();
        Arrays.stream(arr).forEach(System.out::print);

        //Collect in List of Integers
        List<Integer> list = IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == c).boxed()
                .collect(Collectors.toList());
        System.out.println(list);

        //Binary conversion of a INT
        int no = 1234;
        String binaryString = Integer.toBinaryString(no);
        System.out.println(binaryString);
        int sameNo = Integer.parseInt(binaryString,2);
        System.out.println(sameNo);

        //Looping over collection of values or enums
        String[] days = {"Monday", "Tuesday", "Wednesday"};
        for (String day : days){
            System.out.println(day);
        }

        enum Days {
            Monday,
            Tuesday,
            Wednesday,
            Thurday
        }

        for (Days day : Days.values())
            System.out.println(day);

        //FREQUENCY COUNTING - dominator in array etc
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(collect);

















        int[] myarr = {2,4,5,6,3,4,5};
        Map<Integer, Long> collect1 = Arrays.stream(myarr).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect1);

        String s = "abcabcbd";
        Map<Character, Long> collect2 = s.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect2);


    }
}
