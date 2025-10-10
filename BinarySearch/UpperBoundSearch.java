// Package name
package BinarySearch;

// Class to find Upper Bound using Binary Search
public class UpperBoundSearch {

    public static void main(String[] args) {

        // Sorted array
        int[] arr = { 10, 23, 46, 46, 91, 97, 140, 264 };

        int n = arr.length;
        int target = 46;

        // Initialize upper bound index as n (default: not found)
        int ub = n;

        int low = 0, high = n - 1;

        // Binary Search loop
        while (low <= high) {

            int mid = low + (high - low) / 2;

            // If arr[mid] > target, update ub
            if (arr[mid] > target) {
                ub = Math.min(ub, mid); // take smaller index
                high = mid - 1; // search in left half
            } else {
                low = mid + 1; // search in right half
            }
        }

        // Print result
        System.out.println("Upper Bound Index = " + ub);
    }
}
