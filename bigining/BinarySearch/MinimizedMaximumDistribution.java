
//*****************leetcode 2064***************************************

package bigining.BinarySearch;

public class MinimizedMaximumDistribution {
    public static void main(String[] args) {
        MinimizedMaximumDistribution mz = new MinimizedMaximumDistribution();
        int[] arr = { 15, 12, 10 };
        int n = 7;
        int result = mz.findMinimizedMaximum(n, arr);
        System.out.println("Minimized Maximum = " + result);
    }

    public int findMinimizedMaximum(int n, int[] arr) {
        int m = arr.length, mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int lo = 1, hi = mx;
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(mid, n, arr)) {
                ans = mid;
                hi = mid - 1;
            } else
                lo = mid + 1;
        }
        return ans;
    }

    public boolean isPossible(int maxQ, int n, int[] arr) {
        int stores = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % maxQ == 0)
                stores += arr[i] / maxQ;
            else
                stores += arr[i] / maxQ + 1;
        }
        if (stores > n)
            return false;
        else
            return true;
    }
}
