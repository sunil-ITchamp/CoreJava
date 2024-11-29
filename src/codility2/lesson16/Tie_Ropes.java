package codility2.lesson16;

public class Tie_Ropes {
    public static void main(String[] args) {
        int[] ropes={1,2,3,4,1,1,3};
        System.out.println("Result = " + solution(4, ropes));
    }

    public static int solution(int K, int A[]){
        int ropesCount =0;
        int ropeLength =0;
        for (int i=0;i<A.length;i++){
            ropeLength+=A[i];
            if (ropeLength>=K){
                ropesCount++;
                ropeLength=0;
            }
        }
        return ropesCount;
    }
}
