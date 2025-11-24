package leetcode;

public class ScoreOfString {

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        System.out.println(scoreOfString("zaz"));
    }

    private static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char curr = s.charAt(i);
            char next = s.charAt(i + 1);
            sum += Math.abs(curr - next);
        }
        return sum;
    }
}
