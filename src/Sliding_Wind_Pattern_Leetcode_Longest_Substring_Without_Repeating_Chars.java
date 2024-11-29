import java.util.HashSet;
import java.util.Set;

public class Sliding_Wind_Pattern_Leetcode_Longest_Substring_Without_Repeating_Chars {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (!(s.length() >= 0 && s.length() < 2 * Math.pow(10, 4))) return 0;

        int i = 0, j = 0, max = 0;
        Set<Character> seen = new HashSet<>();

        while (i < s.length()) {
            char ch = s.charAt(i);

            while (seen.contains(ch)) {
                System.out.println("BEFORE " + seen + " j = " + j );
                    seen.remove(s.charAt(j));
                    j++;
                System.out.println("AFTER " + seen + " j = " + j );
            }
            seen.add(s.charAt(i));
            max = Math.max(max, i - j + 1);
            i++;
        }
        System.out.println(seen);
        return max;
    }
}
