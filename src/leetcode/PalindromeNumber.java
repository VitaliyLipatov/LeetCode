package leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    private static boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        for (int i = 0, j = xStr.length() -1 ; i < j; i++, j--) {
            if (xStr.charAt(i) != xStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
