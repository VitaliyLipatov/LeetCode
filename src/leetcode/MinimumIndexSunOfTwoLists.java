package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumIndexSunOfTwoLists {

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));

        list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        list2 = new String[]{"KFC", "Shogun", "Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));

        list1 = new String[]{"happy", "sad", "good"};
        list2 = new String[]{"sad", "happy", "good"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

    private static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list_1 = Arrays.asList(list1);
        List<String> list_2 = Arrays.asList(list2);

        int minInd = 0;
        int hitCounts = 0;
        Set<String> results = new HashSet<>();
        for (int i = 0; i < list_1.size(); i++) {
            if (list_2.contains(list_1.get(i))) {
                if (hitCounts == 0) {
                    minInd = i + list_2.indexOf(list_1.get(i));
                    results.add(list_1.get(i));
                }
                hitCounts++;
                if (hitCounts > 1) {
                    int currMin = i + list_2.indexOf(list_1.get(i));
                    if (minInd > currMin) {
                        minInd = currMin;
                        results.clear();
                        results.add(list_1.get(i));
                    }
                    if (minInd == currMin) {
                        results.add(list_1.get(i));
                    }
                }
            }
        }
        return results.toArray(new String[0]);
    }
}
