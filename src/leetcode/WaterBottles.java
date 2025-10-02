package leetcode;

public class WaterBottles {

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
        System.out.println(numWaterBottles(15, 4));
    }

    private static int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            sum += emptyBottles / numExchange;
            emptyBottles = emptyBottles / numExchange + emptyBottles % numExchange;
        }
        return sum;
    }
}
