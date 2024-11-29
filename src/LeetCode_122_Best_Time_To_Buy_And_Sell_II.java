import java.sql.SQLOutput;
import java.util.Arrays;

public class LeetCode_122_Best_Time_To_Buy_And_Sell_II {

    public static void main(String[] args) throws InterruptedException {
        int [] prices = {7,1,5,3,6,4,6,7};
        int [] prices2 = {1,2,3,4,5};
        int [] prices3 = {7,6,4,3,1};
        //System.out.println(" Profit = " + maxProfit_15(prices2));
        //System.out.println(" ===== Result ========== " + maxProfit_20_Nov(new int[]{7,1,5,3,6,4}));
        System.out.println(" ===== Result ========== " + maxProfit_20_Nov(prices));
    }

    public static int maxProfit(int[] prices) throws InterruptedException {
        int profit = 0;
        //int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {

            System.out.println("Iteration # " + i + ": currentPrice" + prices[i] + " Prev day price = " + prices[i - 1]);
            if (prices[i] > prices[i - 1]) {
                System.out.println("Buying at " + prices[i - 1] + "sell at " + prices[i]);
                profit += prices[i] - prices[i - 1];
                Thread.sleep(2000);
            }

        }
        return profit;
    }




















    public static int maxProfit_15(int[] prices) throws InterruptedException {
        int profit = 0;
        int buyPrice = prices[0];
        Arrays.stream(prices).forEach(System.out::print);
        for (int i = 1; i < prices.length; i++) {
            System.out.println("\nBuyPrice = " + buyPrice + " Current price = " + prices[i]);
            if (prices[i] > buyPrice) {
                profit += prices[i] - buyPrice;
                System.out.println(profit);
            }
            buyPrice = prices[i];
        }
        return profit;
    }




















    public static int maxProfit_20_Nov(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];
        for (int i=1;i<prices.length;i++){
            if (prices[i]>buyPrice){
                profit+= prices[i]-buyPrice;
            }
            buyPrice=prices[i];
        }
        return profit;
    }
}