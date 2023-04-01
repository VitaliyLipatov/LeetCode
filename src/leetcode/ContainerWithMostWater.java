package leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxAreaSlow(arr));
        System.out.println(maxAreaOptimal(arr));
    }

    private static int maxAreaSlow(int[] height) {
        int maxArea = 0;
        for (int j = 1; j < height.length; j++) {
            int last = height[height.length - j];
            int arrLen = height.length - j;
            for (int i = 0; i < height.length; i++) {
                int currMinHeight = height[i] > last ? last : height[i];
                int currArea = currMinHeight * (arrLen - i);
                if (maxArea < currArea) {
                    maxArea = currArea;
                }
            }
        }
        return maxArea;
    }

    private static int maxAreaOptimal(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            if (height[i] <= height[j]) {
                maxArea = Math.max(maxArea, height[i] * (j - i));
                i++;
            } else {
                maxArea = Math.max(maxArea, height[j] * (j - i));
                j--;
            }
        }
        return maxArea;
    }
}
