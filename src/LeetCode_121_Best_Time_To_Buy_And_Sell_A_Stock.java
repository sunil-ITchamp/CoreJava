//LeetCode 121 - Best time to buy and sell a stock
//
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
//
//
//Constraints:
//
//        1 <= prices.length <= 105
//        0 <= prices[i] <= 104

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class LeetCode_121_Best_Time_To_Buy_And_Sell_A_Stock {

    private static int[] prices1 = {7, 1, 5, 3, 6, 4};
    // apply substract to each value of prices3 - to check if kadane algo will work to give max profit
    private static int[] prices1_2 = {-6, 4, -2, 3, -2};
    private static int[] prices2 = {7, 6, 4, 3, 1};

    private static int[] prices3 = {8, 5, 2, 3, 9, 7, 1};
    // apply substract to each value of prices3 - to check if kadane algo will work to give max profit
    private static int[] prices3_2 = {-3, -3, 1, 6, -2, -6};

    private static int[] prices4 = {7, 6, 4, 3, 2};

    private static int[] prices5 = {23171, 21011, 21123, 21366, 21013, 21367};

    // Approach-1
    public static int maxProfit(int[] prices) {
        IntSummaryStatistics intSummaryStatistics = IntStream.of(prices).summaryStatistics();
        int max = intSummaryStatistics.getMax();
        int min = intSummaryStatistics.getMin();


        Integer[] newPrices = Arrays.stream(prices).boxed().toArray(Integer[]::new);
        int minPosition = Arrays.asList(newPrices).indexOf(min);
        int maxPosition = Arrays.asList(newPrices).indexOf(max);
        System.out.println("min = " + min + ", position = " + minPosition + " AND max = " + max + ", position= " + maxPosition);

        if (minPosition == (prices.length - 1)) {
            return 0;
        } else {
            int[] integers = Arrays.copyOfRange(prices, minPosition + 1, prices.length);
            System.out.println("+++++++++++++++ " + integers.toString());
            int nextmax = Arrays.stream(integers).summaryStatistics().getMax();
            System.out.println("Next max = " + nextmax);
            return nextmax - min;

        }
//            IntStream. range(0, prices.length)
//                            .forEach(index -> System.out.println(prices[index]));


    }

    // Approach-2
    public static int maxProfit2(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
//                if (prices[i] < buyPrice){
//                    buyPrice = prices[i];
//                }

            //OPTIMIZATION - based on DSA series
            buyPrice = Math.min(buyPrice, prices[i]);
            profit = Math.max(profit, prices[i] - buyPrice);
            System.out.println(" " + i + "th Iteration --> buyPrice =" + buyPrice + " :profit=" + profit);
        }
        return profit;
    }

    public static void main(String[] args) {
        //System.out.println("====== Input =============" + prices3);
        //Arrays.stream(prices2).forEach(System.out::println);
        //System.out.println(" ===== Result ========== " + LeetCode_121_Best_Time_To_Buy_And_Sell_A_Stock.maxProfit2(prices3));
        System.out.println(" ===== Result ========== " + maxProfit_20_Nov(new int[]{7,1,5,3,6,4}));
        //System.out.println(" ===== Result ========== " + maxProfit_20_Nov(prices5));
    }
        public static int maxProfit_15 (int[] prices){
            int profit = 0;
            int buyPrice = prices[0];
            Arrays.stream(prices).forEach(e -> System.out.print(e));
            for (int i = 1; i < prices.length; i++) {
                System.out.println("\nBuy Price = " + buyPrice + " Current price = " + prices[i]);
                //if currentPrice is less then buyPrice then buy
                if (prices[i] < buyPrice) {
                    buyPrice = prices[i];
                }
                profit = Math.max(profit, prices[i] - buyPrice);
            }
            return profit;
        }

        //Different approach
        public static int maxProfit_15_2 ( int[] prices){
            Arrays.stream(prices).forEach(e -> System.out.print(e));

            int minValue = Arrays.stream(prices).summaryStatistics().getMin();
            System.out.println("\nminValue  = " + minValue);
            int minValueIndex = Arrays.binarySearch(prices, 3);
            System.out.println("minValueIndex index = " + minValueIndex);
//            int[] subArray = Arrays.copyOfRange(prices,minValueIndex+1, prices.length);
//            Arrays.stream(subArray).forEach(System.out::print);
//            int maxValue = Arrays.stream(subArray).summaryStatistics().getMax();
//            System.out.println(" min = " + minValue + " max = " + maxValue);
//            return maxValue - minValue;
            return 0;
        }


    public static int maxProfit_20_Nov(int[] prices) {
        int maxProfit =0;
        int buyPrice = prices[0];

        for (int i=1;i<prices.length;i++){
                maxProfit=Math.max(maxProfit, prices[i]-buyPrice);
                buyPrice = Math.min(buyPrice, prices[i]);
            System.out.println("Buy Price=" + buyPrice + " : current=" + prices[i] + " : maxProfit = "+ maxProfit);

        }
        return maxProfit;
    }

}



