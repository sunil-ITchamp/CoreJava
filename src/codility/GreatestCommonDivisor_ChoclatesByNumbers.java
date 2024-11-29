package codility;

public class GreatestCommonDivisor_ChoclatesByNumbers {

    public static void main(String[] args) {
        int a=15;
        int b=12;
//        System.out.println("GCD = " + GCD(a,b));
//        System.out.println("GCD = " + GCD(10,4));

        //Choclates to Eat by Numbers
        int N=10; //no of choclates available
        int M=4; // no of skips before we eat choc

        //System.out.println("No of chocs = " + eatNoOfChocSolution(10,4));
        System.out.println("No of chocs = " + eatNoOfChocSolution(9,6));
//        System.out.println("No of chocs = " + eatNoOfChocSolution(10,11));
    }

    public static int GCD(int a, int b){
        System.out.println(a + " and " + b);
//        if (b==0)
//            return a;
        if (a%b == 0)
            return b;
        else
            return GCD(b, a%b);
    }

    public static int eatNoOfChocSolution(int N, int M){
        System.out.println("GCD ==== " + GCD (N, M));
        return N/GCD(N,M);
    }

}
