package Merge_Sort;

import java.util.Scanner;

public class ReversePairs {
    static int count; // Global counter for reverse pairs

    // ----------------- MERGE SORT FUNCTION -----------------
    public void mergesort(int[] arr) {
        int n = arr.length;

        // Base case: If array has only one element, it is already sorted
        if (n == 1)
            return;

        // Create two arrays to hold the two halves
        int[] a = new int[n / 2]; // Left half
        int[] b = new int[n - n / 2]; // Right half

        // Copy first half elements into array 'a'
        for (int i = 0; i < n / 2; i++)
            a[i] = arr[i];

        // Copy second half elements into array 'b'
        for (int i = 0; i < n - n / 2; i++)
            b[i] = arr[i + n / 2];

        // Recursively sort both halves
        mergesort(a);
        mergesort(b);

        // Count the reverse pairs
        Inversion(a, b);

        // Merge the sorted halves back into original array
        merge(a, b, arr);

        // Free memory (optional, handled by Java GC anyway)
        a = null;
        b = null;
    }

    // ---------------- INVERSION COUNT FUNCTION ----------------
    public void Inversion(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if ((long) a[i] > (long) 2 * (long) b[j]) {
                count += (a.length - i);
                j++;
            } else
                i++;
        }
    }

    // ---------------- MERGE FUNCTION ----------------
    public void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];
    }

    // ---------------- DRIVER FUNCTION ----------------
    public int reversePairs(int[] nums) {
        count = 0; // Reset counter
        mergesort(nums); // Apply modified merge sort
        return count; // Return total reverse pairs
    }

    // ---------------- MAIN FUNCTION ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReversePairs obj = new ReversePairs();

        // Input size of array
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print original array
        System.out.print("Original Array: ");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

        // Get reverse pair count
        int ans = obj.reversePairs(arr);

        // Print sorted array (after merge sort)
        System.out.print("Sorted Array:   ");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

        // Print total reverse pairs
        System.out.println("Total Reverse Pairs: " + ans);

        sc.close();
    }
}
