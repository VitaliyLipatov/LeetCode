package leetcode;

import java.util.List;
import java.util.Stack;

public class ReverseVowelsOfString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }

    private static String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        List<String> list = List.of(String.valueOf('a'), String.valueOf('e'), String.valueOf('i'),
                String.valueOf('o'), String.valueOf('u'));
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(String.valueOf(s.charAt(i)).toLowerCase())) {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(String.valueOf(s.charAt(i)).toLowerCase())) {
                res.append(stack.pop());
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
