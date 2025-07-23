package sliding_window;

public class BestTimeToBuyAndSellStock {

    // this get time limit
    public static int maxProfitSlow(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];

            }
            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }
        return maxProfit;
    }
}
