package codility.lesson12.euclidean;

public class CommonPrimeDivisors {

    public static void main(String[] args) {
int[] A = {15,10,3};
int[] B = {75,30,5};
        System.out.println(" Result = " + solution(A,B));
    }

    public static int solution(int[]A, int[]B){
        int count=0;
        for (int i =0;i<A.length;i++){
            int a = A[i];
            int b = B[i];

            int d = GCD(a,b);
            while (GCD(a,d) != 1)
                a/= GCD(a,d);
            while (GCD(b,d) != 1)
                b/= GCD(b,d);
            if (a==1 && b==1) count++;


        }
        return count;
    }

    private static int GCD(int a,int b){
        if (a%b==0)
            return b;
        else
            return GCD(b,a%b);
    }
}
