public class Practice2 {

    private static int[] prices = {7, 1, 5, 3, 6, 4};
    private static int[] prices2 = {7, 6, 4, 3, 1};

    private static int[] prices3 = {8, 5, 2, 3, 9, 1, 3, 5};
    private static int[] prices4 = {7, 6, 4, 1, 2};

    private static int[] prices5 = {3,3,5,0,0,3,1,4};

    public static void main(String[] args) {
        System.out.println(maxProfit(prices5));
    }

    // Approach-1
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int t1profit =0;
        int t2profit =0;

        for (int i = 0; i < prices.length-1; i++) {

            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    profit = prices[i] - prices[j];
                }
            }
            System.out.println("PROFIT -- " + profit + " current-price = " + prices[i] + " and " + " next-price " + prices[i+1]);
            if (prices[i] < prices[i+1]) {
                profit += prices[i+1]-prices[i];
                if (t1profit == 0 ) {t1profit = profit;}
                if (t2profit == 0 ) {t2profit = profit;}
                if (t1profit > 0 && t2profit> 0 && t1profit < t2profit) {
                    t1profit=profit;
                }
                if (t1profit > 0 && t2profit > 0 && t2profit > t1profit) {
                    t2profit=profit;
                }

            }
        }
        return t1profit + t2profit;
    }

}
