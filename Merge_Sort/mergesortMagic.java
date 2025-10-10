package Merge_Sort;

import java.util.Scanner;

public class mergesortMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int m = sc.nextInt();
        int[] arr = new int[m];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Sorting: ");
        print(arr);
        mergesort(arr);
        System.out.print("After Sorting: ");
        print(arr);
        sc.close();
    }

    // ---------------- MERGE SORT FUNCTION ----------------
    public static void mergesort(int[] arr) {
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

        // Merge the sorted halves back into original array
        merge(a, b, arr);

        // delete a and b to reduce space complexity
        a = null;
        b = null;
    }

    // ---------------- MERGE FUNCTION ----------------
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
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

    // ---------------- PRINT FUNCTION ----------------
    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println(); // newline for better readability
    }
}
