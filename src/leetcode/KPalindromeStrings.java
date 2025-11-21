package leetcode;

import java.util.stream.Stream;

public class KPalindromeStrings {

    public static void main(String[] args) {
        System.out.println(canConstruct("annabelle", 2));
        System.out.println(canConstruct("leetcode", 3));
        System.out.println(canConstruct("true", 4));
    }

    private static boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        if (s.length() == k) {
            return true;
        }

        int oddCount = 0;
        int[] freq = new int[26];

        for (char chr : s.toCharArray()) {
            freq[chr - 'a']++;
        }
        Stream.of(s.toCharArray());

        for (int count : freq) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }

        return oddCount <= k;
    }
}
