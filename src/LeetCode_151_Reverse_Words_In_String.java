//Given an input string s, reverse the order of the words.
//
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//
//Return a string of the words in reverse order concatenated by a single space.
//
//Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//
//
//
//Example 1:
//
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.
//Example 3:
//
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
//
//
//        Constraints:
//
//        1 <= s.length <= 104
//s contains English letters (upper-case and lower-case), digits, and spaces ' '.
//There is at least one word in s.




public class LeetCode_151_Reverse_Words_In_String {

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello    world  wow ";
        System.out.println(reverseWords(s2));
    }
        public static String reverseWords(String s) {

            StringBuffer sb = new StringBuffer();
            System.out.println(s);
            //The regex ‘\s+’ matches one or more whitespace characters. Therefore, we can call the replaceAll(“\\s+”, ” “) method to finish the first step.
            //Then we can invoke the String.trim() method to apply the trim operation.
            String str = s.replaceAll("\\s+"," ");
            System.out.println("++++++++++++ "+ str);
            String [] arr = str.split(" ");
            for (int i=arr.length-1;i>=0;i--){
                System.out.println(arr[i]);
                sb.append(arr[i]);
                if (i>0){
                    sb.append(" ");
                }
            }
            return sb.toString().trim();
        }
}

