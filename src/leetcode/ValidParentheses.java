package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(validParentheses("([]{})")); //true
        System.out.println(validParentheses("([{}}))")); //false
    }

    private static boolean validParentheses(String test) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < test.length(); i++) {
            var curr = test.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                characters.push(curr);
            } else {
                if (characters.empty()) {
                    return false;
                }
                Character pop = characters.pop();
                if (curr == ')' && pop != '(') {
                    return false;
                }
                if (curr == '}' && pop != '{') {
                    return false;
                }
                if (curr == ']' && pop != '[') {
                    return false;
                }
            }
        }
        return characters.empty();
    }
}
