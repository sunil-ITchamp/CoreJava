package codility2.lesson9;

public class Max_Profit {

    public static void main(String[] args) {
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        int[] A2 ={7,1,5,3,6,4};
        System.out.println(" Result = " + solution(A));
    }

    public static int solution(int[] A){
        int buyPrice =A[0];
        int profit=0;
        for (int i=1;i<A.length;i++){
            profit = Math.max(profit, A[i] - buyPrice);
            buyPrice = Math.min(buyPrice, A[i]);
        }
        return profit;
    }
}


