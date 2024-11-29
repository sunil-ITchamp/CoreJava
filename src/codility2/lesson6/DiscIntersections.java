package codility2.lesson6;

public class DiscIntersections {
    public static void main (String[] args) throws InterruptedException {
        int[] A = {1, 5, 2, 1, 4, 0};
        System.out.println(solution(A));
    }

    public static int solution (int[] A) throws InterruptedException {
        int result = 0;
        // Compare 1st disc with All. Then 2nd with ALL and so on..
        // if current disc C+R > C-R of next disc, then they are intersecting
        for (int i = 0; i < A.length - 1; i++) {

            for (int j = i+1; j < A.length; j++) {
                System.out.println(" ==========  i=" + i + " :j=" + j);
                //for current disc
                if (i + A[i] > (j - A[j])) {
                    result++;
                }
            }
            System.out.println("result for All loops of i = " + i + " : result=" + result);
            Thread.sleep(2000);
        }
        return result;
    }
}
