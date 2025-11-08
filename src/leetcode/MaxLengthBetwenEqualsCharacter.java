package leetcode;

public class MaxLengthBetwenEqualsCharacter {

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
    }

    private static int maxLengthBetweenEqualCharacters(String s) {
        int maxLength = -1;
        for (int i = 0; i < s.length(); i++) {
            char currLetter = s.charAt(i);
            int lastIndex = s.lastIndexOf(currLetter);
            if (lastIndex != i && lastIndex != -1 && (lastIndex - i - 1) > maxLength) {
                maxLength = lastIndex - i - 1;
            }
        }
        return maxLength;
    }
}
