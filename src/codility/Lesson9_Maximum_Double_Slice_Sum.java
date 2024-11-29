package codility;

public class Lesson9_Maximum_Double_Slice_Sum {
    public static void main(String[] args) {
        int[] A = {3,2,6,-1,4,5,-1,2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A)
    {
        int[] LR = new int[A.length]; int[] RL = new int[A.length];

        int currentSum=0;
        //first loop from LEFT to RIGHT leaving 1st and last element
        for (int i=1;i<A.length-1;i++){
        currentSum+=A[i];
        if (currentSum<0) currentSum=0;
        LR[i]=currentSum;
        }
        currentSum=0;
        //first loop from Right to LEFT leaving 1st and last element i.e. 0th and N-1th element
        for (int i=A.length-2;i>0;i--){
            currentSum+=A[i];
            if (currentSum<0) currentSum=0;
            RL[i]=currentSum;
        }

        int maxSum=0;
        for(int i=0;i<A.length-2;i++)
        {
            //The difference between LR[i] and RL(i+2) is one element of Q in P,Q,R
            maxSum=Math.max(maxSum, LR[i]+RL[i+2]);
        }
        return maxSum;
    }
}
