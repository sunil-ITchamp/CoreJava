package codility;

public class Section_13_Tie_Ropes_Solution {
    public static void main(String[] args) {

        System.out.println(new Section_13_Tie_Ropes_Solution().solution(4, new int[]{1,2,3,4,1,1,3}));
    }

    public int solution(int K, int[] ropes){
        int count=0;
        int currentRopeLength = 0;

        for (int i=0;i<ropes.length;i++){
            currentRopeLength+=ropes[i];

            //When ropeLenght meets the given length criteria, then add count and re-set ropeLength
            if (currentRopeLength>=K){
                count++;
                currentRopeLength=0;
            }

        }
        return count;
    }
}
