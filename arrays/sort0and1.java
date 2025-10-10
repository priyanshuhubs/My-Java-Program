package arrays;

import java.util.Arrays;

public class sort0and1 {
    public static void swap(int[] arr, int i, int j) {
        arr[i] = 0;
        arr[j] = 1;
        i++;
        j--;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0, 0, 1, 1, 1 };

        System.out.println("Original array: " + Arrays.toString(arr));
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0)
                i++;
            if (arr[j] == 1)
                j--;
            if (i < j && arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
            }
        }
        System.out.println("Sorted Arrays: " + Arrays.toString(arr));
    }
}
