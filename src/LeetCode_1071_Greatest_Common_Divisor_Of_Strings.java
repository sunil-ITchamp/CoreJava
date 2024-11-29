//For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//
//
//
//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""
//
//
//Constraints:
//
//        1 <= str1.length, str2.length <= 1000
//str1 and str2 consist of English uppercase letters.


public class LeetCode_1071_Greatest_Common_Divisor_Of_Strings {
//    private static String str1 = "ABCABC";
//    private static String str2 = "ABC";

    private static String str1 = "ABCDE";
    private static String str2 = "ABCDEABCDEABCDE";

    public static void main(String[] args) {
        System.out.println(gcd(60,30));
        System.out.println(gcd(4,12));
        System.out.println(gcd(4,56));
        System.out.println("GCD = " + gcdOfStrings(str1,str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
                return ( ((str1 + str2).equals(str2 + str1))?str1.substring(0, gcd(str1.length(),str2.length())): "");
            }


        static int gcd(int a, int b)
        {
            // if b=0, a is the GCD
            if (b == 0)
                return a;

            else if(a ==0)
                return b;

                // call the gcd() method recursively by
                // replacing a with b and b with
                // difference(a,b) as long as b != 0
            else {
                if (a>b)
                    return gcd((a-b), b);
                return gcd(a, (b-a));
            }

        }
    }


