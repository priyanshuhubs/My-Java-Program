package Cycle_Sort;

import java.util.Arrays;

class MissingNumberFinder {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == i || arr[i] == n) {
                i++;
            } else {
                swap(arr, i, arr[i]);
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i)
                return i;
        }
        return i; // missing number is n if all others are in place
    }

    public static void main(String[] args) {
        MissingNumberFinder finder = new MissingNumberFinder();
        int[] arr = { 2, 0, 1, 7, 5, 4, 6 };
        System.out.println("Array before missing number check: " + Arrays.toString(arr));
        int missing = finder.missingNumber(arr);
        System.out.println("Missing number is: " + missing);
    }
}
