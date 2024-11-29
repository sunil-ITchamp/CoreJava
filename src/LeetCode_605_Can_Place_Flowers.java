//You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//
//
//
//        Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false
//
//
//Constraints:
//
//        1 <= flowerbed.length <= 2 * 104
//flowerbed[i] is 0 or 1.
//There are no two adjacent flowers in flowerbed.
//        0 <= n <= flowerbed.length

import java.util.Arrays;

public class LeetCode_605_Can_Place_Flowers {

    public static void main(String[] args) {
int[] flowerbed = {1,0,0,0,1}; int n = 1;
//Output: true

//Example 2:
//
int[] flowerbed2 = {1,0,0,0,1}; int n2 = 2;
//Output: false
int[] flowerbed3 = {0,1,0,1,0}; int n3 = 3;
int[] flowerbed4 = {0,0,0,0,0}; int n4 = 3;

        System.out.println("Output = " + canPlaceFlowers(flowerbed4, n4));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
            System.out.println("index = " + i + ", left= " + left + ", right= " + right);

            if (left && right && flowerbed[i] == 0 ) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n<=0;
    }
}

//First solution
//int count=0;
//    for (int i = 0; i < flowerbed.length-1; i++) {
//
//        if (flowerbed[i] == 1)
//        continue;
//        if (flowerbed[i] == 0 && flowerbed[i+1] ==0) {
//flowerbed[i+1] = 1;
//count++;
//        }
//
//        }
//        if (count == n)
//        return true;
//        return false;
//
//        }