package codility2.lesson5_prefix_sums;

public class CountDiv {

    public static void main(String[] args) {
        System.out.println("Result = " + solution(6,16,3));
    }
    public static int solution(int A, int B, int K){
        double nStart = Math.ceil( A/(double)K);
        double nEnd = Math.floor( B/(double)K);
        return (int)(nEnd-nStart+1);
    }
}
