package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeastLengthKPlacesAway {

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        System.out.println(kLengthApart(nums, 2));
        nums = new int[]{1, 0, 0, 1, 0, 1};
        System.out.println(kLengthApart(nums, 2));
    }

    private static boolean kLengthApart(int[] nums, int k) {
        boolean isOk = true;
        List<Integer> ones = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones.add(i);
            }
        }
        for (int j = 0; j < ones.size() - 1; j++) {
            int curr = ones.get(j);
            int next = ones.get(j + 1);
            if ((next - curr - 1) < k) {
                isOk = false;
                break;
            } else {
                continue;
            }
        }
        return isOk;
    }
}
