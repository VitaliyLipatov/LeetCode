package leetcode;

import java.util.Arrays;

public class LargestTrianglePerimeter {

    public static void main(String[] args) {
        int[] nums_1 = {2, 1, 2};
        int[] nums_2 = {1, 2, 1, 10};
        System.out.println(largestPerimeter(nums_1));
        System.out.println(largestPerimeter(nums_2));
    }

    private static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int currBigSize = nums[i];
            for (int j = nums.length - 2 - counter; j > 0; ) {
                int second = nums[j];
                int thrird = nums[--j];
                if (currBigSize < second + thrird) {
                    return currBigSize + second + thrird;
                }
            }
            counter++;
        }
        return 0;
    }
}
