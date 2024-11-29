package codility.lesson7;

import java.util.Stack;

public class Brackets_Solution {
    public static void main(String[] args) {
        String s1 = "{[()()]}";
        String s2 = "([)()]";
        String s3 ="{{[[()]]}}]";
        String s4 ="{[({[([])]})]}";

        //Nesting problem related
        String s5 = "(()(())())";
        String s6 = "())";

        System.out.println(new Brackets_Solution().solution(s5));
        System.out.println(new Brackets_Solution().solution(s6  ));
    }

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return 0;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return 0;
            } else if (c == '}'){
                if (stack.isEmpty() || stack.pop() != '{') return 0;
            }
        }

        return stack.isEmpty()?1:0;
    }
}
