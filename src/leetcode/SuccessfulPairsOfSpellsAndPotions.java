package leetcode;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {

    public static void main(String[] args) {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(successfulPairs(spells, potions, 7L)));

        spells = new int[]{3, 1, 2};
        potions = new int[]{8, 5, 8};
        System.out.println(Arrays.toString(successfulPairs(spells, potions, 16L)));
    }

    private static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int index = binarySearch(potions, spells[i], success);
            if (index != -1) {
                pairs[i] = potions.length - index;
            }
        }
        return pairs;
    }

    private static int binarySearch(int[] potions, long currSpell, long success) {
        int index = -1;
        int low = 0;
        int high = potions.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if ((long) potions[mid] * currSpell >= success) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }
}
