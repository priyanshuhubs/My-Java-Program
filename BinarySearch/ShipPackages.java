package BinarySearch;

public class ShipPackages {

    // Function to check if it is possible to ship all packages
    // within 'd' days given a capacity 'c'
    public boolean isPossible(int c, int[] arr, int d) {
        int n = arr.length;
        int load = 0; // current load on ship
        int days = 1; // start with day 1

        for (int i = 0; i < n; i++) {
            // if current package can be added in current load
            if (load + arr[i] <= c) {
                load += arr[i];
            } else {
                // otherwise assign new day
                load = arr[i];
                days++;
            }
        }

        // If days used are more than allowed, return false
        if (days > d)
            return false;
        else
            return true;
    }

    // Function to find the minimum capacity required
    public int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int sum = 0, mx = Integer.MIN_VALUE;

        // calculate total sum of weights and max element
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, arr[i]);
            sum += arr[i];
        }

        int lo = mx, hi = sum, minC = sum;

        // Binary Search on answer (capacity)
        while (lo <= hi) { // Time Complexity = O(n * log(sum - mx))
            int mid = lo + (hi - lo) / 2;

            if (isPossible(mid, arr, d) == true) {
                minC = mid; // store the minimum capacity
                hi = mid - 1; // try for smaller capacity
            } else {
                lo = mid + 1; // need more capacity
            }
        }
        return minC;
    }

    // Main function for testing
    public static void main(String[] args) {
        ShipPackages sol = new ShipPackages();

        // Example input
        int[] arr = { 3, 2, 2, 4, 1, 4 };
        int d = 3;

        // Calling function
        int result = sol.shipWithinDays(arr, d);

        // Printing output
        System.out.println("Minimum Capacity Required = " + result);
    }
}
