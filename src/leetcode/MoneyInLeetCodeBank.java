package leetcode;

public class MoneyInLeetCodeBank {

    public static void main(String[] args) {
        System.out.println(totalMoney(4));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney(20));
    }

    private static int totalMoney(int n) {
        int total = 0;
        int invest = 1;
        for (int i = 1; i <= n; i++) {
            total = total + invest++;
            if (i % 7 == 0) {
                invest = i / 7 + 1;
            }
        }
        return total;
    }
}
