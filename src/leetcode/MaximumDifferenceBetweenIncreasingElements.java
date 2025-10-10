package leetcode;

public class MaximumDifferenceBetweenIncreasingElements {

    public static void main(String[] args) {
        int[] nums_1 = {7, 1, 5, 4};
        int[] nums_2 = {9, 4, 3, 2};
        int[] nums_3 = {1, 5, 2, 10};
        System.out.println(maximumDifference(nums_1));
        System.out.println(maximumDifference(nums_2));
        System.out.println(maximumDifference(nums_3));
    }

    private static int maximumDifference(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int currI = nums[i];
            for (int j = 1 + i; j < nums.length; j++) {
                if (nums[j] - currI > max) {
                    max = nums[j] - currI;
                }
            }
        }
        return max != 0 ? max : -1;
    }
}
