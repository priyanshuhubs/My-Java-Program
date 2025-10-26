// Package name (helps in organizing classes)
package bigining.BinarySearch;

// Class name for solving Lower Bound problem
public class LowerBoundSearch {
    // Main method: execution starts from here
    public static void main(String[] args) {
        int[] arr = { 10, 23, 46, 46, 91, 97, 140, 264 };
        int n = arr.length;
        // Target element for which we want to find lower bound
        int target = 46;
        // Initialize lower bound index as n (default = not found in array)
        int lb = n;
        // Binary search variables
        int low = 0, high = n - 1;
        // Standard binary search loop
        while (low <= high) {
            // Calculate mid index safely
            int mid = low + (high - low) / 2;
            // If arr[mid] >= target, update lower bound
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid); // take the smaller index
                high = mid - 1; // search in left half
            } else {
                low = mid + 1; // search in right half
            }
        }
        // Print lower bound index (if lb == n → no element ≥ target)
        System.out.println("Lower Bound Index = " + lb);
    }
}
