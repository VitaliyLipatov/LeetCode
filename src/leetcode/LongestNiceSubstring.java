package leetcode;

import java.util.Stack;

public class LongestNiceSubstring {

    public String longestNiceSubstring(String s) {
        if (s.length() == 1) {
            return "";
        }
        Stack<Character> stack = new Stack<>();
        boolean isCompletePair = false;
        for (int i = 0; i < s.length(); i++) {
            char currCh = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(currCh);
                continue;
            }
            if (Math.abs(currCh - stack.peek()) == 32) {
                stack.push(currCh);
                isCompletePair = true;
            } else if (i != s.length() - 1) {
                if (!isCompletePair) {
                    stack.pop();
                }
                stack.push(currCh);
                isCompletePair = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
