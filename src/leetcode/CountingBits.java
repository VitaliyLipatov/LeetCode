package leetcode;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }

    private static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = result[i / 2] + i % 2;
        }
        return result;
    }
}
