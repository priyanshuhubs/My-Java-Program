package arrays;

import java.util.Arrays;

public class sort0and1and2 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 2, 0 };
        System.out.println("Original array: " + Arrays.toString(arr));
        int n = arr.length;
        int noOfZeroes = 0, noOfOnes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                noOfZeroes++;
            if (arr[i] == 1)
                noOfOnes++;
        }
        for (int i = 0; i < n; i++) {
            if (i < noOfZeroes)
                arr[i] = 0;
            else if (i < noOfOnes + noOfZeroes)
                arr[i] = 1;
            else
                arr[i] = 2;
        }

        System.out.println("Sorted Arrays: " + Arrays.toString(arr));
    }
}
