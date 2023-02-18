package leetcode;

import java.util.Arrays;

public class TwoSums {

    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 5, 9, 7};
        System.out.println(Arrays.toString(twoSum(arr, 13)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (target == curr + nums[j]) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
