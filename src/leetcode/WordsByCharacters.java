package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordsByCharacters {

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        System.out.println(countCharacters(words, "atach"));
        words = new String[]{"hello", "world", "leetcode"};
        System.out.println(countCharacters(words, "welldonehoneyr"));
    }

    private static int countCharacters(String[] words, String chars) {
        List<String> goodWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String currWord = words[i];
            StringBuilder sb = new StringBuilder(chars);
            boolean found = false;
            for (int j = 0; j < currWord.length(); j++) {
                char currCh = currWord.charAt(j);
                int index = sb.toString().indexOf(String.valueOf(currCh));
                if (index == -1) {
                    found = false;
                    break;
                } else {
                    sb.deleteCharAt(index);
                }
                found = true;
            }
            if (found) {
                goodWords.add(currWord);
            }
        }
        int sum = 0;
        for (String word : goodWords) {
            sum += word.length();
        }

        return sum;
    }
}
