// sort the array of 0's and 1's
package arrays;

import java.util.Arrays;

public class sort0and1Array {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 1, 1, 0, 0, 1, 0 };
        int n = arr.length;
        int noOfZeroes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                noOfZeroes++;
        }
        for (int i = 0; i < n; i++) {
            if (i < noOfZeroes)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
