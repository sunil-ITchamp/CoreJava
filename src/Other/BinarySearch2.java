package Other;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] A1 = {2,4,5,6,7};
        int[] A2 = {2,4,5,6,7,8,9,10,12};
        //System.out.println(" Result = " + bsSolution(A1, 6));
        //System.out.println(" Result = " + bsSolution(A2, 7));
        System.out.println(" Result = " + bsSolution(A2, 12));
    }

    public static int bsSolution(int[] A, int S){

        int start=0;
        int end = A.length-1;
        //int mid = start+end/2;

        while (start <= end){

            int mid = (start+end)/2;
            System.out.println(start + " :end=" + end + " :mid=" + mid);
            if (S == A[mid]) return mid;
            else if (S > A[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
