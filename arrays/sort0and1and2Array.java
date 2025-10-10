// dutch flag Algorithm
package arrays;

import java.util.Arrays;

public class sort0and1and2Array {
    public static void swap(int[] arr, int mid, int low) {
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 2, 0 };
        System.out.println("Original array: " + Arrays.toString(arr));

        int n = arr.length;
        int mid = 0, hi = n - 1, low = 0;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1)
                mid++;

            else {// arr[mid] == 2
                swap(arr, mid, hi);
                hi--;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
