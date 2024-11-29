package Other;

public class LargestPossibleSquareForCutSticks {
    public static void main(String[] args) {

        System.out.println( "result = " + solution(13,11)); //24 5
        System.out.println( "result = " + solution(10,21)); //31 7
        System.out.println( "result = " + solution(2,1)); //3 0
        System.out.println( "result = " + solution(1,8)); //9 2

    }

    public static int solution(int A, int B){
        int n = (A+B)/4;

        for (int no=n;no>=1;no--) {
            int n1 = A / no;
            int n2 = B / no;

            if (n1+n2 == 4){
                return no;
            }
        }

        return 0;
    }
}
