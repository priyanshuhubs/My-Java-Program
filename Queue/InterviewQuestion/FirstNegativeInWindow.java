//------------------------First negative in every window of size k---------------------------\\
//-------------------------------------------------------------------------------------------\\

package Queue.InterviewQuestion;

import java.util.*;

public class FirstNegativeInWindow {
    static List<Integer> firstNegInt(int arr[], int k) { // changed long[] → int[] for consistency
        int n = arr.length;
        List<Integer> res = new ArrayList<>(); // changed from array to List
        Queue<Integer> q = new LinkedList<>();

        // Add indices of negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        // Sliding window traversal
        for (int i = 0; i < n-k+1; i++) {
            if(!q.isEmpty() && q.peek()<i) q.remove();
            if(!q.isEmpty() && q.peek()<=i+k-1) 
            res.add(arr[q.peek()]);
            else res.add(0);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;

        List<Integer> ans = firstNegInt(arr, k);
        System.out.println("First negative in every window of size " + k + " : " + ans);
    }
}
