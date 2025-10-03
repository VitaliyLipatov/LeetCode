package leetcode;

public class WaterBottles2 {

    public static void main(String[] args) {
        System.out.println(maxBottlesDrunk(13, 6));
        System.out.println(maxBottlesDrunk(10, 3));
    }

    private static int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum = numBottles;
        int emptyBottles = numBottles;
        int fullBottles = 0;
        while (emptyBottles >= numExchange || fullBottles > 0) {
            if (emptyBottles >= numExchange) {
                fullBottles++;
                emptyBottles = emptyBottles - numExchange;
                numExchange++;
            } else if (fullBottles > 0) {
                sum += fullBottles;
                emptyBottles += fullBottles;
                fullBottles = 0;
            }
        }
        return sum;
    }
}
