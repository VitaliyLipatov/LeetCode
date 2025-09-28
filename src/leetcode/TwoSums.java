package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        System.out.println(Arrays.toString(twoSumOptimal(arr, 9)));
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

    private static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (elements.containsKey(target - nums[i])) {
                return new int[]{elements.get(target - nums[i]), i};
            }
            elements.put(nums[i], i);
        }
        return new int[0];
    }
}
