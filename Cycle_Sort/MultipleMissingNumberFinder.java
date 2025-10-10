package Cycle_Sort;

import java.util.*;

public class MultipleMissingNumberFinder {

    // Swap helper
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> missing = new ArrayList<>();
        int n = arr.length;
        int i = 0;

        // Step 1: Place numbers in correct index
        while (i < n) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }

        // Step 2: Collect missing numbers
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                missing.add(i + 1);
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        MultipleMissingNumberFinder sol = new MultipleMissingNumberFinder();
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        List<Integer> result = sol.findDisappearedNumbers(arr);
        System.out.println("Missing Numbers: " + result); // [5, 6]
    }
}
