package leetcode;

public class MinOperationsToMakeElementsDivisibleByThree {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(minimumOperations(nums));
        nums = new int[]{3, 6, 9};
        System.out.println(minimumOperations(nums));
    }

    private static int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr % 3 == 0) {
                continue;
            }
            if (curr % 3 == 1 || curr % 3 == 2) {
                count++;
            }
        }
        return count;
    }
}
