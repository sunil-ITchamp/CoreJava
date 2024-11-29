package codility;

public class Section_13_Max_Non_Overlapping_Segments {
    public static void main(String[] args) {
        int[] start={1,3,7,9,9};
        int[] end={5,6,8,9,10};

        int[] start2={0,2,3,5,7,8,9};
        int[] end2={1,3,4,6,8,9,10};


        System.out.println(new Section_13_Max_Non_Overlapping_Segments().solution(start2, end2));

    }

    public int solution(int[] start, int[] end){
        int end_of_last_segment=-1;
        int count = 0;
        for (int i=0;i<start.length;i++){
            if (start[i] > end_of_last_segment){
                count++;
                end_of_last_segment=end[i];
            }
        }
        return count;
    }
}
