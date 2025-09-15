package leetcode;

public class RemoveElement {

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 2, 3};
        System.out.println(removeElement(arr1, 3));
        int[] arr3 = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(arr3, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int j = nums.length - 1;
        for (int i = 0; i < j; i++) {
            if (nums[i] == val) {
                while (nums[j] == val) {
                    j--;
                    k++;
                }
                nums[i] = nums[j];
                nums[j] = val;
                k++;
                j--;
            }
        }
        return k;
    }
}
