package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReformatTheString {

    public static void main(String[] args) {
        System.out.println(reformat("a0b1c2"));
        System.out.println(reformat("leetcode"));
        System.out.println(reformat("1229857369"));
        System.out.println(reformat("covid2019"));
    }

    private static String reformat(String s) {
        List<Character> digits = new ArrayList();
        List<Character> letters = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (Character.isDigit(curr)) {
                digits.add(curr);
            } else {
                letters.add(curr);
            }
        }
        if ((digits.size() - letters.size()) > 1 || (letters.size() - digits.size()) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (digits.size() > letters.size()) {
            for (int i = 0; i < digits.size(); i++) {
                sb.append(digits.get(i));
                if (i < letters.size()) {
                    sb.append(letters.get(i));
                }

            }
        } else {
            for (int i = 0; i < letters.size(); i++) {
                sb.append(letters.get(i));
                if (i < digits.size()) {
                    sb.append(digits.get(i));
                }

            }
        }
        return sb.toString();
    }
}
