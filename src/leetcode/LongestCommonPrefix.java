package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] arr1 = {"flower","flow","flight"};
        String [] arr2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(arr1));
        System.out.println(longestCommonPrefix(arr2));
        System.out.println(longestCommonPrefixOptimal(arr1));
        System.out.println(longestCommonPrefixOptimal(arr2));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder resPrefix = new StringBuilder();
        String firstStr = strs[0];
        for (int j = 0; j < firstStr.length(); j++) {
            char letterChar = firstStr.charAt(j);
            String prefix = sb.append(letterChar).toString();
            boolean flag = true;
            for (int i = 1; i < strs.length; i++) {
                String currStr = strs[i];
                if (currStr.startsWith(prefix)) {
                    if (i == strs.length - 1) {
                        resPrefix.append(letterChar);
                    }
                    continue;
                } else {
                    if (j == 0) {
                        flag = false;
                    }
                    break;
                }
            }
            if (!flag) {
                return "";
            }
        }
        return resPrefix.toString();
    }

    private static String longestCommonPrefixOptimal(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                res.append(first.charAt(i));
            } else {
                break;
            }
        }
        return res.toString();
    }
}
