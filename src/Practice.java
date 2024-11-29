import java.util.HashMap;
import java.util.Map;

class MyClass{
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

public class Practice {

    private static int[] prices = {7,1,5,3,6,4};
    private static int[] prices2 = {8,7,6,5,3,2,1};
    private static int[] prices3 = {7,6,4,3,1};

    public static void main(String[] args) throws InterruptedException {
        //System.out.println( " PROFIT = " + maxProfit(prices2));
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        Map<Object, String > map = new HashMap<>();
        map.put(myClass1,"1");
        map.put(myClass1,"2");
        map.put(myClass2,"3");
        map.put(myClass2,"4");
        System.out.println(map.get(myClass1));
        System.out.println(map.get(myClass2));
    }


    public static int maxProfit(int[] prices) throws InterruptedException {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;
    }







//    public static int maxProfit(int[] prices) throws InterruptedException {
//        int buyPrice = prices[0];
//        int profit = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            System.out.println(" BEFORE Iteration " + i + " buyPrice = " + buyPrice + " profit = " + profit);
//
//            if (prices[i]< buyPrice) {
//                buyPrice = prices[i];
//            }
//
//            if (profit <  (prices[i] - buyPrice)) {
//                profit = prices[i] - buyPrice;
//            }
//
//            System.out.println(" After Iteration " + i + " buyPrice = " + buyPrice + " profit = " + profit);
//            Thread.sleep(3000);
//
//        }
//        return profit;
//    }



}
