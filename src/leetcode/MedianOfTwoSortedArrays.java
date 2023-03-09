package leetcode;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            mergedArr[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < nums1.length) {
            mergedArr[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            mergedArr[k++] = nums2[j++];
        }

        if (mergedArr.length % 2 == 0) {
            return ((double) (mergedArr[mergedArr.length / 2 ] + mergedArr[mergedArr.length / 2 - 1]))/2;
        } else {
            return (double) mergedArr[mergedArr.length / 2];
        }
    }
}
