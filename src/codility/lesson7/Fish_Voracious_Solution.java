package codility.lesson7;

import javax.swing.tree.DefaultTreeCellEditor;
import java.util.Stack;

public class Fish_Voracious_Solution {
    public static void main(String[] args) throws InterruptedException {
        Integer[] fishSize = {4, 3, 2, 1, 5};
        int[] directions = {0, 1, 0, 0, 0};

        //Test-data-set 2
        Integer[] fishSize2 = {2,6,4,3,1,5};
        int[] directions2 =   {0,1,0,1,0,0};
        //Test-data-set 3
        Integer[] fishSize3 = {4,8,2,6,7};
        int[] directions3 =   {0,1,1,0,0};

        Integer[] fishSize4 = {4,3,2,1,5};
        int[] directions4 =   {0,1,0,0,0};
            System.out.println(" == " + new Fish_Voracious_Solution().solution(fishSize3, directions3));
        System.out.println(" == " + new Fish_Voracious_Solution().solution(fishSize4, directions4));
    }

    public int solution(Integer[] fishSize, int[] direction) throws InterruptedException {
        //keeps track of RIGHT direction fishes
        Stack<Integer> stack = new Stack<>();

        //keeps track of LEFT direction fishes
        int survivors = 0;
        int currentFishSize = 0;
        //Stack holds All fishes moving to RIGHT (1)
        //Rule when we get fish moving to LEFT (0) - we check in stack for any fish mvoing RIGHT (1)
        for (int i = 0; i < fishSize.length; i++) {
            System.out.println("no = " + i + " :fishSize =" + fishSize[i] + " :direction=" + direction[i]);
            currentFishSize = fishSize[i];

            if (direction[i] == 1) {
                System.out.println("inside direction[i] ==  1");
                stack.push(fishSize[i]);
            }
            // If direction is LEFT,Check if we have any fish in stack i.e. with OPP diretion
            // IF size of fish in stack is SMALL THEN CURRENT FISH, THEN DELETE OR POP it and INCREASE survivors == no of fishes moving LEFT direction
            else if (direction[i] == 0) {
                int sizeOfFishRightDirection = stack.empty() ? -1 : stack.pop();
                //Get the fishSize from stack till end of stack or size of fish in stack is < currentSize
                while (sizeOfFishRightDirection != -1 && sizeOfFishRightDirection < currentFishSize)
                    sizeOfFishRightDirection = stack.empty() ? -1 : stack.pop();
                if (sizeOfFishRightDirection == -1)
                    survivors++;
                else
                    stack.push(sizeOfFishRightDirection);
            }
        }// for loop
        int result = stack.size() + survivors;
        return result;
    }
}
