package codility2.lesson10;

public class MinPerimeterSolution {

    public static void main(String[] args) {
        System.out.println("result  = " + solution(30));
    }

    public static int solution(int N) {

        System.out.println(Math.sqrt(N));
        System.out.println((int)Math.sqrt(N));

        for (int i=(int)Math.sqrt(N);i>=1;i--){
            if (N%i == 0)
                return (2*(i+N/i));
        }
        return -1;
    }
}
