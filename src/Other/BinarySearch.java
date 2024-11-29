package Other;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] A={1,2,3,7,9,10,11};
        System.out.println(binarySearch(A,11));
    }

    private static int binarySearch(int a[], int x)
    {
        int l = 0;
        int r = a.length-1;

        while (l <= r) {
            // Index of Element Returned
            int m = (l+r)/2;
            if (a[m] == x) {
                return m;
                // If element is smaller than mid, then it can only be present in left subarray
                // so we decrease our r pointer to mid - 1
            } else if (x<a[m]) {
                r = m - 1;

                // Else the element can only be present in right subarray
                // so we increase our l pointer to mid + 1
            } else {
                l = m + 1;
            }
        }

        // No Element Found
        return -1;
    }
}
