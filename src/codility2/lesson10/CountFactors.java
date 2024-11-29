package codility2.lesson10;

public class CountFactors {

    public static void main(String[] args) {
        System.out.println("result  = " + solution(24));
    }

    public static int solution(int N){
        if (N <1 || N > Integer.MAX_VALUE)
            return -1;

        int factorCount =0;
        for (int i=1;i*i<=N;i++){
            if (N%i == 0) {
                System.out.println(i);
                factorCount++;
            }
        }

        if ( N== (int)(Math.sqrt(N)*Math.sqrt(N) ))
            return factorCount*2-1;
        else
            return factorCount*2;
    }


}
