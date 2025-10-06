package leetcode;

import java.util.Stack;

public class MakeTheStringGreat {

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
        System.out.println(makeGood("s"));
    }

    private static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!stack.empty() && Math.abs(curr - stack.peek()) == 32) {
                stack.pop();
            } else {
                stack.push(curr);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.empty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
